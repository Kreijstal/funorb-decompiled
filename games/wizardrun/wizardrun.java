/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public final class wizardrun extends GameShell {
    private static Sprite[] numberSprites;
    private int field_Q;
    static byte[] field_O;
    private int field_I;
    private int field_M;
    private int field_R;
    private int field_S;
    private int field_N;
    static int field_E;
    static String field_F;
    static java.awt.Canvas field_G;
    static volatile int pointerX;
    private boolean field_J;
    private int field_K;
    private boolean field_P;
    private boolean field_L;
    public static int field_H;

    private final void loadGameResources(boolean param0, int param1) {
        int var6_int = 0;
        int var8 = 0;
        Sprite var4;
        int var5_int;
        Object var5;
        Object var6;
        int var7_int;
        GridPoint var7;
        int var9;
        PcmResampler var10;
        SoundCache var11;
        Sprite var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        SoundCache var18;
        int var5_intLifetime1;
        int var7_intLifetime1;
        var9 = field_H;
        IntrusiveNodeHashTable.a((byte) -69);
        if (param0) {
          QuickChatPhraseDefinition.a(0, LoginPacketBuilder.field_c);
        }
        if (SingleChildWidget.field_E.ensureIndex(17820) &&
          SingleChildWidget.field_E.areAllGroupsAvailable(-56)) {
          if (AccountProgressDialog.field_jb.ensureIndex(17820) &&
            AccountProgressDialog.field_jb.areAllGroupsAvailable(param1 ^ -94)) {
            if (SingleChildWidget.soundArchive.ensureIndex(17820) &&
              SingleChildWidget.soundArchive.areAllGroupsAvailable(-110)) {
              if (SpriteButtonPainter.bossSoundArchive.ensureIndex(17820) &&
                SpriteButtonPainter.bossSoundArchive.areAllGroupsAvailable(-85)) {
                if (PlatformActor.field_u.ensureIndex(param1 ^ 17842) &&
                  PlatformActor.field_u.areAllGroupsAvailable(-67)) {
                  if (TickClock.field_b.ensureIndex(17820) &&
                    TickClock.field_b.areAllGroupsAvailable(83)) {
                    if (UsernameLoginCredentials.field_h.ensureIndex(17820) &&
                      UsernameLoginCredentials.field_h.ensureNamedGroupLoaded((byte) 29, "basic")) {
                      if (RankingWorkspaceHelpers.field_a.ensureIndex(param1 ^ 17842) &&
                        RankingWorkspaceHelpers.field_a.areAllGroupsAvailable(-85)) {
                        ValidationState.showLoadingProgress(AlternateUsernameLoginCredentials.field_o, 100.0f, 0);
                        if (!param0) {
                          return;
                        }
                        WrappedTextLayout.a((byte) 79);
                        this.f(-98);
                        FlatTriangleRasterizer.font12 = IsaacRandom.loadFont(800863586, "", SingleChildWidget.field_E, "b12", RankingWorkspaceHelpers.field_a);
                        IndexedSpriteArrayFactory.wizardFont = IsaacRandom.loadFont(800863586, "", SingleChildWidget.field_E, "wizfont", RankingWorkspaceHelpers.field_a);
                        GameGraphicsResources.wizardFont2 = IsaacRandom.loadFont(param1 + 800863540, "", SingleChildWidget.field_E, "wizfont2", RankingWorkspaceHelpers.field_a);
                        TextPositionHelpers.field_b = new Sprite[16];
                        RankingWorkspaceHelpers.field_a = null;
                        numberSprites = WidgetContainer.loadSpriteStrip("", SingleChildWidget.field_E, "numbers", param1 + 45);
                        GameGraphicsResources.gemSprites = WidgetContainer.loadSpriteStrip("", SingleChildWidget.field_E, "gems", 114);
                        CoverageFontLoader.field_c = WidgetContainer.loadSpriteStrip("", SingleChildWidget.field_E, "playerintro", 117);
                        FullscreenFailureKind.field_a = WidgetContainer.loadSpriteStrip("", SingleChildWidget.field_E, "highwizard", 100);
                        BrowserUrlLauncher.field_b = FullscreenFailureDialog.loadSprite(15, "benefits", SingleChildWidget.field_E, "");
                        BrowserCookieHelpers.field_b = WidgetContainer.loadSpriteStrip("", SingleChildWidget.field_E, "screenshots", 87);
                        var12 = FullscreenFailureDialog.loadSprite(15, "gamelogo", SingleChildWidget.field_E, "");
                        var4 = FullscreenFailureDialog.loadSprite(15, "mbstar", SingleChildWidget.field_E, "");
                        ArchiveLoadingPlan.setMembershipOffer(-1, MidiNote.field_u, BrowserUrlLauncher.field_b);
                        ReflectionCheck.setMembershipOfferIcon(var12, false);
                        HyperlinkPainter.a(0, var4, var4.fullWidth, 0, 2500, 0, 2, var4.fullHeight, 0);
                        FullscreenFocusCanvas.setMembershipSlides(true, BrowserCookieHelpers.field_b);
                        ClientShutdownHelpers.configureMembershipOffers((java.applet.Applet) (this), ValidationHelpWidget.field_O, 0, 34, 16777215, 255);
                        TickClock.field_c = null;
                        IntHashTable.field_a = FullscreenFailureDialog.loadSprite(param1 - 31, "paused", SingleChildWidget.field_E, "");
                        ValidationState.selectStarSprites[0] = FullscreenFailureDialog.loadSprite(15, "selstar", SingleChildWidget.field_E, "");
                        ValidationState.selectStarSprites[1] = FullscreenFailureDialog.loadSprite(15, "selstar2", SingleChildWidget.field_E, "");
                        ValidationState.selectStarSprites[2] = FullscreenFailureDialog.loadSprite(15, "selstar3", SingleChildWidget.field_E, "");
                        FullscreenFailureDialog.loadSprite(15, "gameover", SingleChildWidget.field_E, "");
                        IsaacPacketBuffer.field_s = FullscreenFailureDialog.loadSprite(15, "bosshealth2", SingleChildWidget.field_E, "");
                        ErrorReportingHelpers.wizardSprites = WidgetContainer.loadSpriteStrip("", SingleChildWidget.field_E, "wizard", 95);
                        AchievementUnlock.wizardNoHatSprites = WidgetContainer.loadSpriteStrip("", SingleChildWidget.field_E, "wizardnohat", param1 + 42);
                        DualLinkNode.field_m = FullscreenFailureDialog.loadSprite(param1 ^ 33, "explosion", SingleChildWidget.field_E, "");
                        FullscreenFocusCanvas.field_a = WidgetContainer.loadSpriteStrip("", SingleChildWidget.field_E, "achievements", 108);
                        DiskCacheRequest.field_z = FullscreenFailureDialog.loadSprite(15, "unachieved", UsernameLoginCredentials.field_h, "basic");
                        ChatMessage.field_f = FullscreenFailureDialog.loadSprite(15, "orbcoin", UsernameLoginCredentials.field_h, "basic");
                        BrowserCookieHelpers.field_c = FullscreenFailureDialog.loadSprite(15, "locked", UsernameLoginCredentials.field_h, "basic");
                        NameCheckProgressDialog.field_Bb = new Sprite[5];
                        NameCheckProgressDialog.field_Bb[0] = FullscreenFailureDialog.loadSprite(15, "highscore", SingleChildWidget.field_E, "");
                        NameCheckProgressDialog.field_Bb[1] = FullscreenFailureDialog.loadSprite(15, "highscorebar", SingleChildWidget.field_E, "");
                        NameCheckProgressDialog.field_Bb[2] = FullscreenFailureDialog.loadSprite(param1 - 31, "stage", SingleChildWidget.field_E, "");
                        NameCheckProgressDialog.field_Bb[3] = FullscreenFailureDialog.loadSprite(DiskCacheStore.xor(param1, 33), "score", SingleChildWidget.field_E, "");
                        NameCheckProgressDialog.field_Bb[4] = numberSprites[10];
                        DropTargetWidget.frameSprites = WidgetContainer.loadSpriteStrip("", SingleChildWidget.field_E, "frame", 91);
                        LoginForm.field_E = WidgetContainer.loadSpriteStrip("", SingleChildWidget.field_E, "buttonframe", 119);
                        GridPoint.field_c = new Sprite(32, 32);
                        GridPoint.field_c.bindAsRasterTarget();
                        ErrorReportingHelpers.wizardSprites[6].drawWithOffsets(-18, -18);
                        ArchiveProvider.field_b.bindRasterTarget(68);
                        LogoAnimationLoader.field_b = new Sprite(64, 64);
                        LogoAnimationLoader.field_b.bindAsRasterTarget();
                        SoftwareRasterizer.fillCircle(32, 32, 30, 16777215);
                        ArchiveProvider.field_b.bindRasterTarget(param1 + 17);
                        ContentTransitionDialog.field_bb = ErrorReportingHelpers.wizardSprites[1];
                        MusicPatchLoader.field_d = FullscreenFailureDialog.loadSprite(param1 - 31, "selector", SingleChildWidget.field_E, "");
                        GameShell.field_x = FullscreenFailureDialog.loadSprite(param1 - 31, "bosshealth", SingleChildWidget.field_E, "");
                        SpriteButtonPainter.field_w = FullscreenFailureDialog.loadSprite(param1 - 31, "title", SingleChildWidget.field_E, "");
                        NodeHashTableIterator.field_d = FullscreenFailureDialog.loadSprite(15, "highscorescreen", SingleChildWidget.field_E, "");
                        ValidationHelpWidget.field_M = FullscreenFailureDialog.loadSprite(param1 ^ 33, "achievementscreen", SingleChildWidget.field_E, "");
                        AudioServiceThread.field_b = FullscreenFailureDialog.loadSprite(param1 ^ 33, "controlscreen", SingleChildWidget.field_E, "");
                        AudioServiceThread.field_b.bindAsRasterTarget();
                        var5_int = param1;
                        var13 = WeightedLruCache.formatPlaceholders(new String[]{IntrusiveNode.field_h[SpriteTextStyle.field_S], IntrusiveNode.field_h[AccountFormTextHelpers.field_d]}, (byte) 112, EditableTextWidget.field_P);
                        this.drawBorderedText(param1 ^ -12884, var13, 15583488, GameGraphicsResources.wizardFont2.stringWidth(var13) / 2 + 165, 180 + var5_int);
                        var14 = WeightedLruCache.formatPlaceholders(new String[]{IntrusiveNode.field_h[SpriteTextStyle.field_S], IntrusiveNode.field_h[AccountFormTextHelpers.field_d]}, (byte) 49, NineSliceFrame.field_a);
                        this.drawBorderedText(-12926, var14, 15583488, GameGraphicsResources.wizardFont2.stringWidth(var14) / 2 + 165, var5_int * 2 + 180);
                        var15 = WeightedLruCache.formatPlaceholders(new String[]{IntrusiveNode.field_h[SpriteTextStyle.field_S], IntrusiveNode.field_h[AccountFormTextHelpers.field_d]}, (byte) 94, SystemMemoryHelpers.field_e);
                        this.drawBorderedText(-12926, var15, 15583488, 165 + GameGraphicsResources.wizardFont2.stringWidth(var15) / 2, 180 + 3 * var5_int);
                        var16 = WeightedLruCache.formatPlaceholders(new String[]{IntrusiveNode.field_h[SpriteTextStyle.field_S], IntrusiveNode.field_h[AccountFormTextHelpers.field_d]}, (byte) 124, IntrusiveDeque.field_d);
                        this.drawBorderedText(-12926, var16, 15583488, GameGraphicsResources.wizardFont2.stringWidth(var16) / 2 + 165, -15 + var5_int * 4 + 180);
                        var17 = WeightedLruCache.formatPlaceholders(new String[]{IntrusiveNode.field_h[SpriteTextStyle.field_S], IntrusiveNode.field_h[AccountFormTextHelpers.field_d]}, (byte) 97, DiskCacheRequest.field_C);
                        this.drawBorderedText(-12926, var17, 15583488, GameGraphicsResources.wizardFont2.stringWidth(var17) / 2 + 165, 5 * var5_int + 180);
                        ArchiveProvider.field_b.bindRasterTarget(106);
                        StandardContentTransitionDialog.field_jb = FullscreenFailureDialog.loadSprite(15, "optionscreen", SingleChildWidget.field_E, "");
                        UiSpriteThemeHelpers.field_b = FullscreenFailureDialog.loadSprite(param1 - 31, "endscreen", SingleChildWidget.field_E, "");
                        RadixParsingHelpers.a(240, GameGraphicsResources.wizardFont2, DropTargetWidget.frameSprites, (byte) -113, DropTargetWidget.frameSprites, 16777215, 16777088, 12, 12, 16776960, 320, 12, DropTargetWidget.frameSprites, 12, 12);
                        RadialSelectorWidget.a((byte) -94);
                        MidiPcmStream.field_T = new byte[6][6][];
                        SingleChildWidget.field_E = null;
                        for (var5_intLifetime1 = 0; var5_intLifetime1 <= 5; var5_intLifetime1++) {
                          for (var6_int = 0; var6_int <= 5; var6_int++) {
                            MidiPcmStream.field_T[var5_intLifetime1][var6_int] = AccountProgressDialog.field_jb.getNamedFile(52, "level" + var5_intLifetime1 + var6_int + ".dat", "");
                          }
                        }
                        AccountProgressDialog.field_jb = null;
                        var10 = new PcmResampler(22050, AudioOutput.field_l);
                        BufferedRandomAccessFile.soundEffects[0] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "spell").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[1] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "spell2").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[2] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "bubblefire").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[3] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "jump").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[4] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "land").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[5] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "bigthud").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[6] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "bubblepop").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[7] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "gotgem2").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[10] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "enemyhit").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[11] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "shield").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[12] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "slimesplit").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[13] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "zapshot").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[14] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "fireball").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[15] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "alljump").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[16] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "stars").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[23] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "spell_higher").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[24] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "spell_highest").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[0] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "intro_bird_squawk").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[1] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "end_cage_release").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[2] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "end_cage_smash").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[3] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "rat_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[4] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "wasp_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[5] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "spider_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[6] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "spider_boss_land").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[7] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "spider_boss_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[8] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "small_crab_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[9] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "crab_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[10] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "seagull_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[11] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "cannibal_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[15] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "green_bird_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[16] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "ghost_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[17] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "ghost_spit").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[18] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "skeleton_cannon_fire").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[22] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "venus_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[23] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "bat_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[25] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "ogre_boss_rock").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[32] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "fireimp_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[35] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "harpie_death").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[36] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "dark_knight_attack").toPcmSample().resample(var10);
                        SpriteState.secondarySoundEffects[37] = SoundEffect.loadNamed(SingleChildWidget.soundArchive, "", "dark_knight_death").toPcmSample().resample(var10);
                        BufferedRandomAccessFile.soundEffects[8] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "wizard_ooh").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[9] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "enemyeek").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[17] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "lizard_boss").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[18] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "hissing").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[19] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "vampire_laugh").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[20] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "ogre_boss").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[21] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "dragon_boss").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[22] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "demon_boss").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[25] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "spiderhit").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[26] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "ogrehit").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[27] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "dragonhit").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[28] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "demonhit").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[29] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "vampirehit").decodeAllToPcm().resample(var10);
                        BufferedRandomAccessFile.soundEffects[30] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "spiderboss").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[13] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "voodoo_boss_death").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[19] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "skeleton_cannon_death").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[21] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "pirate_boss_death").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[26] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "ogre_boss_death").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[27] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "cyclops_death").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[29] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "yeti_death").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[30] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "dragon_death").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[31] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "ice_dragon_boss_death").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[33] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "city_guard_death").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[34] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "executioner_death").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[12] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "voodoo_boss_attack").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[14] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "skeleton_death").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[24] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "goblin_death").decodeAllToPcm().resample(var10);
                        SpriteState.secondarySoundEffects[28] = VorbisSample.loadNamed(SpriteButtonPainter.bossSoundArchive, "", "horned_demon_death").decodeAllToPcm().resample(var10);
                        var5 = null;
                        DraggableWidget.field_G = MidiTrack.loadNamedTrack(TickClock.field_b, "", "wizard_run_forest");
                        EmailLoginCredentials.field_l = MidiTrack.loadNamedTrack(TickClock.field_b, "", "wizard_run_swamp");
                        ArchiveRequest.field_u = MidiTrack.loadNamedTrack(TickClock.field_b, "", "wizard_run_caves");
                        AccountFormText.field_b = MidiTrack.loadNamedTrack(TickClock.field_b, "", "wizard_run_mountains");
                        PacketBuffer.field_j = MidiTrack.loadNamedTrack(TickClock.field_b, "", "wizard_run_volcano");
                        LogoAnimationLoader.field_d = MidiTrack.loadNamedTrack(TickClock.field_b, "", "wizard_run_lair");
                        SettingsCookieReader.field_a = MidiTrack.loadNamedTrack(TickClock.field_b, "", "wizard_run_boss");
                        DirectByteStorage.field_j = MidiTrack.loadNamedTrack(TickClock.field_b, "", "wizard_run_intro");
                        QuickChatDynamicCommand.field_e = MidiTrack.loadNamedTrack(TickClock.field_b, "", "wizard_run_cutscene");
                        NineSliceFrame.field_e = MidiTrack.loadNamedTrack(TickClock.field_b, "", "wizard_run_endscene");
                        TickClock.field_b = null;
                        SocketJs5Transport.musicTracks = new MidiTrack[7];
                        SocketJs5Transport.musicTracks[3] = AccountFormText.field_b;
                        SocketJs5Transport.musicTracks[5] = LogoAnimationLoader.field_d;
                        SocketJs5Transport.musicTracks[4] = PacketBuffer.field_j;
                        SocketJs5Transport.musicTracks[2] = ArchiveRequest.field_u;
                        SocketJs5Transport.musicTracks[6] = DirectByteStorage.field_j;
                        SocketJs5Transport.musicTracks[0] = DraggableWidget.field_G;
                        SocketJs5Transport.musicTracks[1] = EmailLoginCredentials.field_l;
                        var11 = new SoundCache(SingleChildWidget.soundArchive, SpriteButtonPainter.bossSoundArchive);
                        var18 = var11;
                        SingleChildWidget.soundArchive = null;
                        SpriteButtonPainter.bossSoundArchive = null;
                        for (var7_int = 0; 7 > var7_int; var7_int++) {
                          SingleChildWidget.field_D.loadTrackInstruments(PlatformActor.field_u, -1, var11, SocketJs5Transport.musicTracks[var7_int], 0);
                        }
                        SingleChildWidget.field_D.loadTrackInstruments(PlatformActor.field_u, -1, var18, QuickChatDynamicCommand.field_e, 0);
                        SingleChildWidget.field_D.loadTrackInstruments(PlatformActor.field_u, -1, var18, NineSliceFrame.field_e, 0);
                        SingleChildWidget.field_D.loadTrackInstruments(PlatformActor.field_u, param1 ^ -47, var18, SettingsCookieReader.field_a, 0);
                        SingleChildWidget.field_D.clearPatchSampleIds(true);
                        PlatformActor.field_u = null;
                        var6 = null;
                        for (var7_intLifetime1 = 0; var7_intLifetime1 < 1000; var7_intLifetime1++) {
                          NameAvailabilityFactory.field_e[var7_intLifetime1] = new PlatformActor();
                        }
                        DialogLayer.field_K = 1;
                        DiskCacheWorker.field_e = 500;
                        var7 = new GridPoint();
                        NetworkArchiveRequest.field_x = 0;
                        var7.row = 1;
                        var7.column = 3;
                        FadingDialog.field_I = 0;
                        ProgressQuery.field_m = new FriendsListState();
                        QuickChatPhraseRepository.setTickRate((byte) 91, 50);
                        MidiNote.selectLevelMusic((byte) -74);
                        IntegerSyntaxHelpers.field_e = SocketJs5Transport.musicTracks[6];
                        SingleChildWidget.field_D.setMasterVolume(-1, ConfirmedEmailValidator.field_o);
                        if (FriendOrderingHelpers.field_e) {
                          SingleChildWidget.field_D.startTrack(true, param1 ^ -72, IntegerSyntaxHelpers.field_e);
                        }
                        for (var8 = 0; var8 < 300; var8++) {
                          SavedDataRequest.level.field_j[var8] = 0;
                          SavedDataRequest.level.field_f[var8] = 0;
                          SavedDataRequest.level.field_d[var8] = false;
                          SavedDataRequest.level.field_a[var8] = 0;
                        }
                        DualLinkDeque.resourcesLoaded = true;
                        EmailCheckRequest.field_h = 0;
                        HighscorePlayer.field_e = SpriteButtonPainter.field_w;
                        TickClock.field_a = new int[100][3];
                        GameGraphicsResources.b(0);
                        return;
                      }
                      ValidationState.showLoadingProgress(SecondaryNodeDeque.formatArchiveLoadStatus(-40, ThrowableFormattingHelpers.field_d, RankingWorkspaceHelpers.field_a, IndexedSpriteArrayFactory.field_d), 95.0f, 0);
                      return;
                    }
                    ValidationState.showLoadingProgress(SpriteFilterHelpers.a(FramedButtonPainter.field_q, HyperlinkPainter.field_e, UsernameLoginCredentials.field_h, param1 ^ -90, "basic"), 85.0f, param1 ^ 46);
                    return;
                  }
                  ValidationState.showLoadingProgress(SecondaryNodeDeque.formatArchiveLoadStatus(-40, ByteArrayPool.field_e, TickClock.field_b, FriendLookupState.field_d), 80.0f, 0);
                  return;
                }
                ValidationState.showLoadingProgress(SecondaryNodeDeque.formatArchiveLoadStatus(-40, EncryptedLoginHelpers.field_d, PlatformActor.field_u, IndexedSpriteState.field_g), 70.0f, 0);
                return;
              }
              ValidationState.showLoadingProgress(SecondaryNodeDeque.formatArchiveLoadStatus(-40, MenuController.field_i, SpriteButtonPainter.bossSoundArchive, RadixParsingHelpers.field_d), 60.0f, 0);
              return;
            }
            ValidationState.showLoadingProgress(SecondaryNodeDeque.formatArchiveLoadStatus(-40, MenuController.field_i, SingleChildWidget.soundArchive, RadixParsingHelpers.field_d), 50.0f, param1 - 46);
            return;
          }
          ValidationState.showLoadingProgress(SecondaryNodeDeque.formatArchiveLoadStatus(-40, WhirlpoolHasher.field_e, AccountProgressDialog.field_jb, FriendEntry.field_gb), 40.0f, 0);
          return;
        }
        ValidationState.showLoadingProgress(SecondaryNodeDeque.formatArchiveLoadStatus(-40, HyperlinkPainter.field_e, SingleChildWidget.field_E, FramedButtonPainter.field_q), 30.0f, param1 ^ 46);
    }

    private final void s(int param0) {
        boolean stackIn_6_1 = false;
        if (5 < HuffmanDecoder.field_c) {
          BufferedSocket.field_c = BufferedSocket.field_c - HuffmanDecoder.field_c;
          LoadingMessageHelpers.field_f = LoadingMessageHelpers.field_f - 5;
          HuffmanDecoder.field_c = 5;
        }
        GameApplet.a(7775, 64 * DiskCacheStore.field_f + (HuffmanDecoder.field_c + 6 * GridActor.field_l));
        AccountConnectionState.field_a = 0;
        EmailCheckRequest.field_h = 2;
        stackIn_6_1 = !(0 >= ArchiveProvider.field_a);
        this.field_J = stackIn_6_1;
        ProgressRefreshState.field_b = 0;
        SavedDataRequest.field_j = false;
        HighscorePlayer.field_e = NodeHashTableIterator.field_d;
        if (0 < AgeValidator.field_l) {
          EmailCheckRequest.field_h = 5;
          HighscorePlayer.field_e = ValidationHelpWidget.field_M;
        }
        IntegerSyntaxHelpers.field_e = DraggableWidget.field_G;
        if (param0 != 208) {
          return;
        }
        DisplayNameSyntaxHelpers.field_a = 500;
        if (ThreePieceFrameHelpers.a(-96)) {
          EmailCheckRequest.field_h = 6;
        }
        if (DiskCacheStore.field_f == 0 &&
          AgeValidator.field_l == 0 &&
          PasswordFieldPainter.field_u.isEmpty(8192)) {
          EmailCheckRequest.field_h = 0;
          this.field_J = true;
          BufferedSocket.field_a = -350;
        }
        if (!ThreePieceFrameHelpers.a(-90)) {
          BufferedSocket.field_c = BufferedSocket.field_c - (HuffmanDecoder.field_c - 6);
          HighscorePlayer.field_b = HighscorePlayer.field_b - (DiskCacheStore.field_f << 6);
          LoadingMessageHelpers.field_f = LoadingMessageHelpers.field_f + (GridActor.field_l * 6 + 6);
          GridActor.field_l = -1;
          DiskCacheStore.field_f = 0;
          HuffmanDecoder.field_c = 6;
        }
        BufferedSocket.field_c = BufferedSocket.field_c + GridActor.field_g;
        HighscorePlayer.field_b = HighscorePlayer.field_b - 5;
        WidgetTheme.field_k = 0;
        IntegerSyntaxHelpers.field_e = SocketJs5Transport.musicTracks[6];
        DialogLayer.field_K = 1;
        DiskCacheWorker.field_e = 500;
        GridActor.field_g = 5;
        if (FriendOrderingHelpers.field_e) {
          SingleChildWidget.field_D.startTrack(true, param0 - 314, IntegerSyntaxHelpers.field_e);
        }
        FadingDialog.field_I = 255;
        BufferedSocket.field_a = -350;
    }

    final void i(int param0) {
        int stackIn_6_1 = 0;
        boolean stackIn_7_2 = false;
        int stackIn_23_1 = 0;
        boolean stackIn_24_2 = false;
        int var2;
        int var3;
        int var4;
        ProgressSubmission var5;
        AchievementSubmission var6;
        int var2Lifetime1;
        var4 = field_H;
        NodeHashTableIterator.field_k.service();
        Js5Index.field_d.service();
        if (null != LoginChoicePanel.field_E &&
          LoginChoicePanel.field_E.field_b) {
          WeightedLruCache.exitFullscreen((byte) 60);
          UsernameLoginCredentials.b((byte) -100);
        }
        stackIn_6_1 = -4114;
        stackIn_7_2 = (null != LoginChoicePanel.field_E);
        this.c(stackIn_6_1, stackIn_7_2);
        if (HighscorePlayerState.field_c) {
          this.openResourceArchives(-51);
          HighscorePlayerState.field_c = false;
        }
        if (MouseWheelInput.a((byte) 60)) {
          this.d((byte) -122);
          if (!DualLinkDeque.resourcesLoaded &&
            GameMenu.a((byte) 123)) {
            this.loadGameResources(false, 46);
          }
          if (MouseWheelInput.a((byte) 60)) {
            return;
          }
        }
        if (DualLinkDeque.resourcesLoaded) {
          if (!ImageProducerRasterBuffer.c((byte) 54)) {
            ConfirmedEmailValidator.refreshPlayerProgress(true);
          } else {
            if (StringPaddingHelpers.isMenuScreenActive(-25231)) {
              var2 = AchievementSubmission.d((byte) -48);
              if (var2 == 2) {
                WeightedLruCache.exitFullscreen((byte) 60);
              } else {
                if (3 != var2) {
                  if (4 == var2) {
                    ContentTransitionDialog.h((byte) 107);
                  }
                } else {
                  DropTargetWidget.a(true, false);
                }
              }
            } else {
              if (!ArchiveContainerHelpers.b(-76)) {
                this.updateGameState(640);
              } else {
                stackIn_23_1 = 39;
                stackIn_24_2 = (null != LoginChoicePanel.field_E);
                var2 = this.a((byte) stackIn_23_1, stackIn_24_2);
                if (var2 == 1 ||
                  var2 == 2) {
                  WeightedLruCache.exitFullscreen((byte) 60);
                  if (var2 == 2) {
                    RankingWorkspaceHelpers.openQuitPage(127, DisplayNameValidator.getActiveApplet(1));
                  }
                }
              }
            }
          }
        } else {
          this.loadGameResources(true, 46);
        }
        if (!ThreePieceFrameHelpers.a(-81)) {
          while (true) {
            var6 = (AchievementSubmission) (SavedDataSubmission.field_l.removeFirst(114));
            if (var6 != null) {
              ConfirmedEmailValidator.submitAchievement(var6, false, 4);
              continue;
            }
            break;
          }
          while (true) {
            var5 = (ProgressSubmission) (PasswordFieldPainter.field_u.removeFirst(109));
            if (var5 == null) {
              break;
            }
            ArchiveRequest.submitProgress(var5, 5, -1);
          }
        }
        var2Lifetime1 = 40 / ((-56 - param0) / 41);
        while (UiWidget.a(0, ValidationIndicator.field_G)) {
          this.b(true);
        }
        PasswordContentHelpers.flushAccountPackets((byte) -67, 0);
        if (MusicPatch.isGuestSessionActive(true)) {
          var3 = this.o(-10618);
          if (var3 == 2) {
            RankingStatsDecoder.a((byte) -124);
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        boolean stackIn_51_0 = false;
        boolean stackIn_56_0 = false;
        int stackIn_86_0 = 0;
        int stackIn_87_1 = 0;
        boolean stackIn_99_0 = false;
        int stackIn_108_0 = 0;
        int stackIn_109_1 = 0;
        int var4;
        int var5;
        int var6;
        var6 = field_H;
        if (EncryptedLoginHelpers.field_c > 0) {
          return;
        }
        if (param1 == 2 &&
          param2 != 2 &&
          param2 != 3) {
          param1 = 0;
        }
        regionExit1: {
          var4 = 43 % ((-44 - param0) / 58);
          var5 = param2;
          if (var5 != 0) {
            if (1 != var5) {
              if (var5 != 2) {
                if (3 != var5) {
                  switch (var5) {
                    case 4:
                      if (param1 != 0) {
                        break regionExit1;
                      }
                      if (null == LoginChoicePanel.field_E) {
                        DropTargetWidget.a(false, false);
                        break regionExit1;
                      }
                      WeightedLruCache.exitFullscreen((byte) 60);
                      break regionExit1;
                    case 5:
                      if (param1 != 0) {
                        break regionExit1;
                      }
                      DualLinkDeque.field_i = 3;
                      EncryptedLoginHelpers.field_c = 32;
                      if (!ReflectionCheck.field_s) {
                        break regionExit1;
                      }
                      FriendOrderingHelpers.field_a.addSample(BufferedRandomAccessFile.soundEffects[0], 100, 256 * StyleNode.field_p / 100);
                      break regionExit1;
                    case 6:
                      if (param1 != 0) {
                        break regionExit1;
                      }
                      DualLinkDeque.field_i = 4;
                      EncryptedLoginHelpers.field_c = 32;
                      if (!ReflectionCheck.field_s) {
                        break regionExit1;
                      }
                      FriendOrderingHelpers.field_a.addSample(BufferedRandomAccessFile.soundEffects[0], 100, StyleNode.field_p * 256 / 100);
                      break regionExit1;
                    default:
                      break regionExit1;
                    case 7:
                      if (param1 != 0) {
                        break regionExit1;
                      }
                      if (ReflectionCheck.field_s) {
                        FriendOrderingHelpers.field_a.addSample(BufferedRandomAccessFile.soundEffects[0], 100, StyleNode.field_p * 256 / 100);
                      }
                      RankingWorkspaceHelpers.openQuitPage(124, DisplayNameValidator.getActiveApplet(1));
                      break regionExit1;
                  }
                }
                if (-1 == param1) {
                  param1 = -25;
                }
                if (param1 == 1) {
                  param1 = 25;
                }
                if (param1 == -3) {
                  param1 = -200;
                }
                if (3 == param1) {
                  param1 = 200;
                }
                boolean decompiledFrameRemainder1 = true;
                if (param1 == 2) {
                  if (AchievementSubmission.field_n >= 144 &&
                    FriendOrderingHelpers.field_e) {
                    param1 = 0;
                    if (AchievementSubmission.field_n < (168 + 108 * ConfirmedEmailValidator.field_o / 200)) {
                      param1 = 200 * (AchievementSubmission.field_n - (ConfirmedEmailValidator.field_o * 108 / 200 + 172)) / 108;
                    }
                    if (!(AchievementSubmission.field_n <= 172 + 108 * ConfirmedEmailValidator.field_o / 200 + 4)) {
                      param1 = 200 * (-(ConfirmedEmailValidator.field_o * 108 / 200) - 172 + AchievementSubmission.field_n) / 108;
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    stackIn_99_0 = !(FriendOrderingHelpers.field_e);
                    if (!stackIn_99_0) {
                      FriendOrderingHelpers.field_e = false;
                      SingleChildWidget.field_D.stopPlayback(-89);
                    } else {
                      FriendOrderingHelpers.field_e = true;
                      SingleChildWidget.field_D.startTrack(true, -93, IntegerSyntaxHelpers.field_e);
                    }
                    param1 = 0;
                  }
                } else {
                  if (param1 == 0) {
                    stackIn_86_0 = 0;
                    if (FriendOrderingHelpers.field_e) {
                      stackIn_87_1 = 0;
                    } else {
                      stackIn_87_1 = 1;
                    }
                    if (stackIn_86_0 != stackIn_87_1) {
                      FriendOrderingHelpers.field_e = true;
                      SingleChildWidget.field_D.startTrack(true, -85, IntegerSyntaxHelpers.field_e);
                    } else {
                      FriendOrderingHelpers.field_e = false;
                      SingleChildWidget.field_D.stopPlayback(-38);
                    }
                  }
                }
                if (param1 <= -1) {
                  ConfirmedEmailValidator.field_o = ConfirmedEmailValidator.field_o + param1;
                  if (ConfirmedEmailValidator.field_o > 0) {
                    SingleChildWidget.field_D.setMasterVolume(-1, ConfirmedEmailValidator.field_o);
                  } else {
                    ConfirmedEmailValidator.field_o = 0;
                    stackIn_108_0 = 0;
                    if (FriendOrderingHelpers.field_e) {
                      stackIn_109_1 = 0;
                    } else {
                      stackIn_109_1 = 1;
                    }
                    if (stackIn_108_0 == stackIn_109_1) {
                      FriendOrderingHelpers.field_e = false;
                      SingleChildWidget.field_D.stopPlayback(-104);
                    }
                  }
                }
                if (param1 >= 1) {
                  ConfirmedEmailValidator.field_o = ConfirmedEmailValidator.field_o + param1;
                  if (ConfirmedEmailValidator.field_o > 200) {
                    ConfirmedEmailValidator.field_o = 200;
                  }
                  SingleChildWidget.field_D.setMasterVolume(-1, ConfirmedEmailValidator.field_o);
                  if (!FriendOrderingHelpers.field_e) {
                    FriendOrderingHelpers.field_e = true;
                    SingleChildWidget.field_D.startTrack(true, -120, IntegerSyntaxHelpers.field_e);
                  }
                }
                if (ReflectionCheck.field_s) {
                  if (SpriteState.field_y <= 0) {
                    FriendOrderingHelpers.field_a.addSample(BufferedRandomAccessFile.soundEffects[0], 100, StyleNode.field_p * 256 / 100);
                    SpriteState.field_y = 25;
                  }
                  return;
                }
              } else {
                if (param1 == -1) {
                  param1 = -13;
                }
                if (param1 == 1) {
                  param1 = 13;
                }
                if (param1 == -3) {
                  param1 = -104;
                }
                if (3 == param1) {
                  param1 = 104;
                }
                boolean decompiledFrameRemainder0 = true;
                if (param1 != 2) {
                  if (param1 == 0) {
                    stackIn_56_0 = !(ReflectionCheck.field_s);
                    ReflectionCheck.field_s = stackIn_56_0;
                  }
                } else {
                  if (AchievementSubmission.field_n >= 144 &&
                    ReflectionCheck.field_s) {
                    param1 = 0;
                    if (AchievementSubmission.field_n < (-1 + (172 + StyleNode.field_p * 108 / 104))) {
                      param1 = (-(108 * StyleNode.field_p / 104) - 172 + AchievementSubmission.field_n) * 104 / 108;
                    }
                    if (!(108 * StyleNode.field_p / 104 + 172 + 1 >= AchievementSubmission.field_n)) {
                      param1 = 104 * (AchievementSubmission.field_n - (172 + StyleNode.field_p * 108 / 104)) / 108;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    param1 = 0;
                    stackIn_51_0 = !(ReflectionCheck.field_s);
                    ReflectionCheck.field_s = stackIn_51_0;
                  }
                }
                if (-1 >= param1) {
                  StyleNode.field_p = StyleNode.field_p + param1;
                  if (StyleNode.field_p <= 0) {
                    ReflectionCheck.field_s = false;
                    StyleNode.field_p = 0;
                  }
                }
                if (param1 >= 1) {
                  StyleNode.field_p = StyleNode.field_p + param1;
                  ReflectionCheck.field_s = true;
                  if (StyleNode.field_p > 104) {
                    StyleNode.field_p = 104;
                  }
                }
                if (ReflectionCheck.field_s) {
                  if (0 >= SpriteState.field_y) {
                    FriendOrderingHelpers.field_a.addSample(BufferedRandomAccessFile.soundEffects[0], 100, 256 * StyleNode.field_p / 100);
                    SpriteState.field_y = 25;
                  }
                  return;
                }
              }
              return;
            }
            if (param1 == 0) {
              DualLinkDeque.field_i = 1;
              EncryptedLoginHelpers.field_c = 32;
              if (ReflectionCheck.field_s) {
                FriendOrderingHelpers.field_a.addSample(BufferedRandomAccessFile.soundEffects[0], 100, StyleNode.field_p * 256 / 100);
              }
            }
          } else {
            HighscoreRequest.field_r = 255;
            HighscorePlayer.field_b = HighscorePlayer.field_b - (DiskCacheStore.field_f << 6);
            DiskCacheStore.field_f = 0;
            if (param1 == 0) {
              DualLinkDeque.field_i = 5;
              EncryptedLoginHelpers.field_c = 32;
              if (ReflectionCheck.field_s) {
                FriendOrderingHelpers.field_a.addSample(BufferedRandomAccessFile.soundEffects[0], 100, StyleNode.field_p * 256 / 100);
              }
            }
          }
        }
        if (ReflectionCheck.field_s &&
          param1 != 2) {
          FriendOrderingHelpers.field_a.addSample(BufferedRandomAccessFile.soundEffects[0], 100, 256 * StyleNode.field_p / 100);
        }
    }

    final void f(int param0) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        boolean discarded$5 = false;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_224_0 = 0;
        int stackIn_224_1 = 0;
        int stackIn_318_0 = 0;
        int stackIn_318_1 = 0;
        int stackIn_378_0 = 0;
        int stackIn_378_1 = 0;
        int stackIn_513_0 = 0;
        int stackIn_513_1 = 0;
        int stackIn_524_0 = 0;
        int stackIn_567_0 = 0;
        int stackIn_567_1 = 0;
        boolean stackIn_574_0 = false;
        int stackIn_651_0 = 0;
        int stackIn_651_1 = 0;
        MonochromeBitmapFont stackIn_657_0 = null;
        boolean stackIn_658_1 = false;
        boolean stackIn_661_2 = false;
        boolean stackIn_664_3 = false;
        MonochromeBitmapFont stackIn_667_0 = null;
        boolean stackIn_668_1 = false;
        int stackIn_670_2 = 0;
        boolean stackIn_671_3 = false;
        boolean stackIn_674_4 = false;
        MonochromeBitmapFont stackIn_676_0 = null;
        boolean stackIn_677_1 = false;
        int stackIn_679_2;
        boolean stackIn_679_3;
        boolean stackIn_680_4;
        boolean stackIn_690_1 = false;
        int stackIn_737_0 = 0;
        int stackIn_740_0 = 0;
        int stackIn_741_0 = 0;
        int stackIn_741_1 = 0;
        int var3 = 0;
        String[] var3_ref_String__ = null;
        String var3_ref_String = null;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        String var6_ref_String = null;
        double var7_double = 0.0;
        int var7 = 0;
        String[] var7_ref_String__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ScoreSubmission var10_ref_ai = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        java.awt.Canvas var19 = null;
        String var20 = null;
        StringBuilder var21 = null;
        String[] var22 = null;
        String var25 = null;
        String[] var26 = null;
        String var27 = null;
        String var28 = null;
        String[] var29 = null;
        String var30 = null;
        String var31 = null;
        MonochromeBitmapFont var32 = null;
        Object var33 = null;
        AchievementUnlock var33_ref = null;
        long[] var38 = null;
        int[] var39 = null;
        String var3_ref_StringLifetime1;
        int stackIn_52_0Lifetime1;
        int stackIn_80_0Lifetime1;
        int stackIn_80_1Lifetime1;
        int stackIn_224_0Lifetime1;
        int stackIn_224_1Lifetime1;
        int stackIn_318_0Lifetime1;
        int stackIn_318_1Lifetime1;
        int stackIn_378_0Lifetime1;
        int stackIn_378_1Lifetime1;
        int stackIn_513_0Lifetime1;
        int stackIn_513_1Lifetime1;
        int stackIn_567_0Lifetime1;
        int stackIn_567_1Lifetime1;
        int stackIn_651_0Lifetime1;
        int stackIn_651_1Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        double var7_doubleLifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var4_intLifetime2Lifetime1;
        int var4_intLifetime2Lifetime2;
        int var4_intLifetime2Lifetime3;
        int var5Lifetime2Lifetime1;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var6Lifetime1Lifetime3;
        int var6Lifetime1Lifetime4;
        int var6Lifetime1Lifetime5;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        int var10Lifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        var33 = null;
        var18 = field_H;
        var19 = BufferedSocket.activeCanvas((byte) 72);
        if (MouseWheelInput.a((byte) 60)) {
          UrlPacketDownloader.a((byte) 38, EmailDomainHelpers.a(255), var19);
          return;
        }
        if (!DualLinkDeque.resourcesLoaded) {
          ArchiveLoadingPlan.drawLoadingScreen(false, var19);
          return;
        }
        if (!ImageProducerRasterBuffer.c((byte) 54)) {
          ValidationState.showLoadingProgress(WidgetTheme.field_s, 100.0f, 0);
          ArchiveLoadingPlan.drawLoadingScreen(false, var19);
          return;
        }
        HighscorePlayer.field_e.drawWithOffsets(0, 0);
        if (DialogLayer.field_K != 1) {
          MatchingTextValidator.c((byte) 108);
          if (HuffmanDecoder.field_c >= 5) {
            var3 = 0;
            var4_int = 0;
            var5 = 1;
            while (true) {
              if (WidgetTheme.field_k > var5) {
                stackIn_318_0 = NameAvailabilityFactory.field_e[var5].field_d;
                stackIn_318_1 = var3;
                if (stackIn_318_0 == stackIn_318_1 &&
                  NameAvailabilityFactory.field_e[var5].field_p > NameAvailabilityFactory.field_e[var4_int].field_p) {
                  var3 = NameAvailabilityFactory.field_e[var5].field_d;
                  var4_int = var5;
                }
                if (var3 < NameAvailabilityFactory.field_e[var5].field_d) {
                  var3 = NameAvailabilityFactory.field_e[var5].field_d;
                  var4_int = var5;
                }
                var5++;
                continue;
              }
              var5 = 50;
              stackIn_318_0Lifetime1 = -3;
              stackIn_318_1Lifetime1 = ~GridActor.field_l;
              if (stackIn_318_0Lifetime1 == stackIn_318_1Lifetime1) {
                var5 = 75;
              }
              if (GridActor.field_l == 3) {
                var5 = 75;
              }
              if (4 == GridActor.field_l) {
                var5 = 75;
              }
              if (GridActor.field_l == 5) {
                var5 = 200;
              }
              var6 = 0;
              if (0 == GridActor.field_l) {
                var6 = 64;
              }
              if (GridActor.field_l == 1) {
                var6 = 64;
              }
              if (GridActor.field_l == 2) {
                var6 = -GameShell.field_x.fullHeight + 384;
              }
              if (3 == GridActor.field_l) {
                var6 = 64;
              }
              if (4 == GridActor.field_l) {
                var6 = 384 - GameShell.field_x.fullHeight;
              }
              if (GridActor.field_l == 5) {
                var6 = 64;
              }
              IsaacPacketBuffer.field_s.drawTransparent(320 - GameShell.field_x.fullWidth / 2, var6);
              if (var4_int == 0) {
                break;
              }
              SoftwareRasterizer.setClip(1 + (320 - GameShell.field_x.fullWidth / 2), 0, 320 - GameShell.field_x.fullWidth / 2 + (-2 + GameShell.field_x.fullWidth) * NameAvailabilityFactory.field_e[var4_int].field_p / var5, 480);
              GameShell.field_x.drawTransparent(320 - GameShell.field_x.fullWidth / 2, var6);
              SoftwareRasterizer.resetClip();
              break;
            }
          }
          if (GridActor.field_l > -1) {
            if (!AchievementSubmission.field_q) {
              var26 = new String[9];
              var3_ref_String__ = var26;
              for (var4_int = 0; 9 > var4_int; var4_int++) {
                var3_ref_String__[var4_int] = ProgressQuery.characterToString((byte) -108, UsernameLoginCredentials.field_g.charAt(var4_int));
              }
              var4_int = 0;
              for (var5 = 440; var5 <= 610; var5 += 20) {
                ValidationState.selectStarSprites[0].drawScaledIntensity(var5, 0, 30, 30, 64);
                GameGraphicsResources.wizardFont2.drawStringCentered(var26[var4_int], var5 + 15, 24, 0, -1);
                GameGraphicsResources.wizardFont2.drawStringCentered(var26[var4_int], var5 + 15, 26, 0, -1);
                GameGraphicsResources.wizardFont2.drawStringCentered(var26[var4_int], -1 + (15 + var5), 25, 0, -1);
                GameGraphicsResources.wizardFont2.drawStringCentered(var26[var4_int], 1 + (var5 + 15), 25, 0, -1);
                incrementValue$1 = var4_int;
                var4_int++;
                GameGraphicsResources.wizardFont2.drawStringCentered(var3_ref_String__[incrementValue$1], var5 + 15, 25, 16777215, -1);
              }
              SoftwareRasterizer.setClip(440, 0, 440 + 2 * NetworkArchiveRequest.field_x, 64);
              var4_int = 0;
              for (var5 = 440; var5 <= 610; var5 += 20) {
                ValidationState.selectStarSprites[0].drawScaled(var5, 0, 30, 30);
                incrementValue$0 = var4_int;
                var4_int++;
                GameGraphicsResources.wizardFont2.drawStringCentered(var3_ref_String__[incrementValue$0], var5 + 15, 25, 0, -1);
                stackIn_513_0 = -101;
                stackIn_513_1 = ~NetworkArchiveRequest.field_x;
                if (stackIn_513_0 > stackIn_513_1 &&
                  NetworkArchiveRequest.field_x < 110) {
                  ValidationState.selectStarSprites[0].drawScaled(var5 + 5, 5, 20, 20);
                }
              }
              SoftwareRasterizer.resetClip();
            }
            var3 = 2;
            if (GridActor.field_g > 0) {
              GameGraphicsResources.wizardFont2.drawString(SpriteTextStyle.field_J, 8, 471, 0, -1);
              GameGraphicsResources.wizardFont2.drawString(SpriteTextStyle.field_J, 8, 473, 0, -1);
              GameGraphicsResources.wizardFont2.drawString(SpriteTextStyle.field_J, 7, 472, 0, -1);
              GameGraphicsResources.wizardFont2.drawString(SpriteTextStyle.field_J, 9, 472, 0, -1);
              GameGraphicsResources.wizardFont2.drawString(SpriteTextStyle.field_J, 8, 472, 16777215, -1);
              var3 = GameGraphicsResources.wizardFont2.stringWidth(SpriteTextStyle.field_J) + 8;
              var4_int = 0;
              while (var4_int < GridActor.field_g) {
                stackIn_378_0 = GridActor.field_g;
                stackIn_378_1 = 25 + var4_int;
                if (stackIn_378_0 <= stackIn_378_1) {
                  if (GridActor.field_g <= (var4_int + 10)) {
                    if ((var4_int + 5) >= GridActor.field_g) {
                      ValidationState.selectStarSprites[0].drawScaled(var3, 446, 24, 24);
                      ContentTransitionDialog.field_bb.drawScaled(var3, 446, 24, 24);
                      var3 += 24;
                    } else {
                      ValidationState.selectStarSprites[0].drawScaled(var3, 446, 32, 32);
                      ContentTransitionDialog.field_bb.drawScaled(var3, 446, 32, 32);
                      FlatTriangleRasterizer.font12.drawString("5", var3, 461, 16777215, -1);
                      var3 += 32;
                      var4_int += 4;
                    }
                  } else {
                    ValidationState.selectStarSprites[0].drawScaled(var3, 446, 32, 32);
                    ContentTransitionDialog.field_bb.drawScaled(var3, 446, 32, 32);
                    FlatTriangleRasterizer.font12.drawString("10", var3, 461, 16777215, -1);
                    var3 += 32;
                    var4_int += 9;
                  }
                } else {
                  ValidationState.selectStarSprites[0].drawScaled(var3, 446, 32, 32);
                  ContentTransitionDialog.field_bb.drawScaled(var3, 446, 32, 32);
                  FlatTriangleRasterizer.font12.drawString("25", var3, 461, 16777215, -1);
                  var3 += 32;
                  var4_int += 24;
                }
                var4_int++;
              }
            }
            stackIn_378_0Lifetime1 = ~DiskCacheStore.field_f;
            stackIn_378_1Lifetime1 = -1;
            if (stackIn_378_0Lifetime1 < stackIn_378_1Lifetime1) {
              var27 = MouseInputHandler.field_d + DiskCacheStore.field_f;
              GameGraphicsResources.wizardFont2.drawString(var27, 8, GameGraphicsResources.wizardFont2.field_M - 1, 0, -1);
              GameGraphicsResources.wizardFont2.drawString(var27, 8, GameGraphicsResources.wizardFont2.field_M + 1, 0, -1);
              GameGraphicsResources.wizardFont2.drawString(var27, 7, GameGraphicsResources.wizardFont2.field_M, 0, -1);
              GameGraphicsResources.wizardFont2.drawString(var27, 9, GameGraphicsResources.wizardFont2.field_M, 0, -1);
              GameGraphicsResources.wizardFont2.drawString(var27, 8, GameGraphicsResources.wizardFont2.field_M, 16777215, -1);
            }
            if (DialogLayer.field_K == 2) {
              if (!AchievementSubmission.field_q &&
                5 == GridActor.field_l &&
                5 <= HuffmanDecoder.field_c) {
                this.field_Q = this.field_Q + 1;
                if (this.field_Q >= 40) {
                  this.field_Q = 0;
                }
                FullscreenFailureKind.field_a[12 + this.field_Q / 10 % 4].drawTransparent(512, 0);
              }
              for (var4_int = 0; WidgetTheme.field_k > var4_int; var4_int++) {
                NameAvailabilityFactory.field_e[var4_int].drawActor(true);
              }
            }
            if (AchievementSubmission.field_q) {
              if (this.field_R == 11) {
                this.field_Q = this.field_Q + 1;
                if (this.field_Q >= 40) {
                  this.field_Q = 0;
                }
                FullscreenFailureKind.field_a[12 + this.field_Q / 10 % 4].drawTransparent(512, 0);
                var4_int = -32 + ((15 - NameAvailabilityFactory.field_e[0].tilePosition.row - 1) * 32 - NameAvailabilityFactory.field_e[0].tileOffset.row * 32 / 240);
                var3 = NameAvailabilityFactory.field_e[0].tilePosition.column * 32 + NameAvailabilityFactory.field_e[0].tileOffset.column * 32 / 240;
                if (NameAvailabilityFactory.field_e[0].field_h != -1) {
                  ErrorReportingHelpers.wizardSprites[NameAvailabilityFactory.field_e[0].animationFrame].drawMirrored(var3, var4_int);
                } else {
                  ErrorReportingHelpers.wizardSprites[NameAvailabilityFactory.field_e[0].animationFrame].drawTransparent(var3, var4_int);
                }
              }
              if (this.field_R == 12) {
                var4_int = 352;
                FullscreenFailureKind.field_a[12 + (2 + this.field_Q / 10) % 4].drawTransparent(512, 0);
                var3 = 64;
                if (this.field_Q < 10) {
                  var4_int = -64 - NameAvailabilityFactory.field_e[0].tilePosition.row * 32 + (480 - NameAvailabilityFactory.field_e[0].tileOffset.row * 32 / 240);
                  var3 = 32 * NameAvailabilityFactory.field_e[0].tileOffset.column / 240 + NameAvailabilityFactory.field_e[0].tilePosition.column * 32;
                  var5 = -var3 + 64;
                  var3 = var3 + var5 * this.field_Q / 10;
                  var6 = -var4_int + 352;
                  var4_int = var4_int + var6 * this.field_Q / 10;
                }
                var5 = 15;
                if (this.field_Q > 50) {
                  var5 = 16;
                }
                if (this.field_Q > 60) {
                  var5 = 12;
                }
                CoverageFontLoader.field_c[var5].drawMirrored(var3, var4_int);
                if (50 > this.field_Q) {
                  var6 = this.field_Q * 256 / 50;
                  var7_double = 0.0;
                  for (var9 = 0; var9 < 5; var9++) {
                    var7_doubleLifetime1 = (double)this.field_Q + 6.28 * (double)var9 / 5.0;
                    GridPoint.field_c.drawScaledAlpha(-6 + ((int)(32.0 + 32.0 * Math.cos(var7_doubleLifetime1)) + var3), var4_int - (-(int)(32.0 + Math.sin(var7_doubleLifetime1) * 32.0) + 6), 12, 12, var6);
                  }
                }
                if (this.field_Q >= 50 &&
                  this.field_Q < 90) {
                  var6 = 576 - (64 + var3);
                  var7 = 64 - var4_int;
                  var8 = var6 * (-50 + this.field_Q) / 40 + var3;
                  var9 = var7 * (this.field_Q - 50) / 40 + var4_int;
                  GridPoint.field_c.a(var8, var9, -123, 128, 2 * this.field_Q);
                  var8 = var3 + (int)(Math.sin(3.14 * (double)(this.field_Q - 50) / 80.0) * (double)var6);
                  var9 = var4_int + var7 * (-50 + this.field_Q) / 40;
                  GridPoint.field_c.a(var8, var9, -118, 128, this.field_Q * 2);
                  var8 = var6 * (this.field_Q - 50) / 40 + var3;
                  var9 = (int)((double)var7 * Math.sin((double)(-50 + this.field_Q) * 3.14 / 80.0)) + var4_int;
                  GridPoint.field_c.a(var8, var9, -115, 128, 2 * this.field_Q);
                }
              }
              if (this.field_R == 13) {
                var3 = 64;
                var4_int = 352;
                var5 = this.field_Q / 5 % 2 + 13;
                if (this.field_Q > 70) {
                  var5 = 12;
                }
                if (this.field_Q > 80) {
                  var5 = 11;
                }
                if (this.field_Q > 90) {
                  var5 = 10;
                }
                CoverageFontLoader.field_c[var5].drawMirrored(var3, var4_int);
                if (this.field_Q >= 50) {
                  FullscreenFailureKind.field_a[this.field_Q / 10 % 4 + 22].drawTransparent(512, 288);
                } else {
                  FullscreenFailureKind.field_a[this.field_Q / 10 % 4 + 18].drawTransparent(512, this.field_Q * 288 / 50);
                }
              }
              if (14 == this.field_R) {
                FullscreenFailureKind.field_a[22 + (2 + this.field_Q / 10) % 4].drawTransparent(512, 288);
                var3 = this.field_Q + 64;
                var4_int = 352;
                var5 = 2 + this.field_Q / 10 % 4;
                CoverageFontLoader.field_c[var5].drawMirrored(var3, var4_int);
              }
              if (this.field_R == 15) {
                var3 = 164;
                if (this.field_Q < 50) {
                  FullscreenFailureKind.field_a[22 + this.field_Q / 10 % 4].drawTransparent(512, 288);
                } else {
                  FullscreenFailureKind.field_a[this.field_Q / 10 % 4 + 26].drawTransparent(512, 288);
                }
                var4_int = 352;
                var5 = this.field_Q / 5 % 2 + 19;
                CoverageFontLoader.field_c[var5].drawMirrored(var3, var4_int);
              }
              if (this.field_R == 16) {
                var4_int = 352;
                FullscreenFailureKind.field_a[26 + (2 + this.field_Q / 10) % 4].drawTransparent(512, 288);
                var3 = 164;
                var5 = 10;
                if (this.field_Q > 10) {
                  var5 = 11;
                }
                if (25 < this.field_Q) {
                  var5 = 12;
                }
                if (50 <= this.field_Q) {
                  var5 = 13;
                }
                CoverageFontLoader.field_c[var5].drawMirrored(var3, var4_int);
              }
              if (this.field_R == 17) {
                FullscreenFailureKind.field_a[(this.field_Q / 10 + 2) % 4 + 30].drawTransparent(512, 288);
                CoverageFontLoader.field_c[(this.field_Q / 5 + 2) % 2 + 17].drawTransparent(164, 352);
              }
              if (this.field_R == 1) {
                var3 = 256;
                var4_int = 288;
                var5 = this.field_Q / 10 % 8 - 0;
                FullscreenFailureKind.field_a[var5].drawTransparent(var3, var4_int);
              }
              if (2 == this.field_R) {
                var5 = this.field_Q / 10 % 8 - 0;
                var3 = 256;
                var4_int = 288;
                FullscreenFailureKind.field_a[var5].drawTransparent(var3, var4_int);
                var4_int = var4_int - (32 - this.field_Q + 100);
                var5 = this.field_Q / 5 % 4 + 6;
                var3 = var3 - (-64 + (100 - this.field_Q) * 5);
                ValidationState.field_e[5][3][var5].drawMirrored(var3, var4_int);
              }
              if (this.field_R == 3) {
                var4_int = 288;
                var5 = this.field_Q / 10 % 4 + 8;
                var3 = 256;
                var4_int = var4_int - this.field_Q;
                var3 = var3 + 5 * this.field_Q;
                FullscreenFailureKind.field_a[var5].drawTransparent(var3, var4_int);
              }
              if (this.field_R == 4) {
                var3 = 2 * this.field_Q - 64;
                var5 = 6 + this.field_Q / 10 % 4;
                var4_int = 352;
                CoverageFontLoader.field_c[var5].drawMirrored(var3, var4_int);
              }
              if (this.field_R == 5) {
                var5 = 6 + (2 + this.field_Q / 10) % 4;
                var4_int = 352;
                if (this.field_Q < 100) {
                  var3 = -64 + (2 * this.field_Q + 200);
                  CoverageFontLoader.field_c[var5].drawMirrored(var3, var4_int);
                } else {
                  var3 = 336;
                  var5 = 7;
                  if (this.field_Q < 150) {
                    CoverageFontLoader.field_c[var5].drawMirrored(var3, var4_int);
                  } else {
                    CoverageFontLoader.field_c[var5].drawTransparent(var3, var4_int);
                  }
                }
                if (100 < this.field_Q) {
                  var3 = 64 + (int)(Math.sin(3.14 * (double)this.field_Q / 100.0) * 32.0);
                  var4_int = -448 + 2 * this.field_Q;
                  var5 = 36 + this.field_Q / 25 % 2;
                  CoverageFontLoader.field_c[var5].drawTransparent(var3, var4_int);
                }
              }
              if (6 == this.field_R) {
                var4_int = 352;
                var5 = 6 + this.field_Q / 10 % 4;
                var3 = 336;
                var5 = 7;
                if (this.field_Q > 20) {
                  var5 = 28;
                }
                if (this.field_Q > 40) {
                  var5 = 27;
                }
                if (this.field_Q > 150) {
                  var5 = 28;
                }
                if (this.field_Q > 175) {
                  var5 = 29;
                }
                CoverageFontLoader.field_c[var5].drawTransparent(var3, var4_int);
                var3 = (int)(Math.sin((double)this.field_Q * 3.14 / 100.0) * 32.0) + 64;
                var5 = 36 + this.field_Q / 25 % 2;
                var4_int = 2 * this.field_Q - 48;
                CoverageFontLoader.field_c[var5].drawTransparent(var3, var4_int);
              }
              if (this.field_R == 7) {
                if (this.field_Q >= 50) {
                  var4_int = 352;
                  var3 = 64;
                  if (this.field_Q >= 75) {
                    CoverageFontLoader.field_c[10].drawTransparent(var3, var4_int);
                  } else {
                    CoverageFontLoader.field_c[0].drawTransparent(var3, var4_int);
                    CoverageFontLoader.field_c[36].drawTransparent(var3, var4_int);
                  }
                } else {
                  var5 = this.field_Q / 5 % 4 + 6;
                  var3 = 336;
                  var4_int = 352;
                  var6 = 64 - var3;
                  var3 = var3 + var6 * this.field_Q / 50;
                  CoverageFontLoader.field_c[var5].drawTransparent(var3, var4_int);
                  var5 = 36;
                  var3 = 64;
                  var4_int = 352;
                  CoverageFontLoader.field_c[var5].drawTransparent(var3, var4_int);
                }
              }
              if (this.field_R == 8) {
                var5 = this.field_Q / 5 % 4 + 2;
                var4_int = 352;
                if (40 > this.field_Q) {
                  var3 = 64 + this.field_Q * 3;
                  CoverageFontLoader.field_c[var5].drawMirrored(var3, var4_int);
                }
                if (this.field_Q >= 40 &&
                  this.field_Q < 60) {
                  var3 = 184;
                  CoverageFontLoader.field_c[3].drawMirrored(var3, var4_int);
                }
                if (this.field_Q >= 60 &&
                  this.field_Q <= 100) {
                  var3 = 364 - this.field_Q * 3;
                  CoverageFontLoader.field_c[var5].drawTransparent(var3, var4_int);
                }
              }
              if (this.field_R == 9) {
                var4_int = 352;
                var5 = 10;
                var3 = 64;
                if (this.field_Q > 25) {
                  var5 = 11;
                }
                if (this.field_Q > 50) {
                  var5 = 12;
                }
                if (3 < GridActor.field_g) {
                  CoverageFontLoader.field_c[var5].drawMirrored(var3, var4_int);
                } else {
                  CoverageFontLoader.field_c[var5].drawTransparent(var3, var4_int);
                }
              }
            }
          }
        } else {
          if (EmailCheckRequest.field_h == 0) {
            var3 = 208;
            for (var5 = 0; AccountConnectionState.field_a > var5; var5++) {
              stackIn_741_0 = var5;
              stackIn_741_1 = BufferedRandomAccessFile.field_h;
              stackIn_16_0 = (stackIn_741_0 != stackIn_741_1) ? 15583488 : 16777215;
              var4_int = stackIn_16_0;
              var20 = EditableTextWidget.field_R[var5];
              var7 = 177;
              if (var5 == 2 ||
                var5 == 3) {
                var7 = var7 - (50 + GameGraphicsResources.wizardFont2.stringWidth(var20) / 2);
              }
              this.drawBorderedText(-12926, var20, var4_int, var7, var3);
              if (var5 == 2) {
                if (!ReflectionCheck.field_s) {
                  stackIn_25_0 = 0;
                } else {
                  stackIn_25_0 = StyleNode.field_p;
                }
                var8 = stackIn_25_0;
                ValidationState.selectStarSprites[0].a(174, -10 + var3 - 6, -93, 20, 0);
                ValidationState.selectStarSprites[0].a(174, 10 + (-6 + var3), -107, 20, 0);
                ValidationState.selectStarSprites[0].a(174, var3 - 6, -108, 30, 0);
                ValidationState.selectStarSprites[0].a(282, -6 + (var3 - 10), -123, 20, 0);
                ValidationState.selectStarSprites[0].a(282, 10 + (var3 - 6), -98, 20, 0);
                ValidationState.selectStarSprites[0].a(282, var3 - 6, -87, 30, 0);
                for (var9 = 172; 268 > var9; var9 += 14) {
                  ValidationState.selectStarSprites[0].drawScaledIntensity(var9, -14 + var3 - 6, 28, 28, 64);
                }
                SoftwareRasterizer.setClip(0, 0, 174 + var8 * 108 / 104, 480);
                for (var9 = 172; var9 < 268; var9 += 14) {
                  ValidationState.selectStarSprites[0].drawScaled(var9, -20 + var3, 28, 28);
                }
                SoftwareRasterizer.resetClip();
                ValidationState.selectStarSprites[0].a(var8 * 108 / 104 + 174, -10 + (var3 - 6), -103, 30, 0);
                ValidationState.selectStarSprites[0].a(174 + 108 * var8 / 104, -6 + var3 + 10, -99, 30, 0);
                ValidationState.selectStarSprites[0].a(174 + var8 * 108 / 104, var3 - 6, -95, 40, 0);
              }
              if (3 == var5) {
                if (FriendOrderingHelpers.field_e) {
                  stackIn_37_0 = ConfirmedEmailValidator.field_o;
                } else {
                  stackIn_37_0 = 0;
                }
                var8 = stackIn_37_0;
                ValidationState.selectStarSprites[0].a(174, -10 + (var3 - 6), -93, 20, 0);
                ValidationState.selectStarSprites[0].a(174, 10 + (var3 - 6), -121, 20, 0);
                ValidationState.selectStarSprites[0].a(174, var3 - 6, -91, 30, 0);
                ValidationState.selectStarSprites[0].a(282, -6 + var3 - 10, -86, 20, 0);
                ValidationState.selectStarSprites[0].a(282, 10 + (var3 - 6), -122, 20, 0);
                ValidationState.selectStarSprites[0].a(282, var3 - 6, -117, 30, 0);
                for (var9 = 172; var9 < 268; var9 += 14) {
                  ValidationState.selectStarSprites[0].drawScaledIntensity(var9, -6 + (-14 + var3), 28, 28, 64);
                }
                SoftwareRasterizer.setClip(0, 0, 108 * var8 / 200 + 172 + 2, 480);
                for (var9 = 172; var9 < 268; var9 += 14) {
                  ValidationState.selectStarSprites[0].drawScaled(var9, -14 + (var3 - 6), 28, 28);
                }
                SoftwareRasterizer.resetClip();
                ValidationState.selectStarSprites[0].a(2 + var8 * 108 / 200 + 172, -6 + var3 - 10, -112, 30, 0);
                ValidationState.selectStarSprites[0].a(2 + (var8 * 108 / 200 + 172), 10 + (-6 + var3), -114, 30, 0);
                ValidationState.selectStarSprites[0].a(2 + (108 * var8 / 200 + 172), -6 + var3, -96, 40, 0);
              }
              var3 += 32;
            }
            for (var5 = 0; var5 < 100; var5++) {
              stackIn_52_0 = TickClock.field_a[var5][2];
              if (stackIn_52_0 > 0) {
                ValidationState.selectStarSprites[0].a(TickClock.field_a[var5][0], TickClock.field_a[var5][1], -128, TickClock.field_a[var5][2], TickClock.field_a[var5][2] * 2);
              }
            }
          }
          stackIn_52_0Lifetime1 = 11;
          if (stackIn_52_0Lifetime1 == EmailCheckRequest.field_h) {
            SoftwareRasterizer.fillRect(16, 153, 608, 311, 13158);
            CacheEntry.a(DropTargetWidget.frameSprites, 16, (byte) -110, 311, 608, 153);
            GameGraphicsResources.wizardFont2.drawStringCentered(LoginCredentials.field_b, 320, GameGraphicsResources.wizardFont2.field_M + 169, 16777215, -1);
            var3 = 96;
            if (GridActor.field_l < 0) {
              BufferedSocket.field_c = BufferedSocket.field_c - GridActor.field_l * 6;
              GridActor.field_l = 0;
            }
            var4_int = var3 * 96 / 128;
            if (GridActor.field_l > 5) {
              HighscorePlayer.field_b = HighscorePlayer.field_b + 30;
              BufferedSocket.field_c = BufferedSocket.field_c - GridActor.field_l * 6;
              GridActor.field_l = 5;
            }
            var5 = 0;
            while (true) {
              if (var5 < 6) {
                var6 = var3 * var5 + 32;
                var7 = 208;
                ExceptionSupport.field_c[var5].drawScaled(var3 * var5 + 32, 208, var3, var4_int);
                stackIn_80_0 = ~var5;
                stackIn_80_1 = ~TextButton.field_A;
                if (stackIn_80_0 < stackIn_80_1 ||
                  !(ArchiveProvider.field_a > 0) &&
                  1 < var5) {
                  SoftwareRasterizer.fillRectangleBlended(var6, var7, var3, var4_int, 0, 192);
                  if (ArchiveProvider.field_a <= 0 &&
                    var5 > 1) {
                    BrowserCookieHelpers.field_c.drawDownscaledAveraged(var3 / 2 + (32 + (var5 * var3 - var4_int / 2)), 208, var4_int, var4_int);
                  }
                }
                if (var5 != GridActor.field_l) {
                  SoftwareRasterizer.drawRectOutline(var5 * var3 + 32, 208, var3, var4_int, 0);
                  SoftwareRasterizer.drawRoundedRectangle(32 + var5 * var3, 208, var3, var4_int, 1, 8421376);
                  SoftwareRasterizer.drawRoundedRectangle(var3 * var5 + 32, 208, var3, var4_int, 2, 16776960);
                  SoftwareRasterizer.drawRoundedRectangle(var5 * var3 + 32, 208, var3, var4_int, 3, 8421376);
                } else {
                  SoftwareRasterizer.drawRectOutline(var3 * var5 + 32, 208, var3, var4_int, 0);
                  SoftwareRasterizer.drawRoundedRectangle(32 + var3 * var5, 208, var3, var4_int, 1, 16776960);
                  SoftwareRasterizer.drawRoundedRectangle(var3 * var5 + 32, 208, var3, var4_int, 2, 16777215);
                  SoftwareRasterizer.drawRoundedRectangle(var3 * var5 + 32, 208, var3, var4_int, 3, 16776960);
                }
                if (AchievementSubmission.field_n >= var6 &&
                  (var6 + var3) > AchievementSubmission.field_n &&
                  NetworkArchiveRequest.field_B >= var7 &&
                  (var7 + var4_int) > NetworkArchiveRequest.field_B) {
                  SoftwareRasterizer.drawRectOutline(var3 * var5 + 32, 208, var3, var4_int, 16777215);
                  if (BrowserUrlLauncher.field_c == 1) {
                    BufferedSocket.field_c = BufferedSocket.field_c - GridActor.field_l * 6;
                    HighscorePlayer.field_b = HighscorePlayer.field_b + var5 * 6;
                    GridActor.field_l = var5;
                  }
                }
                var5++;
                continue;
              }
              var5 = 16777215;
              stackIn_80_0Lifetime1 = GridActor.field_l;
              stackIn_80_1Lifetime1 = TextButton.field_A;
              if (stackIn_80_0Lifetime1 > stackIn_80_1Lifetime1 ||
                !(GridActor.field_l <= 1) &&
                !(ArchiveProvider.field_a > 0)) {
                var5 = 16777088;
                if (GridActor.field_l > 1 &&
                  ArchiveProvider.field_a <= 0) {
                  var5 = 16711680;
                }
              }
              var6_ref_String = "BLAH BLAH BLAH!";
              if (GridActor.field_l == 0) {
                var6_ref_String = FriendEntry.field_kb;
              }
              if (GridActor.field_l == 1) {
                var6_ref_String = GameShell.field_o;
              }
              if (GridActor.field_l == 2) {
                var6_ref_String = AchievementUnlock.field_l;
              }
              if (GridActor.field_l == 3) {
                var6_ref_String = SecondaryNodeDeque.field_c;
              }
              if (4 == GridActor.field_l) {
                var6_ref_String = DialogLayer.field_H;
              }
              if (GridActor.field_l == 5) {
                var6_ref_String = NameCheckProgressDialog.field_vb;
              }
              GameGraphicsResources.wizardFont2.drawStringCentered(NineSliceFrame.field_c + (GridActor.field_l + 1), 320, var4_int + 192 + (16 + GameGraphicsResources.wizardFont2.field_M), var5, -1);
              GameGraphicsResources.wizardFont2.drawStringCentered(var6_ref_String, 320, 2 * GameGraphicsResources.wizardFont2.field_M + (208 + var4_int), var5, -1);
              if (var5 == 16777088) {
                GameGraphicsResources.wizardFont2.drawStringCentered(BufferedRandomAccessFile.field_g, 320, 192 + var4_int + 16 + 3 * GameGraphicsResources.wizardFont2.field_M, var5, -1);
              }
              if (16711680 == var5) {
                GameGraphicsResources.wizardFont2.drawStringCentered(GameKeyHandler.field_a, 320, 192 - (-var4_int - 16 - 3 * GameGraphicsResources.wizardFont2.field_M), var5, -1);
              }
              if (!ThreePieceFrameHelpers.a(-109)) {
                if (var5 == 16777215 &&
                  this.a(400, 128, 65535, ProgressQuery.field_l, 1) &&
                  5 > FadingDialog.field_I &&
                  0 >= EncryptedLoginHelpers.field_c) {
                  DecodedSpritePalette.field_a = DecodedSpritePalette.field_a - GridActor.field_g;
                  GridActor.field_g = 0;
                  AccountCreationForm.field_T = 0;
                  if (0 < GridActor.field_l) {
                    BufferedSocket.field_c = BufferedSocket.field_c - 5;
                    DelegatingCanvas.field_b = false;
                    GridActor.field_g = 5;
                  }
                  WidgetTheme.field_k = 0;
                  FadingDialog.field_I = 5;
                  EmailAddressValidator.field_l = 0;
                  if (GridActor.field_l > 0) {
                    AccountCreationForm.field_T = 400;
                  }
                }
              } else {
                var7 = 98;
                if (AccountProgressDialog.field_tb == 2) {
                  var7 += 20;
                }
                if (this.a(400, var7, 65535, SoundCache.field_b, 1) &&
                  FadingDialog.field_I < 5 &&
                  EncryptedLoginHelpers.field_c <= 0) {
                  SocketJs5Transport.a(11, 11, -127);
                }
                if (var5 == 16777215) {
                  var7 = 320;
                  if (AccountProgressDialog.field_tb == 2) {
                    var7 += 30;
                  }
                  if (this.a(400, var7, 65535, ProgressQuery.field_l, 1) &&
                    FadingDialog.field_I < 5 &&
                    EncryptedLoginHelpers.field_c <= 0) {
                    HighscorePlayer.field_b = HighscorePlayer.field_b + GridActor.field_g;
                    GridActor.field_g = 0;
                    FadingDialog.field_I = 5;
                    if (GridActor.field_l > 0) {
                      DelegatingCanvas.field_b = false;
                      LoadingMessageHelpers.field_f = LoadingMessageHelpers.field_f + 5;
                      GridActor.field_g = 5;
                    }
                    WidgetTheme.field_k = 0;
                    AccountCreationForm.field_T = 0;
                    if (GridActor.field_l > 0) {
                      AccountCreationForm.field_T = 400;
                    }
                    EmailAddressValidator.field_l = 0;
                  }
                }
              }
              if (!this.a(400, 556, 65535, AccountFormText.field_a, 1)) {
                break;
              }
              if (FadingDialog.field_I >= 5) {
                break;
              }
              if (EncryptedLoginHelpers.field_c > 0) {
                break;
              }
              EncryptedLoginHelpers.field_c = 32;
              break;
            }
          }
          if (5 == EmailCheckRequest.field_h) {
            BeveledFrameFactory.field_f = -1;
            var3 = 5 * GameGraphicsResources.wizardFont2.field_M / 2 + 231;
            SoftwareRasterizer.fillRect(314, 119, 254, 94, 13158);
            CacheEntry.a(DropTargetWidget.frameSprites, 309, (byte) -110, 104, 264, 114);
            SoftwareRasterizer.fillRect(249, 5 + var3 - 68, 382, 198, 13158);
            CacheEntry.a(DropTargetWidget.frameSprites, 244, (byte) -110, 208, 392, -64 + var3 - 4);
            var3 = 345;
            var4_int = 130;
            if (0 >= AgeValidator.field_l) {
              stackIn_148_0 = IsaacRandom.field_a;
            } else {
              stackIn_148_0 = AgeValidator.field_l;
            }
            var5 = stackIn_148_0;
            if (ErrorReportingHelpers.a((byte) 50, 0) ||
              (var5 & 2048) > 0) {
              var3 = 325;
            }
            var6 = 0;
            var7 = 1;
            var8 = FlatTriangleRasterizer.font12.field_E;
            for (var9 = 0; SpriteState.field_t.length > var9; var9++) {
              var10 = 1;
              stackIn_224_0 = ~var9;
              stackIn_224_1 = -12;
              if (stackIn_224_0 == stackIn_224_1) {
                if ((1 << var9 & var5) == 0 &&
                  !ErrorReportingHelpers.a((byte) 103, 0)) {
                  var10 = 0;
                }
                var3 = 525;
                var4_int = 130;
              }
              boolean decompiledFrameRemainder0 = true;
              if (var10 != 0) {
                var11 = 0;
                if (HyperlinkPainter.field_a == var9) {
                  var11 = 2;
                  ValidationState.selectStarSprites[0].drawScaled(var3 - 8, -8 + var4_int, 48, 48);
                }
                if (AchievementSubmission.field_n >= var3 &&
                  AchievementSubmission.field_n <= var3 + 32 &&
                  NetworkArchiveRequest.field_B >= var4_int &&
                  NetworkArchiveRequest.field_B <= (32 + var4_int) && (AgeValidator.field_l == 0 ||
                  0 != (1 << var9 & var5))) {
                  var11 = 2;
                  if (~HyperlinkPainter.field_a != ~var9) {
                    ValidationState.selectStarSprites[0].drawScaledAlpha(-4 + var3, var4_int - 4, 40, 40, 128);
                  }
                  BeveledFrameFactory.field_f = var9;
                }
                if (0 == (1 << var9 & var5)) {
                  decompiledFrameRemainder0 = !(0 < AgeValidator.field_l);
                  if (decompiledFrameRemainder0) {
                    if (ArchiveProvider.field_a <= 0 &&
                      1 != var9 &&
                      var9 != 2 &&
                      var9 != 5 &&
                      var9 != 6) {
                      BrowserCookieHelpers.field_c.drawDownscaledAveraged(-var11 + var3, var4_int - var11, var11 * 2 + 32, 2 * var11 + 32);
                    } else {
                      DiskCacheRequest.field_z.drawDownscaledAveraged(-var11 + var3, -var11 + var4_int, var11 * 2 + 32, 32 + var11 * 2);
                    }
                  }
                } else {
                  FullscreenFocusCanvas.field_a[var9].drawDownscaledAveraged(-var11 + var3, var4_int - var11, 2 * var11 + 32, 2 * var11 + 32);
                }
                if (decompiledFrameRemainder0) {
                  if (~var9 == ~HyperlinkPainter.field_a ||
                    !(AchievementSubmission.field_n < var3) &&
                    !(AchievementSubmission.field_n > (var3 + 32)) &&
                    !(var4_int > NetworkArchiveRequest.field_B) &&
                    !(32 + var4_int < NetworkArchiveRequest.field_B) &&
                    HyperlinkPainter.field_a == -1) {
                    var7 = 0;
                    this.drawBorderedText(-12926, SpriteState.field_t[var9], 15583488, 440, 255);
                    if ((1 << var9 & var5) == 0) {
                      FlatTriangleRasterizer.font12.drawStringRight(LoginMethodPreference.field_b, 620, 247 + (GameGraphicsResources.wizardFont2.field_M - 1), 0, 0);
                      FlatTriangleRasterizer.font12.drawStringRight(LoginMethodPreference.field_b, 619, GameGraphicsResources.wizardFont2.field_M + 247, 0, 0);
                      FlatTriangleRasterizer.font12.drawStringRight(LoginMethodPreference.field_b, 620, GameGraphicsResources.wizardFont2.field_M + 247, 16727871, -1);
                    } else {
                      FlatTriangleRasterizer.font12.drawStringRight(RankingWorkspaceHelpers.field_c, 619, GameGraphicsResources.wizardFont2.field_M + 247, 0, 0);
                      FlatTriangleRasterizer.font12.drawStringRight(RankingWorkspaceHelpers.field_c, 620, 246 + GameGraphicsResources.wizardFont2.field_M, 0, 0);
                      FlatTriangleRasterizer.font12.drawStringRight(RankingWorkspaceHelpers.field_c, 620, 247 + GameGraphicsResources.wizardFont2.field_M, 16777215, -1);
                    }
                    var12 = GameGraphicsResources.wizardFont2.field_M * 5 / 2 + 231;
                    if ((1 << var9 & var5) != 0) {
                      FullscreenFocusCanvas.field_a[var9].drawTransparent(260, var12);
                    } else {
                      if (ArchiveProvider.field_a <= 0 &&
                        var9 != 1 &&
                        var9 != 2 &&
                        var9 != 5 &&
                        var9 != 6) {
                        BrowserCookieHelpers.field_c.drawTransparent(260, var12);
                      } else {
                        DiskCacheRequest.field_z.drawTransparent(260, var12);
                      }
                    }
                    var12 = var12 + GameGraphicsResources.wizardFont2.field_M;
                    if (0 == (var5 & 1 << var9) &&
                      5 <= var9 &&
                      var9 != 11) {
                      FlatTriangleRasterizer.font12.a(HighscorePlayerState.field_f, 398, var12 - 1, 222, 480, 0, 0, 0, 0, var8);
                      FlatTriangleRasterizer.font12.a(HighscorePlayerState.field_f, 397, var12, 222, 480, 0, 0, 0, 0, var8);
                      var12 = var12 + (var8 * 3 + 0 * FlatTriangleRasterizer.font12.a(HighscorePlayerState.field_f, 398, var12, 222, 480, 16777215, -1, 0, 0, var8));
                    } else {
                      FlatTriangleRasterizer.font12.a(AccountProgressDialog.field_sb[var9], 397, -FlatTriangleRasterizer.font12.field_M + var12, 222, 480, 0, 0, 0, 0, var8);
                      FlatTriangleRasterizer.font12.a(AccountProgressDialog.field_sb[var9], 398, -FlatTriangleRasterizer.font12.field_M + (-1 + var12), 222, 480, 0, 0, 0, 0, var8);
                      var12 = var12 + (3 * var8 + FlatTriangleRasterizer.font12.a(AccountProgressDialog.field_sb[var9], 398, var12 - FlatTriangleRasterizer.font12.field_M, 222, 480, 16777215, -1, 0, 0, var8) * 0);
                      GameGraphicsResources.wizardFont2.a(ResourceArchive.field_e + GameShell.field_m[var9], 397, var12 - FlatTriangleRasterizer.font12.field_M, 222, 480, 0, 0, 0, 0, GameGraphicsResources.wizardFont2.field_M);
                      GameGraphicsResources.wizardFont2.a(ResourceArchive.field_e + GameShell.field_m[var9], 398, -FlatTriangleRasterizer.font12.field_M + (-1 + var12), 222, 480, 0, 0, 0, 0, GameGraphicsResources.wizardFont2.field_M);
                      var12 = var12 + GameGraphicsResources.wizardFont2.field_M * GameGraphicsResources.wizardFont2.a(ResourceArchive.field_e + GameShell.field_m[var9], 398, -FlatTriangleRasterizer.font12.field_M + var12, 222, 480, 16777215, -1, 0, 0, GameGraphicsResources.wizardFont2.field_M);
                      GameGraphicsResources.wizardFont2.a(AccountFormTextHelpers.field_a, 397, var12 - FlatTriangleRasterizer.font12.field_M, 222, 480, 0, 0, 0, 0, GameGraphicsResources.wizardFont2.field_M);
                      GameGraphicsResources.wizardFont2.a(AccountFormTextHelpers.field_a, 398, -FlatTriangleRasterizer.font12.field_M - 1 + var12, 222, 480, 0, 0, 0, 0, GameGraphicsResources.wizardFont2.field_M);
                      GameGraphicsResources.wizardFont2.a(AccountFormTextHelpers.field_a, 398, -FlatTriangleRasterizer.font12.field_M + var12, 222, 480, 16777215, -1, 0, 0, GameGraphicsResources.wizardFont2.field_M);
                      var13 = TickClock.field_e[var9];
                      for (var14 = 0; var14 < var13; var14++) {
                        ChatMessage.field_f.drawQuarterSize(GameGraphicsResources.wizardFont2.stringWidth(AccountFormTextHelpers.field_a) - var13 * 3 / 2 + (8 * var14 + 398), 4 + var12 - FlatTriangleRasterizer.font12.field_M);
                      }
                    }
                  }
                  incrementValue$2 = var6;
                  var6++;
                  if (4 == incrementValue$2) {
                    var3 = 325;
                    var4_int += 40;
                  } else {
                    var3 += 40;
                  }
                }
              }
            }
            if (var7 != 0) {
              if (AgeValidator.field_l > 0) {
                GameGraphicsResources.wizardFont2.drawStringCentered(DisplayModeInfo.field_b, 440, 230 + GameGraphicsResources.wizardFont2.field_M, 0, 0);
                GameGraphicsResources.wizardFont2.drawStringCentered(DisplayModeInfo.field_b, 439, 231 + GameGraphicsResources.wizardFont2.field_M, 0, 0);
                GameGraphicsResources.wizardFont2.drawStringCentered(DisplayModeInfo.field_b, 440, GameGraphicsResources.wizardFont2.field_M + 231, 16777215, -1);
              }
              var9 = GameGraphicsResources.wizardFont2.field_M * 5 / 2 + 231;
              var9 = var9 + GameGraphicsResources.wizardFont2.field_M;
              GameGraphicsResources.wizardFont2.a(Bzip2State.field_r, 260, -1 + (var9 - 32), 360, 480, 0, 0, 1, 0, GameGraphicsResources.wizardFont2.field_M);
              GameGraphicsResources.wizardFont2.a(Bzip2State.field_r, 259, -32 + var9, 360, 480, 0, 0, 1, 0, GameGraphicsResources.wizardFont2.field_M);
              GameGraphicsResources.wizardFont2.a(Bzip2State.field_r, 260, -32 + var9, 360, 480, 16777215, -1, 1, 0, GameGraphicsResources.wizardFont2.field_M);
              if (ThreePieceFrameHelpers.a(-86)) {
                GameGraphicsResources.wizardFont2.a(CheckboxPainter.field_n, 260, -1 + var9 + 32, 360, 480, 0, 0, 1, 0, GameGraphicsResources.wizardFont2.field_M);
                GameGraphicsResources.wizardFont2.a(CheckboxPainter.field_n, 259, 32 + var9, 360, 480, 0, 0, 1, 0, GameGraphicsResources.wizardFont2.field_M);
                GameGraphicsResources.wizardFont2.a(CheckboxPainter.field_n, 260, 32 + var9, 360, 480, 16777215, -1, 1, 0, GameGraphicsResources.wizardFont2.field_M);
              }
            }
          }
          stackIn_224_0Lifetime1 = EmailCheckRequest.field_h;
          stackIn_224_1Lifetime1 = 2;
          if (stackIn_224_0Lifetime1 == stackIn_224_1Lifetime1) {
            SoftwareRasterizer.fillRect(290, 125, 340, 300, 13158);
            CacheEntry.a(DropTargetWidget.frameSprites, 285, (byte) -110, 310, 350, 120);
            var21 = new StringBuilder(0);
            var5_ref_String = var21.toString();
            if (!ThreePieceFrameHelpers.a(-122)) {
              FlatTriangleRasterizer.font12.a(UiSpriteThemeHelpers.field_e, 289, 370, 340, 64, 0, 0, 1, 1, FlatTriangleRasterizer.font12.field_M);
              FlatTriangleRasterizer.font12.a(UiSpriteThemeHelpers.field_e, 290, 369, 340, 64, 0, 0, 1, 1, FlatTriangleRasterizer.font12.field_M);
              FlatTriangleRasterizer.font12.a(UiSpriteThemeHelpers.field_e, 290, 370, 340, 64, 16744448, -1, 1, 1, FlatTriangleRasterizer.font12.field_M);
              if (null == DualLinkDeque.field_g) {
                DualLinkDeque.field_g = HotspotTextWidget.requestHighscores(10, 2, (byte) 59, 3, 1);
              }
              if (DualLinkDeque.field_g.field_m) {
                if (null != DualLinkDeque.field_g.field_n) {
                  var22 = DualLinkDeque.field_g.field_n[DiskCacheWorker.field_c];
                  var38 = DualLinkDeque.field_g.field_q[DiskCacheWorker.field_c];
                  var3 = 128;
                  var39 = DualLinkDeque.field_g.field_i[DiskCacheWorker.field_c];
                  var9 = 0;
                  var10_ref_ai = BrowserCookieHelpers.field_a;
                  var11Lifetime1 = 0;
                  for (var12Lifetime1 = 0; 11 > var12Lifetime1; var12Lifetime1++) {
                    var13Lifetime1 = 16744448;
                    stackIn_513_0 = ~var12Lifetime1;
                    stackIn_513_1 = -11;
                    if (stackIn_513_0 > stackIn_513_1 &&
                      var9 == 0 &&
                      var10_ref_ai != null &&
                      NineSliceFrame.isCurrentPlayerName(var22[var12Lifetime1], 66) &&
                      var10_ref_ai.field_n == var38[var12Lifetime1] &&
                      RasterSnapshot.field_k == var39[var12Lifetime1]) {
                      var13Lifetime1 = 16777215;
                      var9 = 1;
                    }
                    regionExit1: {
                      if ((var12Lifetime1 >= 10 ||
                        null == var22[var12Lifetime1]) &&
                        (var12Lifetime1 != 10 ||
                        !(RasterSnapshot.field_k > 0) ||
                        var9 != 0)) {
                        if (!(10 <= var12Lifetime1)) {
                          var3 = 24 * var12Lifetime1 + 144;
                          var5_ref_String = 1 + var12Lifetime1 + ".";
                          if (var12Lifetime1 == 0 &&
                            DiskCacheWorker.field_c != 1 &&
                            var11Lifetime1 == 0) {
                            var5_ref_String = DropTargetWidget.field_G;
                          }
                          if (var12Lifetime1 == 1 &&
                            DiskCacheWorker.field_c != 1 &&
                            var11Lifetime1 == 0) {
                            var5_ref_String = ToggleButton.field_G;
                          }
                          if (var12Lifetime1 == 0 &&
                            DiskCacheWorker.field_c == 1 &&
                            var11Lifetime1 == 0) {
                            var5_ref_String = TextLayout.field_b;
                          }
                          if (var12Lifetime1 == 1 &&
                            DiskCacheWorker.field_c == 1 &&
                            var11Lifetime1 == 0) {
                            var5_ref_String = ScoreSubmission.field_s;
                          }
                          if (var11Lifetime1 != 0) {
                            FlatTriangleRasterizer.font12.drawString(var5_ref_String, 322, 10 + var3, 0, -1);
                            FlatTriangleRasterizer.font12.drawString(var5_ref_String, 324, 10 + var3, 0, -1);
                            FlatTriangleRasterizer.font12.drawString(var5_ref_String, 323, var3 + 9, 0, -1);
                            FlatTriangleRasterizer.font12.drawString(var5_ref_String, 323, 11 + var3, 0, -1);
                            FlatTriangleRasterizer.font12.drawString(var5_ref_String, 323, var3 + 10, var13Lifetime1, -1);
                          } else {
                            if (!(1 < var12Lifetime1)) {
                              FlatTriangleRasterizer.font12.drawStringCentered(var5_ref_String, 468, 10 + var3, 0, -1);
                              FlatTriangleRasterizer.font12.drawStringCentered(var5_ref_String, 470, var3 + 10, 0, -1);
                              FlatTriangleRasterizer.font12.drawStringCentered(var5_ref_String, 469, 9 + var3, 0, -1);
                              FlatTriangleRasterizer.font12.drawStringCentered(var5_ref_String, 469, 11 + var3, 0, -1);
                              FlatTriangleRasterizer.font12.drawStringCentered(var5_ref_String, 469, var3 + 10, var13Lifetime1, -1);
                            }
                          }
                        }
                        break regionExit1;
                      }
                      var11Lifetime1 = 1;
                      if (var12Lifetime1 == 0) {
                        FlatTriangleRasterizer.font12.drawString(UsernameLoginCredentials.field_l, 299, 16 + var3, 0, 0);
                        FlatTriangleRasterizer.font12.drawStringRight(NineSliceFrame.field_f, 619, var3 + 16, 0, 0);
                        FlatTriangleRasterizer.font12.drawString(UsernameLoginCredentials.field_l, 300, 16 + (var3 - 1), 0, 0);
                        FlatTriangleRasterizer.font12.drawStringRight(NineSliceFrame.field_f, 620, -1 + (var3 + 16), 0, 0);
                        FlatTriangleRasterizer.font12.drawString(UsernameLoginCredentials.field_l, 300, var3 + 16, 16777215, -1);
                        FlatTriangleRasterizer.font12.drawStringRight(NineSliceFrame.field_f, 620, var3 + 16, 16777215, -1);
                        if ((FlatTriangleRasterizer.font12.stringWidth(HighscoreRequest.field_p) / 2 + 510) < (620 - (FlatTriangleRasterizer.font12.stringWidth(NineSliceFrame.field_f) + 8))) {
                          FlatTriangleRasterizer.font12.drawStringCentered(HighscoreRequest.field_p, 509, 16 + var3, 0, 0);
                          FlatTriangleRasterizer.font12.drawStringCentered(HighscoreRequest.field_p, 510, -1 + var3 + 16, 0, 0);
                          FlatTriangleRasterizer.font12.drawStringCentered(HighscoreRequest.field_p, 510, 16 + var3, 16777215, -1);
                        } else {
                          var14Lifetime1 = -FlatTriangleRasterizer.font12.stringWidth(NineSliceFrame.field_f) + 620 - 8;
                          FlatTriangleRasterizer.font12.drawStringRight(HighscoreRequest.field_p, var14Lifetime1 - 1, var3 + 16, 0, 0);
                          FlatTriangleRasterizer.font12.drawStringRight(HighscoreRequest.field_p, var14Lifetime1, 16 + (var3 - 1), 0, 0);
                          FlatTriangleRasterizer.font12.drawStringRight(HighscoreRequest.field_p, var14Lifetime1, var3 + 16, 16777215, -1);
                        }
                      }
                      var14Lifetime1Lifetime1 = 0;
                      if (var12Lifetime1 < 10 &&
                        null != var22[var12Lifetime1]) {
                        var5_ref_String = 1 + var12Lifetime1 + "." + var22[var12Lifetime1];
                        var14Lifetime1Lifetime1 = var39[var12Lifetime1];
                      } else {
                        if (var12Lifetime1 == 10 &&
                          RasterSnapshot.field_k > 0 &&
                          var9 == 0) {
                          var13Lifetime1 = 16777215;
                          var14Lifetime1Lifetime1 = RasterSnapshot.field_k;
                          var5_ref_String = MonotonicClockHelpers.field_a;
                        }
                      }
                      var15 = 300;
                      var16 = var14Lifetime1Lifetime1 % 64;
                      var17 = (-var16 + var14Lifetime1Lifetime1) / 64;
                      if (0 == var12Lifetime1) {
                        IntHashTable.field_d[0].field_a = var17;
                      }
                      boolean decompiledFrameRemainder1 = true;
                      var3 = 154 + var12Lifetime1 * 22;
                      if (var12Lifetime1 >= 10) {
                        decompiledFrameRemainder1 = (var9 == 0);
                        if ((decompiledFrameRemainder1) &&
                          (RasterSnapshot.field_k <= 0)) {
                          break regionExit1;
                        }
                      }
                      if (decompiledFrameRemainder1) {
                        SoftwareRasterizer.setClip(0, 0, 510 - FlatTriangleRasterizer.font12.stringWidth(MidiEnvelope.field_l) / 2, 640);
                        FlatTriangleRasterizer.font12.drawString(var5_ref_String, 2 + var15, 10 + var3, 0, -1);
                        FlatTriangleRasterizer.font12.drawString(var5_ref_String, var15 + 4, var3 + 10, 0, -1);
                        FlatTriangleRasterizer.font12.drawString(var5_ref_String, 3 + var15, var3 + 9, 0, -1);
                        FlatTriangleRasterizer.font12.drawString(var5_ref_String, var15 + 3, var3 + 11, 0, -1);
                        FlatTriangleRasterizer.font12.drawString(var5_ref_String, var15 + 3, 10 + var3, var13Lifetime1, -1);
                        SoftwareRasterizer.resetClip();
                        var5_ref_String = 1 + var16 / 6 + "-" + (1 + var16 % 6);
                        if (1 + var16 / 6 == 7) {
                          var5_ref_String = MidiEnvelope.field_l;
                        }
                        FlatTriangleRasterizer.font12.drawStringCentered(var5_ref_String, 508, 10 + var3, 0, -1);
                        FlatTriangleRasterizer.font12.drawStringCentered(var5_ref_String, 510, 10 + var3, 0, -1);
                        FlatTriangleRasterizer.font12.drawStringCentered(var5_ref_String, 509, 9 + var3, 0, -1);
                        FlatTriangleRasterizer.font12.drawStringCentered(var5_ref_String, 509, var3 + 11, 0, -1);
                        FlatTriangleRasterizer.font12.drawStringCentered(var5_ref_String, 509, 10 + var3, var13Lifetime1, -1);
                        var25 = Integer.toString(var17);
                        FlatTriangleRasterizer.font12.drawStringRight(var25, 621, 10 + var3, 0, -1);
                        FlatTriangleRasterizer.font12.drawStringRight(var25, 623, 10 + var3, 0, -1);
                        FlatTriangleRasterizer.font12.drawStringRight(var25, 622, var3 + 9, 0, -1);
                        FlatTriangleRasterizer.font12.drawStringRight(var25, 622, var3 + 11, 0, -1);
                        FlatTriangleRasterizer.font12.drawStringRight(var25, 622, 10 + var3, var13Lifetime1, -1);
                      }
                    }
                  }
                } else {
                  FlatTriangleRasterizer.font12.drawStringCentered(PowerOfTwoHelpers.field_a, 466, 248, 16744448, -1);
                }
              } else {
                FlatTriangleRasterizer.font12.drawStringCentered(HighscoreMessages.field_a, 466, 144, 16744448, -1);
              }
              var3 = 418;
            } else {
              FlatTriangleRasterizer.font12.drawStringCentered(ByteStorage.field_c, 466, 248, 16744448, -1);
            }
          }
        }
        ArchiveProvider.field_b.bindRasterTarget(43);
        stackIn_513_0Lifetime1 = 0;
        stackIn_513_1Lifetime1 = FadingDialog.field_I;
        if (stackIn_513_0Lifetime1 < stackIn_513_1Lifetime1) {
          if (FadingDialog.field_I < 256) {
            SoftwareRasterizer.fillRectangleBlended(0, 0, 640, 480, 0, FadingDialog.field_I);
          } else {
            SoftwareRasterizer.fillRectangleBlended(0, 0, 640, 480, 0, -FadingDialog.field_I + 510);
          }
        }
        if (!(-350 >= BufferedSocket.field_a) ||
          GridActor.field_l == 0) {
          var3Lifetime1 = BufferedSocket.field_a;
          if (GridActor.field_l == 0) {
            stackIn_524_0 = (AchievementSubmission.field_q) ? 0 : 1;
            if (stackIn_524_0 != 1) {
            }
          }
          if (BufferedSocket.field_a < 240) {
            BufferedSocket.field_a = BufferedSocket.field_a + 250;
            if (BufferedSocket.field_a > 240) {
              BufferedSocket.field_a = 240;
            }
          }
          var4_intLifetime1 = (-240 + BufferedSocket.field_a) * (-240 + BufferedSocket.field_a) / 120;
          if (BufferedSocket.field_a < 240) {
            var4_intLifetime1 = -var4_intLifetime1;
          }
          var4_intLifetime1 += 240;
          SoftwareRasterizer.fillRect(5 + (-(GameGraphicsResources.wizardFont2.stringWidth(UsernameLoginCredentials.field_j) / 2) + 320 - 16), -11 - GameGraphicsResources.wizardFont2.field_M + var4_intLifetime1, GameGraphicsResources.wizardFont2.stringWidth(UsernameLoginCredentials.field_j) + 32 - 10, -10 + IndexedSpriteArrayFactory.wizardFont.field_M + 16, 13158);
          CacheEntry.a(DropTargetWidget.frameSprites, -16 - GameGraphicsResources.wizardFont2.stringWidth(UsernameLoginCredentials.field_j) / 2 + 320, (byte) -110, 16 + IndexedSpriteArrayFactory.wizardFont.field_M, 32 + GameGraphicsResources.wizardFont2.stringWidth(UsernameLoginCredentials.field_j), var4_intLifetime1 - GameGraphicsResources.wizardFont2.field_M - 16);
          this.drawOutlinedText(var4_intLifetime1, UsernameLoginCredentials.field_j, 16777215, -57, 319);
          if (GridActor.field_l == 0 &&
            GridActor.field_g >= 0) {
            var5Lifetime1 = 64 + var4_intLifetime1;
            if (0 == HuffmanDecoder.field_c &&
              ToggleButton.field_F != UsernameLoginCredentials.field_j) {
              var6Lifetime1 = GameGraphicsResources.wizardFont2.stringWidth(AccountSocketHelpers.field_d);
              SoftwareRasterizer.fillRect(5 + (320 - var6Lifetime1 / 2 - 16), 5 + (-GameGraphicsResources.wizardFont2.field_M + (var5Lifetime1 - 16)), var6Lifetime1 + 32 - 10, 118 + IndexedSpriteArrayFactory.wizardFont.field_M, 13158);
              CacheEntry.a(DropTargetWidget.frameSprites, -16 + (320 - var6Lifetime1 / 2), (byte) -110, IndexedSpriteArrayFactory.wizardFont.field_M + 128, var6Lifetime1 + 32, var5Lifetime1 - GameGraphicsResources.wizardFont2.field_M - 16);
              this.drawOutlinedText(var5Lifetime1, TimedValidator.field_c, 16777215, 123, 319);
              var5Lifetime1 += 32;
              this.drawOutlinedText(var5Lifetime1, WeightedLruCache.formatPlaceholders(new String[]{IntrusiveNode.field_h[SpriteTextStyle.field_S], IntrusiveNode.field_h[AccountFormTextHelpers.field_d]}, (byte) 45, PcmResampler.field_c), 16777215, -83, 319);
              var5Lifetime1 += 32;
              this.drawOutlinedText(var5Lifetime1, WeightedLruCache.formatPlaceholders(new String[]{IntrusiveNode.field_h[SpriteTextStyle.field_S], IntrusiveNode.field_h[AccountFormTextHelpers.field_d]}, (byte) 126, MidiKeyUsage.field_i), 16777215, -91, 319);
              var5Lifetime1 += 32;
            }
            if (1 == HuffmanDecoder.field_c) {
              var6Lifetime1Lifetime1 = 500;
              SoftwareRasterizer.fillRect(304 - var6Lifetime1Lifetime1 / 2 + 5, -GameGraphicsResources.wizardFont2.field_M + (var5Lifetime1 - 16 + 5), -10 + var6Lifetime1Lifetime1 + 32, 96 + (IndexedSpriteArrayFactory.wizardFont.field_M - 10), 13158);
              CacheEntry.a(DropTargetWidget.frameSprites, -16 + (-(var6Lifetime1Lifetime1 / 2) + 320), (byte) -110, IndexedSpriteArrayFactory.wizardFont.field_M + 96, var6Lifetime1Lifetime1 + 32, -16 + (var5Lifetime1 - GameGraphicsResources.wizardFont2.field_M));
              GameGraphicsResources.wizardFont2.a(BrowserCookieHelpers.field_d + " " + MouseWheelInput.field_f, -(var6Lifetime1Lifetime1 / 2) + 320 - 1, 5 + (-16 + var5Lifetime1 - (-4 - (-GameGraphicsResources.wizardFont2.field_M - 1))), var6Lifetime1Lifetime1, 480, 0, 0, 1, 0, GameGraphicsResources.wizardFont2.field_M);
              GameGraphicsResources.wizardFont2.a(BrowserCookieHelpers.field_d + " " + MouseWheelInput.field_f, -(var6Lifetime1Lifetime1 / 2) + 320 - 1, 5 - GameGraphicsResources.wizardFont2.field_M + 4 + (var5Lifetime1 - 16) - 1, var6Lifetime1Lifetime1, 480, 0, 0, 1, 0, GameGraphicsResources.wizardFont2.field_M);
              GameGraphicsResources.wizardFont2.a(BrowserCookieHelpers.field_d + " " + MouseWheelInput.field_f, 320 - var6Lifetime1Lifetime1 / 2, -16 - GameGraphicsResources.wizardFont2.field_M + 4 + (var5Lifetime1 + 5), var6Lifetime1Lifetime1, 480, 16777215, -1, 1, 0, GameGraphicsResources.wizardFont2.field_M);
              var5Lifetime1 += 64;
            }
            if (2 == HuffmanDecoder.field_c) {
              var6Lifetime1Lifetime2 = GameGraphicsResources.wizardFont2.stringWidth(CheckboxPainter.field_a);
              if (GameGraphicsResources.wizardFont2.stringWidth(AccountSocketHelpers.field_d) > var6Lifetime1Lifetime2) {
                var6Lifetime1Lifetime2 = GameGraphicsResources.wizardFont2.stringWidth(AccountSocketHelpers.field_d);
              }
              if (608 >= var6Lifetime1Lifetime2) {
                SoftwareRasterizer.fillRect(5 - var6Lifetime1Lifetime2 / 2 + 320 - 16, -11 + (-GameGraphicsResources.wizardFont2.field_M + var5Lifetime1), -10 + (32 + var6Lifetime1Lifetime2), IndexedSpriteArrayFactory.wizardFont.field_M + 150, 13158);
                CacheEntry.a(DropTargetWidget.frameSprites, 304 - var6Lifetime1Lifetime2 / 2, (byte) -110, IndexedSpriteArrayFactory.wizardFont.field_M + 160, var6Lifetime1Lifetime2 + 32, var5Lifetime1 - GameGraphicsResources.wizardFont2.field_M - 16);
                this.drawOutlinedText(var5Lifetime1, DiskCacheWorker.field_h, 16777215, -102, 319);
                var5Lifetime1 += 32;
                this.drawOutlinedText(var5Lifetime1, CheckboxPainter.field_a, 16777215, -126, 319);
                var5Lifetime1 += 32;
                this.drawOutlinedText(var5Lifetime1, MusicPatchLoader.field_a, 16777215, -35, 319);
                var5Lifetime1 += 32;
              } else {
                var6Lifetime1Lifetime2 = 608;
                SoftwareRasterizer.fillRect(5 - var6Lifetime1Lifetime2 / 2 + 320 - 16, -GameGraphicsResources.wizardFont2.field_M + var5Lifetime1 - 16 + 5, -10 + (32 + var6Lifetime1Lifetime2), 128 + (IndexedSpriteArrayFactory.wizardFont.field_M - 10), 13158);
                CacheEntry.a(DropTargetWidget.frameSprites, 304 - var6Lifetime1Lifetime2 / 2, (byte) -110, IndexedSpriteArrayFactory.wizardFont.field_M + 128, 32 + var6Lifetime1Lifetime2, -GameGraphicsResources.wizardFont2.field_M + var5Lifetime1 - 16);
                var28 = DiskCacheWorker.field_h + " " + CheckboxPainter.field_a + " " + MusicPatchLoader.field_a;
                FlatTriangleRasterizer.font12.a(var28, 32, -20 + var5Lifetime1, 575, 48, 0, 0, 1, 1, 14);
                FlatTriangleRasterizer.font12.a(var28, 32, -20 + var5Lifetime1 - 1, 576, 48, 0, 0, 1, 1, 14);
                FlatTriangleRasterizer.font12.a(var28, 32, var5Lifetime1 - 20, 576, 48, 16777215, -1, 1, 1, 14);
                var5Lifetime1 += 48;
              }
              GameGraphicsResources.gemSprites[0].drawTransparent(222, -20 + var5Lifetime1);
              GameGraphicsResources.gemSprites[2].drawTransparent(254, var5Lifetime1 - 20);
              GameGraphicsResources.gemSprites[1].drawTransparent(286, var5Lifetime1 - 20);
              GameGraphicsResources.gemSprites[3].drawTransparent(318, var5Lifetime1 - 20);
              GameGraphicsResources.gemSprites[4].drawTransparent(350, -20 + var5Lifetime1);
              GameGraphicsResources.gemSprites[6].drawTransparent(382, -20 + var5Lifetime1);
              var5Lifetime1 += 32;
            }
            if (HuffmanDecoder.field_c == 3) {
              var6Lifetime1Lifetime3 = 600;
              SoftwareRasterizer.fillRect(-11 + (-(var6Lifetime1Lifetime3 / 2) + 320), -11 + (-GameGraphicsResources.wizardFont2.field_M + var5Lifetime1), 22 + var6Lifetime1Lifetime3, 160 + (IndexedSpriteArrayFactory.wizardFont.field_M - 10), 13158);
              CacheEntry.a(DropTargetWidget.frameSprites, -16 - var6Lifetime1Lifetime3 / 2 + 320, (byte) -110, 160 + IndexedSpriteArrayFactory.wizardFont.field_M, 32 + var6Lifetime1Lifetime3, -16 + var5Lifetime1 - GameGraphicsResources.wizardFont2.field_M);
              GameGraphicsResources.wizardFont2.a(WeightedLruCache.formatPlaceholders(new String[]{IntrusiveNode.field_h[SpriteTextStyle.field_S], IntrusiveNode.field_h[AccountFormTextHelpers.field_d]}, (byte) 102, StrongCacheEntry.field_w), -(var6Lifetime1Lifetime3 / 2) + 319, var5Lifetime1 - 24, var6Lifetime1Lifetime3, 480, 0, 0, 0, 0, 20);
              GameGraphicsResources.wizardFont2.a(WeightedLruCache.formatPlaceholders(new String[]{IntrusiveNode.field_h[SpriteTextStyle.field_S], IntrusiveNode.field_h[AccountFormTextHelpers.field_d]}, (byte) 61, StrongCacheEntry.field_w), -(var6Lifetime1Lifetime3 / 2) + 320, -25 + var5Lifetime1, var6Lifetime1Lifetime3, 480, 0, 0, 0, 0, 20);
              GameGraphicsResources.wizardFont2.a(WeightedLruCache.formatPlaceholders(new String[]{IntrusiveNode.field_h[SpriteTextStyle.field_S], IntrusiveNode.field_h[AccountFormTextHelpers.field_d]}, (byte) 107, StrongCacheEntry.field_w), -(var6Lifetime1Lifetime3 / 2) + 320, -24 + var5Lifetime1, var6Lifetime1Lifetime3, 480, 16777215, -1, 0, 0, 20);
              var5Lifetime1 += 32;
              var5Lifetime1 -= 24;
              var29 = new String[9];
              var7_ref_String__ = var29;
              for (var8Lifetime1 = 0; var8Lifetime1 < 9; var8Lifetime1++) {
                var7_ref_String__[var8Lifetime1] = ProgressQuery.characterToString((byte) 127, UsernameLoginCredentials.field_g.charAt(var8Lifetime1));
              }
              var8Lifetime1Lifetime1 = 0;
              var9Lifetime1 = 0;
              if (AccountProgressDialog.field_tb == 1) {
                var9Lifetime1 = -80;
              }
              for (var10Lifetime1 = var9Lifetime1 + 440; var10Lifetime1 <= 610 + var9Lifetime1; var10Lifetime1 += 20) {
                ValidationState.selectStarSprites[0].drawScaledIntensity(-140 + var10Lifetime1, 0 + var5Lifetime1, 30, 30, 64);
                GameGraphicsResources.wizardFont2.drawStringCentered(var29[var8Lifetime1Lifetime1], var10Lifetime1 - 140 + 15, var5Lifetime1 + 24, 0, -1);
                GameGraphicsResources.wizardFont2.drawStringCentered(var29[var8Lifetime1Lifetime1], var10Lifetime1 - 125, 26 + var5Lifetime1, 0, -1);
                GameGraphicsResources.wizardFont2.drawStringCentered(var29[var8Lifetime1Lifetime1], -1 + (var10Lifetime1 - 140 + 15), 25 + var5Lifetime1, 0, -1);
                GameGraphicsResources.wizardFont2.drawStringCentered(var29[var8Lifetime1Lifetime1], 15 + var10Lifetime1 - 140 + 1, var5Lifetime1 + 25, 0, -1);
                incrementValue$4 = var8Lifetime1Lifetime1;
                var8Lifetime1Lifetime1++;
                GameGraphicsResources.wizardFont2.drawStringCentered(var7_ref_String__[incrementValue$4], var10Lifetime1 - 140 + 15, var5Lifetime1 + 25, 16777215, -1);
              }
              var8Lifetime1Lifetime2 = 0;
              SoftwareRasterizer.setClip(0, 0, 395 + var9Lifetime1, 480);
              for (var10Lifetime1Lifetime1 = 440 + var9Lifetime1; 610 + var9Lifetime1 >= var10Lifetime1Lifetime1; var10Lifetime1Lifetime1 += 20) {
                ValidationState.selectStarSprites[0].drawScaled(-140 + var10Lifetime1Lifetime1, var5Lifetime1 + 0, 30, 30);
                incrementValue$3 = var8Lifetime1Lifetime2;
                var8Lifetime1Lifetime2++;
                GameGraphicsResources.wizardFont2.drawStringCentered(var7_ref_String__[incrementValue$3], 15 + var10Lifetime1Lifetime1 - 140, var5Lifetime1 + 25, 0, -1);
                stackIn_567_0 = ~NetworkArchiveRequest.field_x;
                stackIn_567_1 = -101;
                if (stackIn_567_0 < stackIn_567_1 &&
                  NetworkArchiveRequest.field_x < 110) {
                  ValidationState.selectStarSprites[0].drawScaled(-140 + (var10Lifetime1Lifetime1 + 5), 5 + var5Lifetime1, 20, 20);
                }
              }
              SoftwareRasterizer.resetClip();
              var5Lifetime1 += 24;
              var5Lifetime1 += 32;
              GameGraphicsResources.wizardFont2.a(ArchiveReadinessHelpers.field_c + " " + LoginCredentialKind.field_e, -(var6Lifetime1Lifetime3 / 2) + 320, -25 + var5Lifetime1, var6Lifetime1Lifetime3, 480, 0, 0, 1, 0, 20);
              GameGraphicsResources.wizardFont2.a(ArchiveReadinessHelpers.field_c + " " + LoginCredentialKind.field_e, 319 - var6Lifetime1Lifetime3 / 2, var5Lifetime1 - 24, var6Lifetime1Lifetime3, 480, 0, 0, 1, 0, 20);
              GameGraphicsResources.wizardFont2.a(ArchiveReadinessHelpers.field_c + " " + LoginCredentialKind.field_e, 320 - var6Lifetime1Lifetime3 / 2, var5Lifetime1 - 24, var6Lifetime1Lifetime3, 480, 16777215, -1, 1, 0, 20);
              var5Lifetime1 += 64;
            }
            stackIn_567_0Lifetime1 = -5;
            stackIn_567_1Lifetime1 = ~HuffmanDecoder.field_c;
            if (stackIn_567_0Lifetime1 == stackIn_567_1Lifetime1) {
              var6Lifetime1Lifetime4 = GameGraphicsResources.wizardFont2.stringWidth(IntrusiveNodeHashTable.field_b);
              SoftwareRasterizer.fillRect(-11 - var6Lifetime1Lifetime4 / 2 + 320, -GameGraphicsResources.wizardFont2.field_M + var5Lifetime1 - 11, 22 + var6Lifetime1Lifetime4, 96 + (IndexedSpriteArrayFactory.wizardFont.field_M - 10), 13158);
              CacheEntry.a(DropTargetWidget.frameSprites, -16 + (-(var6Lifetime1Lifetime4 / 2) + 320), (byte) -110, IndexedSpriteArrayFactory.wizardFont.field_M + 96, var6Lifetime1Lifetime4 + 32, -16 + var5Lifetime1 - GameGraphicsResources.wizardFont2.field_M);
              GameGraphicsResources.wizardFont2.a(IntrusiveNodeHashTable.field_b + " " + MidiNoteMixer.field_r, 320 - var6Lifetime1Lifetime4 / 2, -25 + var5Lifetime1, var6Lifetime1Lifetime4, 480, 0, 0, 1, 0, 22);
              GameGraphicsResources.wizardFont2.a(IntrusiveNodeHashTable.field_b + " " + MidiNoteMixer.field_r, -(var6Lifetime1Lifetime4 / 2) + 319, -24 + var5Lifetime1, var6Lifetime1Lifetime4, 480, 0, 0, 1, 0, 22);
              GameGraphicsResources.wizardFont2.a(IntrusiveNodeHashTable.field_b + " " + MidiNoteMixer.field_r, 320 - var6Lifetime1Lifetime4 / 2, var5Lifetime1 - 24, var6Lifetime1Lifetime4, 480, 16777215, -1, 1, 0, 22);
              var5Lifetime1 += 64;
            }
            if (HuffmanDecoder.field_c == 5) {
              var6Lifetime1Lifetime5 = GameGraphicsResources.wizardFont2.stringWidth(AccountSocketHelpers.field_d);
              SoftwareRasterizer.fillRect(-11 - var6Lifetime1Lifetime5 / 2 + 320, -11 + var5Lifetime1 - GameGraphicsResources.wizardFont2.field_M, var6Lifetime1Lifetime5 + 22, 128 + IndexedSpriteArrayFactory.wizardFont.field_M - 10, 13158);
              CacheEntry.a(DropTargetWidget.frameSprites, 304 - var6Lifetime1Lifetime5 / 2, (byte) -110, IndexedSpriteArrayFactory.wizardFont.field_M + 128, var6Lifetime1Lifetime5 + 32, -16 + (var5Lifetime1 - GameGraphicsResources.wizardFont2.field_M));
              this.drawOutlinedText(var5Lifetime1, DualLinkNodeHashTable.field_c, 16777215, -52, 319);
              var5Lifetime1 += 32;
              this.drawOutlinedText(var5Lifetime1, HuffmanDecoder.field_a, 16777215, 78, 319);
              var5Lifetime1 += 32;
              this.drawOutlinedText(var5Lifetime1, RadialSelectorWidget.field_P, 16777215, 95, 319);
              var5Lifetime1 += 32;
            }
            var5Lifetime1 += 16;
            stackIn_574_0 = !(AchievementSubmission.field_q);
            if (stackIn_574_0) {
              this.drawOutlinedText(var5Lifetime1, AccountSocketHelpers.field_d, 16777215, -74, 319);
            }
          }
          BufferedSocket.field_a = var3Lifetime1;
        }
        if (GameApplet.field_e != null) {
          GameApplet.field_e.drawMenuItems(40);
        }
        if (1 == EmailCheckRequest.field_h ||
          EmailCheckRequest.field_h == 2 ||
          EmailCheckRequest.field_h == 5) {
          var30 = AccountFormText.field_a;
          CacheEntry.a(LoginForm.field_E, 0, (byte) -110, 44, 88, 436);
          var4_intLifetime2 = 16776960;
          if (this.field_N != 0) {
            if ((this.field_N == -1) &&
              (!(0 > AchievementSubmission.field_n)) &&
              (!(AchievementSubmission.field_n >= 88)) &&
              (!(NetworkArchiveRequest.field_B < 436))) {
              var4_intLifetime2 = 16777215;
              if ((BrowserUrlLauncher.field_c == 1 ||
                BufferedSocket.field_p[84]) && EncryptedLoginHelpers.field_c < 32) {
                EncryptedLoginHelpers.field_c = 32;
              }
            }
          } else {
            var4_intLifetime2 = 16777215;
            if ((BrowserUrlLauncher.field_c == 1 ||
              BufferedSocket.field_p[84]) && EncryptedLoginHelpers.field_c < 32) {
              EncryptedLoginHelpers.field_c = 32;
            }
          }
          this.drawBorderedText(-12926, var30, var4_intLifetime2, 44, 458 + GameGraphicsResources.wizardFont2.field_M / 4);
          if (EmailCheckRequest.field_h == 5 &&
            AgeValidator.field_l > 0) {
            var4_intLifetime2Lifetime1 = -32 - IndexedSpriteArrayFactory.wizardFont.stringWidth(var30) + 640;
            var31 = WrappedTextLayout.field_m;
            var4_intLifetime2Lifetime1 = var4_intLifetime2Lifetime1 - (GameGraphicsResources.wizardFont2.stringWidth(var31) + 32);
            CacheEntry.a(LoginForm.field_E, var4_intLifetime2Lifetime1, (byte) -110, 44, 32 + GameGraphicsResources.wizardFont2.stringWidth(var31), 436);
            var5Lifetime2 = 16776960;
            if (this.field_N == 1 ||
              !(AchievementSubmission.field_n < var4_intLifetime2Lifetime1) &&
              !(AchievementSubmission.field_n >= (GameGraphicsResources.wizardFont2.stringWidth(var31) + 32 + var4_intLifetime2Lifetime1)) &&
              !(436 > NetworkArchiveRequest.field_B) &&
              this.field_N == -1) {
              if ((BrowserUrlLauncher.field_c != 0 ||
                BufferedSocket.field_p[84]) &&
                0 == EncryptedLoginHelpers.field_c) {
                DualLinkDeque.field_i = 3;
                EncryptedLoginHelpers.field_c = 32;
              }
              var5Lifetime2 = 16777215;
            }
            this.drawBorderedText(-12926, var31, var5Lifetime2, 16 + var4_intLifetime2Lifetime1 + GameGraphicsResources.wizardFont2.stringWidth(var31) / 2, 458 + GameGraphicsResources.wizardFont2.field_M / 4);
          }
          if (EmailCheckRequest.field_h == 2 &&
            !ThreePieceFrameHelpers.a(-108)) {
            var4_intLifetime2Lifetime2 = 88;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 <= 2; var5Lifetime2Lifetime1++) {
              var4_intLifetime2Lifetime2 += 8;
              var6Lifetime2 = 176;
              var3_ref_String = NodeHashTableIterator.field_l[var5Lifetime2Lifetime1];
              CacheEntry.a(LoginForm.field_E, var4_intLifetime2Lifetime2, (byte) -110, 44, var6Lifetime2, 436);
              var7Lifetime1 = 16776960;
              stackIn_651_0 = ~DiskCacheWorker.field_c;
              stackIn_651_1 = ~var5Lifetime2Lifetime1;
              if (stackIn_651_0 == stackIn_651_1) {
                var7Lifetime1 = 16711680;
              }
              if (this.field_N == var5Lifetime2Lifetime1 + 1 ||
                this.field_N == -1 &&
                !(AchievementSubmission.field_n < var4_intLifetime2Lifetime2) &&
                !(AchievementSubmission.field_n >= var6Lifetime2 + var4_intLifetime2Lifetime2) &&
                !(NetworkArchiveRequest.field_B < 436)) {
                if (BrowserUrlLauncher.field_c != 0 ||
                  BufferedSocket.field_p[84]) {
                  DiskCacheWorker.field_c = var5Lifetime2Lifetime1;
                }
                var7Lifetime1 = (var7Lifetime1 != 16711680) ? 16777215 : 16744576;
              }
              this.drawBorderedText(-12926, var3_ref_String, var7Lifetime1, var4_intLifetime2Lifetime2 + var6Lifetime2 / 2, GameGraphicsResources.wizardFont2.field_M / 4 + 458);
              var4_intLifetime2Lifetime2 = var4_intLifetime2Lifetime2 + var6Lifetime2;
            }
          }
          if (ThreePieceFrameHelpers.a(-128) && (2 == EmailCheckRequest.field_h ||
            EmailCheckRequest.field_h == 5)) {
            var3_ref_StringLifetime1 = SoundCache.field_b;
            CacheEntry.a(LoginForm.field_E, 96, (byte) -110, 44, 176, 436);
            var4_intLifetime2Lifetime3 = 16776960;
            if (this.field_N == 1 ||
              !(96 >= AchievementSubmission.field_n) &&
              !(AchievementSubmission.field_n >= 264) &&
              !(NetworkArchiveRequest.field_B < 436) &&
              -1 == this.field_N) {
              if (BrowserUrlLauncher.field_c != 0 ||
                BufferedSocket.field_p[84]) {
                SocketJs5Transport.a(EmailCheckRequest.field_h, EmailCheckRequest.field_h, -128);
              }
              var4_intLifetime2Lifetime3 = 16777215;
            }
            this.drawBorderedText(-12926, var3_ref_StringLifetime1, var4_intLifetime2Lifetime3, 184, 458 + GameGraphicsResources.wizardFont2.field_M / 4);
          }
        }
        stackIn_651_0Lifetime1 = -10;
        stackIn_651_1Lifetime1 = ~EmailCheckRequest.field_h;
        if (stackIn_651_0Lifetime1 == stackIn_651_1Lifetime1) {
          SoftwareRasterizer.fillRect(0, 0, 640, 480, 0);
          RasterBuffer.loadMembershipBenefitsGraphics(2);
        }
        var3Lifetime2 = 8 / ((param0 + 43) / 50);
        if (EmailCheckRequest.field_h == 6) {
          var32 = FlatTriangleRasterizer.font12;
          var5Lifetime3 = 180 + var32.field_M;
          var6Lifetime3 = 4 + (var32.field_B + var32.field_q);
          SoftwareRasterizer.fillRectangleBlended(40, 170, 560, 20 + (120 + 5 * var6Lifetime3), 0, 192);
          CacheEntry.a(DropTargetWidget.frameSprites, 31, (byte) -110, 14 + (20 + (5 * var6Lifetime3 + 120)), 578, 163);
          var32.drawStringCentered(FullscreenFailureDialog.field_U, 320, var5Lifetime3, 16777215, -1);
          stackIn_657_0 = var32;
          stackIn_658_1 = (0 == AgeValidator.field_l) ? false : true;
          stackIn_661_2 = (PasswordFieldPainter.field_u.isEmpty(8192)) ? false : true;
          stackIn_664_3 = (DiskCacheStore.field_f == 0) ? false : true;
          ((MonochromeBitmapFont) (Object) stackIn_657_0).drawStringCentered(MusicPatch.getSavePrompt(stackIn_658_1, stackIn_661_2, stackIn_664_3, 26505), 320, var5Lifetime3 + var6Lifetime3, 16777215, -1);
          if (this.a(var5Lifetime3 + 4 * var6Lifetime3, 320, 65535, DiskCacheWorker.field_d, 1)) {
          }
          stackIn_667_0 = var32;
          stackIn_668_1 = (AgeValidator.field_l == 0) ? false : true;
          stackIn_670_2 = 2;
          stackIn_671_3 = (DiskCacheStore.field_f == 0) ? false : true;
          stackIn_674_4 = (PasswordFieldPainter.field_u.isEmpty(8192)) ? false : true;
          ((MonochromeBitmapFont) (Object) stackIn_667_0).drawStringCentered(EmailLoginCredentials.getDiscardAlternativePrefix(stackIn_668_1, stackIn_670_2, stackIn_671_3, stackIn_674_4), 320, (int)(2.5 * (double)var6Lifetime3) + var5Lifetime3 + 60, 16777215, -1);
          discarded$5 = this.a(60 + (var6Lifetime3 / 2 + var6Lifetime3 * 5 + var5Lifetime3), 320, 65535, ContentTransitionDialog.field_X, 1);
          stackIn_676_0 = var32;
          stackIn_677_1 = (0 == DiskCacheStore.field_f) ? false : true;
          stackIn_679_2 = -3567;
          stackIn_679_3 = false;
          stackIn_680_4 = (0 == AgeValidator.field_l) ? false : true;
          ((MonochromeBitmapFont) (Object) stackIn_676_0).drawStringCentered(ValidationHelpWidget.getDiscardPrompt(stackIn_677_1, stackIn_679_2, stackIn_679_3, stackIn_680_4), 320, 120 + (var5Lifetime3 + 4 * var6Lifetime3), 16777215, -1);
        }
        if (EmailCheckRequest.field_h == 7) {
          NameCheckHelpers.a(0);
          EmailCheckRequest.field_h = 8;
        } else {
          if (EmailCheckRequest.field_h == 8) {
            if (ThreePieceFrameHelpers.a(-113)) {
              EmailCheckRequest.field_h = AccountPacketState.field_c;
            } else {
              EmailCheckRequest.field_h = ProgressDialog.field_Y;
              if (EmailCheckRequest.field_h == 10) {
                GameApplet.a(7775, HuffmanDecoder.field_c + GridActor.field_l * 6 + DiskCacheStore.field_f * 64);
                DecodedSpritePalette.field_a = DecodedSpritePalette.field_a + (DiskCacheStore.field_f << 6);
                LoadingMessageHelpers.field_f = LoadingMessageHelpers.field_f + (-6 + HuffmanDecoder.field_c);
                HighscorePlayer.field_b = HighscorePlayer.field_b - (6 * GridActor.field_l + 1);
                stackIn_690_1 = !(ArchiveProvider.field_a <= 0);
                this.field_J = stackIn_690_1;
                DiskCacheStore.field_f = 0;
                GridActor.field_l = -1;
                HuffmanDecoder.field_c = 6;
                EmailCheckRequest.field_h = 2;
                if (AgeValidator.field_l > 0) {
                  EmailCheckRequest.field_h = 5;
                }
              }
            }
          }
        }
        if (this.field_I > 0 &&
          GameApplet.field_e == null) {
          SoftwareRasterizer.fillRect(0, 0, 640, 480, 0);
        }
        if (IntegerMathHelpers.field_a > 0) {
          SoftwareRasterizer.fillRectangleBlended(0, 0, 640, 480, 0, IntegerMathHelpers.field_a);
        }
        if (EncryptedLoginHelpers.field_c > 0) {
          if (EncryptedLoginHelpers.field_c < 256) {
            SoftwareRasterizer.fillRectangleBlended(0, 0, 640, 480, 0, EncryptedLoginHelpers.field_c);
          } else {
            SoftwareRasterizer.fillRectangleBlended(0, 0, 640, 480, 0, 512 - EncryptedLoginHelpers.field_c);
          }
        }
        if (TickClock.field_d) {
          AudioServiceThread.field_b.drawAlpha(0, 0, EncryptedLoginHelpers.field_c);
          var4 = AccountFormText.field_a;
          CacheEntry.a(LoginForm.field_E, 0, (byte) -110, 44, 88, 436);
          var5Lifetime4 = 16776960;
          if (0 == this.field_N ||
            this.field_N == -1 &&
            !(AchievementSubmission.field_n < 0) &&
            !(88 <= AchievementSubmission.field_n) &&
            !(436 > NetworkArchiveRequest.field_B)) {
            if (BrowserUrlLauncher.field_c == 1 ||
              BufferedSocket.field_p[84]) {
              TextButton.field_D = true;
            }
            var5Lifetime4 = 16777215;
          }
          this.drawBorderedText(-12926, var4, var5Lifetime4, 44, 458 + GameGraphicsResources.wizardFont2.field_M / 4);
        }
        var33_ref = (AchievementUnlock) (ArchiveLoadingPlan.field_b.first((byte) 87));
        if (var33_ref != null) {
          var6Lifetime4 = this.field_M;
          if (80 > var6Lifetime4) {
            var5Lifetime5 = var6Lifetime4 / 2 - 32;
          } else {
            if (var6Lifetime4 < 230) {
              var5Lifetime5 = 8;
            } else {
              var5Lifetime5 = 123 - var6Lifetime4 / 2;
            }
          }
          SoftwareRasterizer.fillRect(4, var5Lifetime5 - 4, 48 + GameGraphicsResources.wizardFont2.stringWidth(SpriteState.field_t[var33_ref.field_n]), 40, 13158);
          CacheEntry.a(DropTargetWidget.frameSprites, 0, (byte) -110, 48, 8 + (GameGraphicsResources.wizardFont2.stringWidth(SpriteState.field_t[var33_ref.field_n]) + 48), var5Lifetime5 - 8);
          FullscreenFocusCanvas.field_a[var33_ref.field_n].drawScaled(8, var5Lifetime5, 32, 32);
          GameGraphicsResources.wizardFont2.drawString(SpriteState.field_t[var33_ref.field_n], 48, GameGraphicsResources.wizardFont2.field_M + var5Lifetime5, 16776960, -1);
        }
        if (!StringPaddingHelpers.isMenuScreenActive(-25231)) {
          if (ArchiveContainerHelpers.b(70)) {
            MenuOverlayHelpers.drawDimmedMenuOverlay(EmailDomainHelpers.a(255), false);
          }
        } else {
          SoftwareRasterizer.fillRectangleBlended(0, 0, 640, 480, 0, 128);
          SoftwareRasterizer.fillRect(-3 - IntrusiveDequeCursor.getMenuHeight((byte) -117) / 2 + 320, 240 - (GrowableIntList.getMenuWidth((byte) 47) / 2 + 5), 6 + IntrusiveDequeCursor.getMenuHeight((byte) 84), 10 + GrowableIntList.getMenuWidth((byte) 47), 0);
          RankingRequest.a(72);
        }
        if (PasswordFieldPainter.field_w) {
          GameGraphicsResources.wizardFont2.drawStringCentered("DEBUG PAUSE ON: PRESS 'V' TO CONTINUE", 320, 460, 16711680, 0);
        }
        DateFormattingHelpers.presentRaster((byte) 80, 0, var19, 0);
        return;
    }

    private final void openResourceArchives(int param0) {
        if (null != SpriteFilterHelpers.field_b) {
          UiWidget.loadGameTextResources(-37, SpriteFilterHelpers.field_b);
          SpriteFilterHelpers.field_b = null;
          GameGraphicsResources.b(0);
        }
        SingleChildWidget.field_E = BufferedRandomAccessFile.createDefaultArchive(87, 1);
        AccountProgressDialog.field_jb = BufferedRandomAccessFile.createDefaultArchive(92, 2);
        SingleChildWidget.soundArchive = BufferedRandomAccessFile.createDefaultArchive(-117, 3);
        SpriteButtonPainter.bossSoundArchive = BufferedRandomAccessFile.createDefaultArchive(-118, 4);
        int var2 = -60 / ((param0 - 39) / 38);
        PlatformActor.field_u = BufferedRandomAccessFile.createDefaultArchive(-106, 6);
        TickClock.field_b = BufferedRandomAccessFile.createDefaultArchive(-90, 5);
        RankingWorkspaceHelpers.field_a = BufferedRandomAccessFile.createDefaultArchive(84, 7);
        AccountSocketHelpers.setMembershipArchives(UsernameLoginCredentials.field_h, TickClock.field_c, (byte) 109);
    }

    final static int a(byte param0, int param1) {
        param1 = param1 & 8191;
        int var2 = 79 / ((15 - param0) / 52);
        if (param1 < 4096) {
          return 2048 > param1 ? Base37Codec.field_b[2048 - param1] : -Base37Codec.field_b[param1 - 2048];
        }
        return param1 < 6144 ? -Base37Codec.field_b[6144 - param1] : Base37Codec.field_b[param1 - 6144];
    }

    private final boolean a(int param0, int param1, int param2, String param3, int param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        try {
          var6_int = GameGraphicsResources.wizardFont2.stringWidth(param3);
          param1 = param1 + var6_int / 2;
          CacheEntry.a(LoginForm.field_E, param1 - (var6_int + 16), (byte) -110, GameGraphicsResources.wizardFont2.field_M + 32, 32 + var6_int, param0 - GameGraphicsResources.wizardFont2.field_M - 16);
          if (param4 != 1) {
            this.field_R = 17;
          }
          if (AchievementSubmission.field_n > -var6_int + param1 - 16 &&
            16 + param1 >= AchievementSubmission.field_n &&
            NetworkArchiveRequest.field_B > (-GameGraphicsResources.wizardFont2.field_M + param0 - 16) &&
            16 + param0 >= NetworkArchiveRequest.field_B) {
            param2 = (65535 == param2) ? 16777215 : 0;
          }
          if (param2 == 65535) {
            param2 = 15583488;
          }
          this.drawBorderedText(param4 - 12927, param3, param2, param1 - 2 - GameGraphicsResources.wizardFont2.stringWidth(param3) / 2, -4 + param0);
          if (param2 != 16777215) {
            return false;
          }
          if (BrowserUrlLauncher.field_c == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("wizardrun.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void updateGameState(int param0) {
        try {
          int fieldTemp$0 = 0;
          int[] dupTemp$4 = null;
          int incrementValue$1 = 0;
          int incrementValue$2 = 0;
          int incrementValue$3 = 0;
          int fieldTemp$5 = 0;
          int fieldTemp$6 = 0;
          GridPoint dupTemp$7 = null;
          GridPoint dupTemp$8 = null;
          int fieldTemp$9 = 0;
          int fieldTemp$10 = 0;
          int fieldTemp$11 = 0;
          int fieldTemp$12 = 0;
          GridPoint dupTemp$13 = null;
          GridPoint dupTemp$14 = null;
          int fieldTemp$15 = 0;
          int fieldTemp$16 = 0;
          int fieldTemp$17 = 0;
          int fieldTemp$18 = 0;
          int fieldTemp$19 = 0;
          int fieldTemp$20 = 0;
          int fieldTemp$21 = 0;
          int fieldTemp$22 = 0;
          int fieldTemp$23 = 0;
          GridPoint dupTemp$24 = null;
          GridPoint dupTemp$25 = null;
          int fieldTemp$26 = 0;
          MonochromeBitmapFont stackIn_30_0 = null;
          boolean stackIn_31_1 = false;
          int stackIn_33_2;
          boolean stackIn_33_3;
          boolean stackIn_34_4;
          int stackIn_38_0 = 0;
          boolean stackIn_39_1 = false;
          int stackIn_113_0 = 0;
          int stackIn_113_1 = 0;
          int stackIn_138_0 = 0;
          int stackIn_138_1 = 0;
          int stackIn_323_0 = 0;
          int stackIn_323_1 = 0;
          int stackIn_540_0 = 0;
          int stackIn_540_1 = 0;
          int stackIn_594_0 = 0;
          int stackIn_595_1 = 0;
          int stackIn_688_0 = 0;
          int stackIn_688_1 = 0;
          int stackIn_759_0 = 0;
          int stackIn_759_1 = 0;
          int stackIn_766_0 = 0;
          int stackIn_767_1 = 0;
          boolean stackIn_777_0 = false;
          int stackIn_789_0 = 0;
          int stackIn_789_1 = 0;
          int stackIn_820_0 = 0;
          int stackIn_855_0 = 0;
          int stackIn_855_1 = 0;
          Throwable decompiledCaughtException = null;
          int var2 = 0;
          GridPoint var2_ref_ob = null;
          int var3 = 0;
          int var4 = 0;
          byte[] var4_ref_byte__ = null;
          int var5 = 0;
          int var6_int = 0;
          Exception var6 = null;
          int var7 = 0;
          int var8 = 0;
          GridPoint var9 = null;
          GridPoint var10 = null;
          MonochromeBitmapFont var11 = null;
          byte[] var12 = null;
          GridPoint var13 = null;
          GridPoint var14 = null;
          byte[] var15 = null;
          int stackIn_113_0Lifetime1;
          int stackIn_113_1Lifetime1;
          int stackIn_138_0Lifetime1;
          int stackIn_138_1Lifetime1;
          int stackIn_323_0Lifetime1;
          int stackIn_323_1Lifetime1;
          int stackIn_540_0Lifetime1;
          int stackIn_540_1Lifetime1;
          int stackIn_688_0Lifetime1;
          int stackIn_688_1Lifetime1;
          int stackIn_759_0Lifetime1;
          int stackIn_759_1Lifetime1;
          int stackIn_789_0Lifetime1;
          int stackIn_789_1Lifetime1;
          int stackIn_855_0Lifetime1;
          int stackIn_855_0Lifetime2;
          int stackIn_855_1Lifetime1;
          int stackIn_855_1Lifetime2;
          int var7Lifetime1;
          var8 = field_H;
          if (EmailCheckRequest.field_h == 2 &&
            0 < AgeValidator.field_l) {
            EmailCheckRequest.field_h = 5;
          }
          if (SpriteState.field_y > 0) {
            SpriteState.field_y = SpriteState.field_y - 1;
          }
          if (EmailCheckRequest.field_h == 0) {
            this.field_N = 0;
            this.field_K = AchievementSubmission.field_n;
            this.field_S = NetworkArchiveRequest.field_B;
          }
          if (AchievementSubmission.field_n != this.field_K ||
            ~NetworkArchiveRequest.field_B != ~this.field_S ||
            BrowserUrlLauncher.field_c == 1) {
            this.field_K = AchievementSubmission.field_n;
            this.field_S = NetworkArchiveRequest.field_B;
            this.field_N = -1;
          }
          if (6 == EmailCheckRequest.field_h) {
            var11 = FlatTriangleRasterizer.font12;
            var3 = 180 + var11.field_M;
            var4 = 4 + (var11.field_B + var11.field_q);
            var6_int = 320;
            var5 = GameGraphicsResources.wizardFont2.stringWidth(DiskCacheWorker.field_d);
            var7 = var4 * 4 + var3;
            var6_int = var6_int + var5 / 2;
            if (-16 - var5 + var6_int < AchievementSubmission.field_n &&
              AchievementSubmission.field_n <= (16 + var6_int) &&
              (-GameGraphicsResources.wizardFont2.field_M + var7 - 16) < NetworkArchiveRequest.field_B &&
              NetworkArchiveRequest.field_B <= var7 + 16 &&
              1 == UiThemeSetupHelpers.field_c) {
              SocketJs5Transport.a(6, 10, -127);
            }
            var6_int = 320;
            var5 = GameGraphicsResources.wizardFont2.stringWidth(ContentTransitionDialog.field_X);
            var7Lifetime1 = 60 + (var4 / 2 + var3) + var4 * 5;
            var6_int = var6_int + var5 / 2;
            if ((-var5 + var6_int - 16) < AchievementSubmission.field_n &&
              AchievementSubmission.field_n <= (var6_int + 16) &&
              NetworkArchiveRequest.field_B > (-16 + (-GameGraphicsResources.wizardFont2.field_M + var7Lifetime1)) &&
              16 + var7Lifetime1 >= NetworkArchiveRequest.field_B &&
              UiThemeSetupHelpers.field_c == 1) {
              RasterSnapshot.field_k = 0;
              AgeValidator.field_l = 0;
              PasswordFieldPainter.field_u.clear(false);
              SavedDataSubmission.field_l.clear(false);
              BufferedSocket.field_a = -350;
              EmailCheckRequest.field_h = 9;
              TextButton.field_A = 0;
              DisplayNameForm.a(0, true);
            }
            stackIn_30_0 = var11;
            stackIn_31_1 = (DiskCacheStore.field_f == 0) ? false : true;
            stackIn_33_2 = -3567;
            stackIn_33_3 = false;
            stackIn_34_4 = (AgeValidator.field_l == 0) ? false : true;
            ((MonochromeBitmapFont) (Object) stackIn_30_0).drawStringCentered(ValidationHelpWidget.getDiscardPrompt(stackIn_31_1, stackIn_33_2, stackIn_33_3, stackIn_34_4), 320, var4 * 4 + (var3 + 120), 16777215, -1);
          }
          if (EmailCheckRequest.field_h == 9) {
            stackIn_38_0 = param0 - 54;
            stackIn_39_1 = (ArchiveContainerHelpers.b(98)) ? false : true;
            var2 = ContentTransitionPhase.a(stackIn_38_0, stackIn_39_1);
            if (var2 == 3) {
              SpriteState.openSubscriptionPage(DisplayNameValidator.getActiveApplet(param0 ^ 641), true);
            }
            if (1 == var2) {
              if (EncryptedLoginHelpers.field_c <= 0) {
                EncryptedLoginHelpers.field_c = EncryptedLoginHelpers.field_c + 32;
              }
              this.field_N = 0;
            }
            this.field_J = true;
            if (var2 == 2) {
              if (EncryptedLoginHelpers.field_c <= 0) {
                EncryptedLoginHelpers.field_c = EncryptedLoginHelpers.field_c + 32;
              }
              this.field_N = -1;
            }
          }
          if (5 == EmailCheckRequest.field_h) {
            if (UiThemeSetupHelpers.field_c != 0 &&
              BeveledFrameFactory.field_f != -1) {
              if (~HyperlinkPainter.field_a == ~BeveledFrameFactory.field_f) {
                HyperlinkPainter.field_a = -1;
              } else {
                HyperlinkPainter.field_a = BeveledFrameFactory.field_f;
              }
            }
          } else {
            HyperlinkPainter.field_a = -1;
          }
          if (TickClock.field_d) {
            if (!TextButton.field_D) {
              if (256 > EncryptedLoginHelpers.field_c) {
                EncryptedLoginHelpers.field_c = EncryptedLoginHelpers.field_c + 32;
              }
            } else {
              if (EncryptedLoginHelpers.field_c > 0) {
                EncryptedLoginHelpers.field_c = EncryptedLoginHelpers.field_c - 32;
              }
              if (EncryptedLoginHelpers.field_c == 0) {
                TextButton.field_D = false;
                TickClock.field_d = false;
              }
            }
            while (EmailValidationError.pollKeyboardEvent(param0 ^ 706)) {
              if (MidiNote.field_r != 13 &&
                !BufferedSocket.field_p[84]) {
                continue;
              }
              TextButton.field_D = true;
            }
          } else {
            if (BufferedSocket.field_a >= 240) {
              BufferedSocket.field_a = BufferedSocket.field_a - 8;
              if (BufferedSocket.field_a < 240) {
                if (GridActor.field_l == 0 &&
                  !AchievementSubmission.field_q &&
                  GridActor.field_g >= 0) {
                  BufferedSocket.field_a = 240;
                }
                if (BufferedSocket.field_p[84] ||
                  BufferedSocket.field_p[13] ||
                  BrowserUrlLauncher.field_c != 0) {
                  BufferedSocket.field_a = -10;
                }
              }
            } else {
              if (BufferedSocket.field_a > -1000) {
                BufferedSocket.field_a = BufferedSocket.field_a - 8;
              }
            }
            if (ArchiveLoadingPlan.field_b.first((byte) 55) != null) {
              fieldTemp$0 = this.field_M + 1;
              this.field_M = this.field_M + 1;
              if (335 == fieldTemp$0) {
                this.field_M = 0;
                ArchiveLoadingPlan.field_b.removeFirst(-40);
              }
            }
            if (this.field_I > 0) {
              this.field_I = this.field_I - 1;
            }
            if (0 < EncryptedLoginHelpers.field_c) {
              EncryptedLoginHelpers.field_c = EncryptedLoginHelpers.field_c + 32;
              if (256 == EncryptedLoginHelpers.field_c) {
                if (EmailCheckRequest.field_h == 0) {
                  if (DualLinkDeque.field_i == 1) {
                    EmailCheckRequest.field_h = 1;
                  }
                  if (DualLinkDeque.field_i == 3) {
                    EmailCheckRequest.field_h = 2;
                  }
                  if (4 == DualLinkDeque.field_i) {
                    EmailCheckRequest.field_h = 5;
                  }
                  if (DualLinkDeque.field_i == 5) {
                    EmailCheckRequest.field_h = 11;
                  }
                } else {
                  if (EmailCheckRequest.field_h == 5 &&
                    AgeValidator.field_l > 0 &&
                    DualLinkDeque.field_i == 3) {
                    AgeValidator.field_l = 0;
                    EmailCheckRequest.field_h = 2;
                  } else {
                    if (5 == EmailCheckRequest.field_h) {
                      AgeValidator.field_l = 0;
                    }
                    if (EmailCheckRequest.field_h == 2) {
                      DualLinkDeque.field_g = null;
                    }
                    EmailCheckRequest.field_h = 0;
                    if (!this.field_J) {
                      DisplayNameForm.a(0, true);
                      this.field_J = true;
                      EmailCheckRequest.field_h = 9;
                    }
                  }
                }
              }
              if (EncryptedLoginHelpers.field_c >= 512) {
                EncryptedLoginHelpers.field_c = 0;
              }
            } else {
              if (EmailCheckRequest.field_h == 0 &&
                null == GameApplet.field_e &&
                2 != DialogLayer.field_K) {
                if (EditableTextWidget.field_R.length > AccountConnectionState.field_a) {
                  ProgressRefreshState.field_b = ProgressRefreshState.field_b - 1;
                }
                if (0 > ProgressRefreshState.field_b) {
                  ProgressRefreshState.field_b = 8;
                  var2 = 0;
                  while (true) {
                    if (var2 < 25) {
                      MidiKeyUsage.field_k = MidiKeyUsage.field_k + 1;
                      stackIn_113_0 = -101;
                      stackIn_113_1 = ~MidiKeyUsage.field_k;
                      if (stackIn_113_0 >= stackIn_113_1) {
                        MidiKeyUsage.field_k = 0;
                      }
                      TickClock.field_a[MidiKeyUsage.field_k][0] = GameGraphicsResources.wizardFont2.stringWidth(EditableTextWidget.field_R[AccountConnectionState.field_a]) * (-13 + var2) / 25 + 177;
                      TickClock.field_a[MidiKeyUsage.field_k][1] = (int)(-Math.random() * (double)GameGraphicsResources.wizardFont2.field_M + 208.0 + (double)(32 * AccountConnectionState.field_a));
                      TickClock.field_a[MidiKeyUsage.field_k][2] = 128;
                      var2++;
                      continue;
                    }
                    stackIn_113_0Lifetime1 = AccountConnectionState.field_a;
                    stackIn_113_1Lifetime1 = 1;
                    AccountConnectionState.field_a = stackIn_113_0Lifetime1 + stackIn_113_1Lifetime1;
                    if (!ReflectionCheck.field_s) {
                      break;
                    }
                    FriendOrderingHelpers.field_a.addSample(BufferedRandomAccessFile.soundEffects[0], 100, 256 * StyleNode.field_p / 100);
                    break;
                  }
                }
                var2 = 0;
                if (~AchievementSubmission.field_n != ~TriangleMesh.field_i) {
                  TriangleMesh.field_i = AchievementSubmission.field_n;
                  var2 = 1;
                }
                if (NetworkArchiveRequest.field_B != NineSliceFrame.field_d) {
                  var2 = 1;
                  NineSliceFrame.field_d = NetworkArchiveRequest.field_B;
                }
                if (AccountConnectionState.field_a < 2) {
                  var2 = 0;
                }
                if (UiThemeSetupHelpers.field_c == 1) {
                  var2 = 1;
                }
                if (GridActor.field_g >= 0) {
                  regionExit1: {
                    if (var2 != 0) {
                      BufferedRandomAccessFile.field_h = -1;
                      var3 = 208;
                      var4 = 0;
                      while (var4 < AccountConnectionState.field_a) {
                        stackIn_138_0 = AchievementSubmission.field_n;
                        stackIn_138_1 = 27;
                        if (stackIn_138_0 >= stackIn_138_1 &&
                          AchievementSubmission.field_n <= 327 &&
                          NetworkArchiveRequest.field_B >= (-24 + var3) &&
                          NetworkArchiveRequest.field_B <= 8 + var3) {
                          BufferedRandomAccessFile.field_h = var4;
                        }
                        var3 += 32;
                        var4++;
                      }
                      stackIn_138_0Lifetime1 = ~BufferedRandomAccessFile.field_h;
                      stackIn_138_1Lifetime1 = -3;
                      if ((stackIn_138_0Lifetime1 == stackIn_138_1Lifetime1 ||
                        3 == BufferedRandomAccessFile.field_h) &&
                        AchievementSubmission.field_n >= 144) {
                        if (BrowserUrlLauncher.field_c == 1) {
                          this.a(-123, 2, BufferedRandomAccessFile.field_h);
                          break regionExit1;
                        }
                      } else {
                        if (UiThemeSetupHelpers.field_c != 1) {
                          break regionExit1;
                        }
                        this.a(54, 2, BufferedRandomAccessFile.field_h);
                      }
                      break regionExit1;
                    }
                    if ((2 == BufferedRandomAccessFile.field_h ||
                      BufferedRandomAccessFile.field_h == 3) && (AchievementSubmission.field_n > 144 &&
                      BrowserUrlLauncher.field_c == 1)) {
                      this.a(-114, 2, BufferedRandomAccessFile.field_h);
                    }
                  }
                  if (0 <= BufferedRandomAccessFile.field_h) {
                    MidiKeyUsage.field_k = MidiKeyUsage.field_k + 1;
                    if (MidiKeyUsage.field_k >= 100) {
                      MidiKeyUsage.field_k = 0;
                    }
                    if (MidiKeyUsage.field_k % 25 == 0) {
                      TickClock.field_a[0][0] = 161 - GameGraphicsResources.wizardFont2.stringWidth(EditableTextWidget.field_R[BufferedRandomAccessFile.field_h]) / 2;
                      TickClock.field_a[0][1] = -GameGraphicsResources.wizardFont2.field_M / 2 + 208 + 32 * BufferedRandomAccessFile.field_h;
                      if (BufferedRandomAccessFile.field_h == 2) {
                        TickClock.field_a[0][0] = 27;
                      }
                      if (BufferedRandomAccessFile.field_h == 3) {
                        TickClock.field_a[0][0] = 27;
                      }
                      TickClock.field_a[0][2] = 128;
                    }
                    if (12 == MidiKeyUsage.field_k % 25) {
                      TickClock.field_a[1][0] = 16 + (GameGraphicsResources.wizardFont2.stringWidth(EditableTextWidget.field_R[BufferedRandomAccessFile.field_h]) / 2 + 177);
                      if (BufferedRandomAccessFile.field_h == 2) {
                        TickClock.field_a[1][0] = 327;
                      }
                      TickClock.field_a[1][1] = BufferedRandomAccessFile.field_h * 32 + -GameGraphicsResources.wizardFont2.field_M / 2 + 208;
                      if (3 == BufferedRandomAccessFile.field_h) {
                        TickClock.field_a[1][0] = 327;
                      }
                      TickClock.field_a[1][2] = 128;
                    }
                  }
                }
              }
            }
            if ((GameApplet.field_e == null ||
              !GameApplet.field_e.field_p) &&
              !this.field_P) {
              if (0 < IntegerMathHelpers.field_a) {
                IntegerMathHelpers.field_a = IntegerMathHelpers.field_a / 2;
              }
              if (!(0 >= IntegerMathHelpers.field_a)) {
                IntegerMathHelpers.field_a = IntegerMathHelpers.field_a - 1;
              }
            } else {
              if (256 > IntegerMathHelpers.field_a) {
                IntegerMathHelpers.field_a = IntegerMathHelpers.field_a / 2 + 128;
              }
              if (256 > IntegerMathHelpers.field_a) {
                IntegerMathHelpers.field_a = IntegerMathHelpers.field_a + 1;
              }
              if (256 == IntegerMathHelpers.field_a) {
                if (this.field_P &&
                  DialogLayer.field_K != 1) {
                  this.field_P = false;
                  GameApplet.field_e = new GameMenu();
                  ProgressRefreshState.field_b = 0;
                  AccountConnectionState.field_a = 0;
                  return;
                }
                this.field_P = false;
                if (EmailCheckRequest.field_h == 2) {
                  DualLinkDeque.field_g = null;
                }
                GameApplet.field_e = null;
                EmailCheckRequest.field_h = 0;
              }
            }
            if (LoginChoicePanel.field_E != null &&
              LoginChoicePanel.field_E.field_b) {
              WeightedLruCache.exitFullscreen((byte) 60);
            }
            var2 = 0;
            while (true) {
              if (100 > var2) {
                stackIn_323_0 = 0;
                stackIn_323_1 = TickClock.field_a[var2][2];
                if (stackIn_323_0 < stackIn_323_1) {
                  dupTemp$4 = TickClock.field_a[var2];
                  dupTemp$4[2] = dupTemp$4[2] - 5;
                }
                var2++;
                continue;
              }
              if (this.field_L) {
                var2 = AchievementSubmission.field_n / 32;
                var3 = -(NetworkArchiveRequest.field_B / 32) + 14;
                while (EmailValidationError.pollKeyboardEvent(-75)) {
                  if (MidiNote.field_r == 13) {
                    this.field_L = false;
                    DialogLayer.field_K = 1;
                  }
                  if (MidiNote.field_r == 41) {
                    var15 = new byte[900];
                    var12 = var15;
                    var4_ref_byte__ = var12;
                    var5 = 0;
                    for (var6_int = 0; var6_int < 300; var6_int++) {
                      incrementValue$1 = var5;
                      var5++;
                      var4_ref_byte__[incrementValue$1] = (byte)SavedDataRequest.level.field_j[var6_int];
                      incrementValue$2 = var5;
                      var5++;
                      var4_ref_byte__[incrementValue$2] = (byte)SavedDataRequest.level.field_f[var6_int];
                      incrementValue$3 = var5;
                      var5++;
                      var4_ref_byte__[incrementValue$3] = (byte)SavedDataRequest.level.field_a[var6_int];
                    }
                    MidiPcmStream.field_T[GridActor.field_l][HuffmanDecoder.field_c] = var15;
                    try {
                      var5 = 0;
                      AudioServiceThread.writeFileBytes(var4_ref_byte__, var15.length, true, new File("level" + GridActor.field_l + HuffmanDecoder.field_c + ".dat"));
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var6 = (Exception) (Object) decompiledCaughtException;
                      System.out.println(var6);
                    }
                  }
                  if (16 == MidiNote.field_r) {
                    SavedDataRequest.level.field_a[var3 * 20 + var2] = 1;
                  }
                  if (MidiNote.field_r == 17) {
                    SavedDataRequest.level.field_a[var2 + var3 * 20] = 2;
                  }
                  if (MidiNote.field_r == 18) {
                    SavedDataRequest.level.field_a[var2 + var3 * 20] = 3;
                  }
                  if (MidiNote.field_r == 19) {
                    SavedDataRequest.level.field_a[20 * var3 + var2] = 4;
                  }
                  if (20 == MidiNote.field_r) {
                    SavedDataRequest.level.field_a[var2 + 20 * var3] = 5;
                  }
                  if (MidiNote.field_r == 35) {
                    SavedDataRequest.level.field_j[var2 + 20 * var3] = 0;
                    SavedDataRequest.level.field_f[20 * var3 + var2] = 0;
                    SavedDataRequest.level.field_a[20 * var3 + var2] = 0;
                  }
                  if (MidiNote.field_r == 32) {
                    SavedDataRequest.level.field_j[var2 + 20 * var3] = 1;
                    SavedDataRequest.level.field_f[var2 + var3 * 20] = 1;
                  }
                  if (MidiNote.field_r == 33) {
                    SavedDataRequest.level.field_j[20 * var3 + var2] = 2;
                    SavedDataRequest.level.field_f[20 * var3 + var2] = 1;
                  }
                  if (34 == MidiNote.field_r) {
                    SavedDataRequest.level.field_j[20 * var3 + var2] = 3;
                    SavedDataRequest.level.field_f[var2 + var3 * 20] = 1;
                  }
                  if (MidiNote.field_r == 48) {
                    SavedDataRequest.level.field_j[var2 + var3 * 20] = 4;
                    SavedDataRequest.level.field_f[var2 + var3 * 20] = 0;
                  }
                  if (MidiNote.field_r == 49) {
                    SavedDataRequest.level.field_j[var3 * 20 + var2] = 5;
                    SavedDataRequest.level.field_f[var2 + var3 * 20] = 0;
                  }
                  if (50 == MidiNote.field_r) {
                    SavedDataRequest.level.field_j[20 * var3 + var2] = 6;
                    SavedDataRequest.level.field_f[var2 + var3 * 20] = 0;
                  }
                  if (MidiNote.field_r == 64) {
                    SavedDataRequest.level.field_j[var3 * 20 + var2] = 7;
                    SavedDataRequest.level.field_f[var3 * 20 + var2] = 0;
                  }
                  if (MidiNote.field_r == 65) {
                    SavedDataRequest.level.field_j[var2 + 20 * var3] = 8;
                    SavedDataRequest.level.field_f[20 * var3 + var2] = 0;
                  }
                  if (MidiNote.field_r == 66) {
                    SavedDataRequest.level.field_j[var3 * 20 + var2] = 9;
                    SavedDataRequest.level.field_f[20 * var3 + var2] = 0;
                  }
                  if (MidiNote.field_r == 67) {
                    SavedDataRequest.level.field_j[var2 + 20 * var3] = 10;
                    SavedDataRequest.level.field_f[var2 + 20 * var3] = 0;
                  }
                  if (MidiNote.field_r == 68) {
                    SavedDataRequest.level.field_j[var2 + var3 * 20] = 11;
                    SavedDataRequest.level.field_f[20 * var3 + var2] = 0;
                  }
                  if (MidiNote.field_r == 69) {
                    SavedDataRequest.level.field_j[var2 + var3 * 20] = 12;
                    SavedDataRequest.level.field_f[var2 + var3 * 20] = 0;
                  }
                  if (MidiNote.field_r == 43) {
                    BufferedSocket.field_c = BufferedSocket.field_c + 1;
                    HuffmanDecoder.field_c = HuffmanDecoder.field_c + 1;
                    if (HuffmanDecoder.field_c == 5) {
                      IntegerSyntaxHelpers.field_e = SettingsCookieReader.field_a;
                      if (FriendOrderingHelpers.field_e) {
                        SingleChildWidget.field_D.startTrack(true, -101, IntegerSyntaxHelpers.field_e);
                      }
                    }
                    if (HuffmanDecoder.field_c >= 6) {
                      BufferedSocket.field_c = BufferedSocket.field_c - HuffmanDecoder.field_c;
                      HighscorePlayer.field_b = HighscorePlayer.field_b + 6;
                      GridActor.field_l = GridActor.field_l + 1;
                      HuffmanDecoder.field_c = 0;
                      if (5 >= GridActor.field_l) {
                        MidiNote.selectLevelMusic((byte) -75);
                      } else {
                        HighscorePlayer.field_b = HighscorePlayer.field_b - GridActor.field_l * 6;
                        LoadingMessageHelpers.field_f = LoadingMessageHelpers.field_f - 30;
                        GridActor.field_l = 5;
                      }
                    }
                    LevelDecodingHelpers.decodeCurrentLevel(7530);
                    if (2 == GridActor.field_l && (!(ArchiveProvider.field_a > 0) ||
                      ThreePieceFrameHelpers.a(param0 - 751))) {
                      this.s(208);
                    }
                  }
                  if (MidiNote.field_r != 42) {
                    continue;
                  }
                  HuffmanDecoder.field_c = HuffmanDecoder.field_c - 1;
                  BufferedSocket.field_c = BufferedSocket.field_c + 1;
                  if (HuffmanDecoder.field_c == 4) {
                    MidiNote.selectLevelMusic((byte) -59);
                  }
                  if (HuffmanDecoder.field_c < 0) {
                    HuffmanDecoder.field_c = 5;
                    GridActor.field_l = GridActor.field_l - 1;
                    if (GridActor.field_l < 0) {
                      GridActor.field_l = 0;
                    } else {
                      MidiNote.selectLevelMusic((byte) -118);
                    }
                    IntegerSyntaxHelpers.field_e = SettingsCookieReader.field_a;
                    if (FriendOrderingHelpers.field_e) {
                      SingleChildWidget.field_D.startTrack(true, param0 - 740, IntegerSyntaxHelpers.field_e);
                    }
                  }
                  LevelDecodingHelpers.decodeCurrentLevel(7530);
                }
                break;
              }
              stackIn_323_0Lifetime1 = param0;
              stackIn_323_1Lifetime1 = 640;
              if (stackIn_323_0Lifetime1 != stackIn_323_1Lifetime1) {
                numberSprites = (Sprite[]) null;
              }
              if (null != GameApplet.field_e) {
                this.field_I = 5;
                EmailCheckRequest.field_h = 3;
                while (EmailValidationError.pollKeyboardEvent(-120)) {
                  if (MidiNote.field_r == 13) {
                    GameApplet.field_e.field_p = true;
                    continue;
                  }
                  if (MidiNote.field_r == 102) {
                    if (GameApplet.field_e.field_a == 2) {
                      this.a(19, -3, 2);
                    }
                    if (GameApplet.field_e.field_a != 3) {
                      continue;
                    }
                    this.a(54, -3, 3);
                    continue;
                  }
                  if (MidiNote.field_r != 103) {
                    if (null == GameApplet.field_e) {
                      continue;
                    }
                    GameApplet.field_e.updateKeyboardSelection(0);
                    continue;
                  }
                  if (GameApplet.field_e.field_a == 2) {
                    this.a(-127, 3, 2);
                  }
                  if (GameApplet.field_e.field_a != 3) {
                    continue;
                  }
                  this.a(93, 3, 3);
                }
                if (GameApplet.field_e != null) {
                  GameApplet.field_e.updatePointerSelection(param0 ^ -642);
                }
                if (null != GameApplet.field_e) {
                  return;
                }
                EmailCheckRequest.field_h = 0;
                return;
              }
              if (DiskCacheStore.field_f > NanoTickClock.field_n) {
                NanoTickClock.field_n = DiskCacheStore.field_f;
              }
              if (DialogLayer.field_K == 1) {
                while (EmailValidationError.pollKeyboardEvent(-65)) {
                  if (13 == MidiNote.field_r &&
                    EmailCheckRequest.field_h != 0) {
                    this.field_P = true;
                    if (EmailCheckRequest.field_h != 6) {
                      return;
                    }
                    this.field_P = false;
                    DisplayNameForm.a(0, true);
                    this.field_J = true;
                    EmailCheckRequest.field_h = 9;
                    return;
                  }
                  if (MidiNote.field_r == 96 &&
                    BrowserUrlLauncher.field_c == 0) {
                    if (2 == EmailCheckRequest.field_h) {
                      if (!ThreePieceFrameHelpers.a(param0 - 755)) {
                        this.field_N = this.field_N - 1;
                        if (this.field_N < 0) {
                          this.field_N = 0;
                        }
                      } else {
                        this.field_N = this.field_N - 1;
                        if (this.field_N < 0) {
                          this.field_N = 0;
                        }
                      }
                    }
                    if (EmailCheckRequest.field_h == 5) {
                      if (!ThreePieceFrameHelpers.a(param0 ^ -739) &&
                        AgeValidator.field_l <= 0) {
                        this.field_N = 0;
                      } else {
                        this.field_N = this.field_N - 1;
                        if (this.field_N < 0) {
                          this.field_N = 0;
                        }
                      }
                    }
                    if (EmailCheckRequest.field_h == 11 &&
                      GridActor.field_l > 0 &&
                      FadingDialog.field_I < 5) {
                      GridActor.field_l = GridActor.field_l - 1;
                      HighscorePlayer.field_b = HighscorePlayer.field_b - 6;
                    }
                    if (EmailCheckRequest.field_h == 1) {
                      this.field_N = 0;
                    }
                  }
                  if (97 == MidiNote.field_r &&
                    0 == BrowserUrlLauncher.field_c) {
                    if (EmailCheckRequest.field_h == 2) {
                      if (ThreePieceFrameHelpers.a(param0 - 727)) {
                        this.field_N = this.field_N + 1;
                        if (this.field_N > 1) {
                          this.field_N = 1;
                        }
                      } else {
                        this.field_N = this.field_N + 1;
                        if (this.field_N > 3) {
                          this.field_N = 3;
                        }
                      }
                    }
                    if (EmailCheckRequest.field_h == 5) {
                      if (!ThreePieceFrameHelpers.a(param0 - 751) &&
                        0 >= AgeValidator.field_l) {
                        this.field_N = 0;
                      } else {
                        this.field_N = this.field_N + 1;
                        if (this.field_N > 1) {
                          this.field_N = 1;
                        }
                      }
                    }
                    if (11 == EmailCheckRequest.field_h &&
                      5 > GridActor.field_l &&
                      5 > FadingDialog.field_I) {
                      GridActor.field_l = GridActor.field_l + 1;
                      LoadingMessageHelpers.field_f = LoadingMessageHelpers.field_f - 6;
                    }
                    if (EmailCheckRequest.field_h == 1) {
                      this.field_N = 0;
                    }
                  }
                  if (EmailCheckRequest.field_h == 0) {
                    if (98 == MidiNote.field_r) {
                      if (BufferedRandomAccessFile.field_h == -1) {
                        BufferedRandomAccessFile.field_h = 0;
                      }
                      fieldTemp$5 = BufferedRandomAccessFile.field_h - 1;
                      BufferedRandomAccessFile.field_h = BufferedRandomAccessFile.field_h - 1;
                      if (fieldTemp$5 < 0) {
                        BufferedRandomAccessFile.field_h = BufferedRandomAccessFile.field_h + AccountConnectionState.field_a;
                      }
                    }
                    if (MidiNote.field_r == 99) {
                      fieldTemp$6 = BufferedRandomAccessFile.field_h + 1;
                      BufferedRandomAccessFile.field_h = BufferedRandomAccessFile.field_h + 1;
                      if (AccountConnectionState.field_a <= fieldTemp$6) {
                        BufferedRandomAccessFile.field_h = BufferedRandomAccessFile.field_h - AccountConnectionState.field_a;
                      }
                    }
                    if (MidiNote.field_r == 96) {
                      this.a(89, -1, BufferedRandomAccessFile.field_h);
                    }
                    if (MidiNote.field_r == 97) {
                      this.a(param0 - 614, 1, BufferedRandomAccessFile.field_h);
                    }
                    if (102 == MidiNote.field_r) {
                      this.a(91, -3, BufferedRandomAccessFile.field_h);
                    }
                    if (MidiNote.field_r == 103) {
                      this.a(param0 - 530, 3, BufferedRandomAccessFile.field_h);
                    }
                    if (MidiNote.field_r != 84) {
                      continue;
                    }
                    this.a(param0 ^ 760, 0, BufferedRandomAccessFile.field_h);
                    continue;
                  }
                  if (EncryptedLoginHelpers.field_c > 0) {
                    continue;
                  }
                  if (84 != MidiNote.field_r) {
                    continue;
                  }
                  if (EmailCheckRequest.field_h != 11) {
                    if (EmailCheckRequest.field_h == 2) {
                      continue;
                    }
                    if (EmailCheckRequest.field_h == 5) {
                      continue;
                    }
                    EncryptedLoginHelpers.field_c = 32;
                    continue;
                  }
                  if (GridActor.field_l > TextButton.field_A) {
                    continue;
                  }
                  if (FadingDialog.field_I >= 5) {
                    continue;
                  }
                  BufferedSocket.field_c = BufferedSocket.field_c + GridActor.field_g;
                  GridActor.field_g = 0;
                  AccountCreationForm.field_T = 0;
                  WidgetTheme.field_k = 0;
                  if (0 >= GridActor.field_l) {
                    DelegatingCanvas.field_b = false;
                  } else {
                    DelegatingCanvas.field_b = true;
                    LoadingMessageHelpers.field_f = LoadingMessageHelpers.field_f + 5;
                    GridActor.field_g = 5;
                  }
                  FadingDialog.field_I = 5;
                  if ((4 & IsaacRandom.field_a) > 0) {
                    AccountCreationForm.field_T = 400;
                  }
                  EmailAddressValidator.field_l = 0;
                }
                if (EmailCheckRequest.field_h == 0) {
                  HighscorePlayer.field_e = SpriteButtonPainter.field_w;
                }
                if (1 == EmailCheckRequest.field_h) {
                  HighscorePlayer.field_e = AudioServiceThread.field_b;
                }
                if (EmailCheckRequest.field_h == 2) {
                  HighscorePlayer.field_e = NodeHashTableIterator.field_d;
                }
                if (5 == EmailCheckRequest.field_h) {
                  HighscorePlayer.field_e = ValidationHelpWidget.field_M;
                }
                if (FadingDialog.field_I > 0) {
                  FadingDialog.field_I = FadingDialog.field_I + 5;
                }
                if (4 == EmailCheckRequest.field_h) {
                  HighscorePlayer.field_e = UiSpriteThemeHelpers.field_b;
                }
                if (FadingDialog.field_I == 255) {
                  DualLinkDeque.field_g = null;
                  WidgetTheme.field_k = 0;
                  if (TextButton.field_A < GridActor.field_l &&
                    GridActor.field_l > 1) {
                    HighscorePlayer.field_b = HighscorePlayer.field_b - 3 * GridActor.field_l;
                    BufferedSocket.field_c = BufferedSocket.field_c - 3 * GridActor.field_l;
                    GridActor.field_l = 0;
                  }
                  DialogLayer.field_K = 2;
                  BrowserCookieHelpers.field_a = null;
                  BufferedSocket.field_c = BufferedSocket.field_c - HuffmanDecoder.field_c;
                  HuffmanDecoder.field_c = 0;
                  MidiNote.selectLevelMusic((byte) -43);
                  LevelDecodingHelpers.decodeCurrentLevel(param0 ^ 8170);
                  if (GridActor.field_l == 0 &&
                    HuffmanDecoder.field_c == 0) {
                    BufferedSocket.field_a = 580;
                    UsernameLoginCredentials.field_j = ToggleButton.field_F;
                  } else {
                    BufferedSocket.field_a = 580;
                    UsernameLoginCredentials.field_j = HighscorePlayer.field_f + (1 + GridActor.field_l) + MarkerSliderPainter.field_i + (1 + HuffmanDecoder.field_c);
                  }
                  var9 = new GridPoint();
                  var13 = var9;
                  var13.column = 2;
                  if (4 == GridActor.field_l &&
                    HuffmanDecoder.field_c == 5) {
                    var13.column = var13.column + 1;
                  }
                  var9.row = 2;
                  NameAvailabilityFactory.field_e[WidgetTheme.field_k].initialize(9147, 0, var13);
                  WidgetTheme.field_k = WidgetTheme.field_k + 1;
                  LevelActorSpawner.c(param0 - 762);
                  GameApplet.field_g = false;
                  if (GridActor.field_l == 0) {
                    this.field_Q = 0;
                    AchievementSubmission.field_q = true;
                    this.field_R = 1;
                  } else {
                    AchievementSubmission.field_q = false;
                  }
                  DelegatingCanvas.field_b = false;
                  NanoTickClock.field_n = 0;
                  DiskCacheWorker.field_e = 100;
                  AccountSocketHelpers.field_e = false;
                  if (FriendOrderingHelpers.field_e &&
                    AchievementSubmission.field_q) {
                    SingleChildWidget.field_D.startTrack(true, -115, QuickChatDynamicCommand.field_e);
                  }
                }
                if (510 < FadingDialog.field_I) {
                  FadingDialog.field_I = 0;
                }
                DiskCacheWorker.field_e = DiskCacheWorker.field_e - 1;
                if (!(DiskCacheWorker.field_e >= 0)) {
                  DiskCacheWorker.field_e = 0;
                }
              }
              if (2 == DialogLayer.field_K) {
                if (((HuffmanDecoder.field_c != 0 ||
                  GridActor.field_l != 0) &&
                  DiskCacheStore.field_f > DisplayNameSyntaxHelpers.field_a ||
                  HuffmanDecoder.field_c == 0 &&
                  GridActor.field_l == 0 &&
                  !(GridActor.field_g >= 5) &&
                  !(GridActor.field_g <= 0)) && !AchievementSubmission.field_q) {
                  GridActor.field_g = GridActor.field_g + 1;
                  if (HuffmanDecoder.field_c != 0 ||
                    GridActor.field_l != 0) {
                    if (DisplayNameSyntaxHelpers.field_a >= 10000) {
                      DisplayNameSyntaxHelpers.field_a = DisplayNameSyntaxHelpers.field_a + 10000;
                    }
                    if (DisplayNameSyntaxHelpers.field_a == 5000) {
                      DisplayNameSyntaxHelpers.field_a = 10000;
                    }
                    if (DisplayNameSyntaxHelpers.field_a == 2000) {
                      DisplayNameSyntaxHelpers.field_a = 5000;
                    }
                    if (1000 == DisplayNameSyntaxHelpers.field_a) {
                      DisplayNameSyntaxHelpers.field_a = 2000;
                    }
                    if (DisplayNameSyntaxHelpers.field_a <= 500) {
                      DisplayNameSyntaxHelpers.field_a = 1000;
                    }
                  }
                  DecodedSpritePalette.field_a = DecodedSpritePalette.field_a + 1;
                  for (var2 = 0; var2 < 5; var2++) {
                    NetworkArchiveRequest.field_x = 0;
                    NameAvailabilityFactory.field_e[WidgetTheme.field_k].initialize(9147, 1, NameAvailabilityFactory.field_e[0].tilePosition);
                    NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.set(-92, NameAvailabilityFactory.field_e[0].tileOffset);
                    NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.row = 0;
                    NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_h = -1;
                    dupTemp$7 = NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset;
                    dupTemp$7.column = dupTemp$7.column + 80;
                    NameAvailabilityFactory.field_e[WidgetTheme.field_k].verticalVelocity = var2 * 20;
                    NetworkArchiveRequest.field_x = 0;
                    WidgetTheme.field_k = WidgetTheme.field_k + 1;
                    NameAvailabilityFactory.field_e[WidgetTheme.field_k].initialize(param0 + 8507, 1, NameAvailabilityFactory.field_e[0].tilePosition);
                    NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.set(param0 - 746, NameAvailabilityFactory.field_e[0].tileOffset);
                    NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.row = 0;
                    NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_h = 1;
                    dupTemp$8 = NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset;
                    dupTemp$8.column = dupTemp$8.column + 80;
                    NameAvailabilityFactory.field_e[WidgetTheme.field_k].verticalVelocity = 20 * var2;
                    WidgetTheme.field_k = WidgetTheme.field_k + 1;
                  }
                }
                if (!AchievementSubmission.field_q) {
                  var2 = 0;
                  for (var3 = 0; WidgetTheme.field_k > var3; var3++) {
                    stackIn_540_0 = NameAvailabilityFactory.field_e[var3].actorType;
                    stackIn_540_1 = 2;
                    if (stackIn_540_0 > stackIn_540_1) {
                      var2 = 1;
                    }
                  }
                  if (var2 == 0 &&
                    !(0 > GridActor.field_g) &&
                    FadingDialog.field_I == 0) {
                    if (5 == GridActor.field_l &&
                      HuffmanDecoder.field_c > 5) {
                      this.field_R = 11;
                      AchievementSubmission.field_q = true;
                      HuffmanDecoder.a(1, 255, 0);
                    } else {
                      FadingDialog.field_I = FadingDialog.field_I + 5;
                    }
                  }
                }
                stackIn_540_0Lifetime1 = TextHotspotRange.field_m;
                stackIn_540_1Lifetime1 = 2;
                if (stackIn_540_0Lifetime1 >= stackIn_540_1Lifetime1) {
                  if (BufferedSocket.field_p[66]) {
                    PasswordFieldPainter.field_w = true;
                  }
                  if (BufferedSocket.field_p[67]) {
                    PasswordFieldPainter.field_w = false;
                  }
                  if (PasswordFieldPainter.field_w) {
                    return;
                  }
                  if (BufferedSocket.field_p[55]) {
                    SavedDataRequest.field_j = true;
                    FadingDialog.field_I = 5;
                    AchievementSubmission.field_q = false;
                    HuffmanDecoder.field_c = 4;
                  }
                  if (BufferedSocket.field_p[40]) {
                    AchievementSubmission.field_q = false;
                    SavedDataRequest.field_j = true;
                    FadingDialog.field_I = 5;
                  }
                  if (BufferedSocket.field_p[39] &&
                    5 > GridActor.field_l) {
                    AchievementSubmission.field_q = false;
                    FadingDialog.field_I = 5;
                    HuffmanDecoder.field_c = 6;
                    SavedDataRequest.field_j = true;
                  }
                  if (!BufferedSocket.field_p[68]) {
                  }
                  if (BufferedSocket.field_p[56]) {
                    if (GridActor.field_g > 50) {
                      GridActor.field_g = 5;
                      SavedDataRequest.field_j = true;
                    } else {
                      GridActor.field_g = 100;
                      SavedDataRequest.field_j = true;
                    }
                  }
                  if (BufferedSocket.field_p[38]) {
                    SavedDataRequest.field_j = false;
                    DiskCacheStore.field_f = (int)(Math.random() * 1000.0 + 500.0);
                  }
                }
                if (50 < GridActor.field_g &&
                  SavedDataRequest.field_j) {
                  GridActor.field_g = 100;
                }
                if (0 < FadingDialog.field_I) {
                  FadingDialog.field_I = FadingDialog.field_I + 5;
                }
                if (FadingDialog.field_I > 510) {
                  FadingDialog.field_I = 0;
                }
                if (AchievementSubmission.field_q) {
                  if (this.field_R == 11) {
                    if (NameAvailabilityFactory.field_e[0].tilePosition.row <= 2) {
                      if (2 < NameAvailabilityFactory.field_e[0].tilePosition.column) {
                        ProgressQuery.field_m.field_b = -1;
                      }
                      if (NameAvailabilityFactory.field_e[0].tilePosition.column < 2) {
                        ProgressQuery.field_m.field_b = 1;
                      }
                    } else {
                      ProgressQuery.field_m.field_b = -1;
                    }
                    NameAvailabilityFactory.field_e[0].updateActor((byte) -123, SavedDataRequest.level);
                    if (NameAvailabilityFactory.field_e[0].tilePosition.column == 2 &&
                      2 == NameAvailabilityFactory.field_e[0].tilePosition.row) {
                      this.field_R = 12;
                      this.field_Q = 0;
                      if (FriendOrderingHelpers.field_e) {
                        SingleChildWidget.field_D.startTrack(true, param0 ^ -727, NineSliceFrame.field_e);
                      }
                    }
                  }
                  if (this.field_R == 12) {
                    if (this.field_Q >= 90) {
                      var10 = new GridPoint();
                      var2_ref_ob = var10;
                      var2_ref_ob.column = 16 + (int)(4.0 * Math.random());
                      var2_ref_ob.row = (int)(Math.random() * 4.0) + 11;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].initialize(param0 + 8507, 20, var10);
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.column = (int)(Math.random() * 240.0);
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.row = (int)(Math.random() * 240.0);
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_w = 4;
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                    }
                    if (90 == this.field_Q) {
                      stackIn_594_0 = 0;
                      if (ReflectionCheck.field_s) {
                        stackIn_595_1 = 0;
                      } else {
                        stackIn_595_1 = 1;
                      }
                      if (stackIn_594_0 == stackIn_595_1) {
                        FriendOrderingHelpers.field_a.addSample(SpriteState.secondarySoundEffects[1], 100, StyleNode.field_p * 256 / 100);
                      }
                    }
                    fieldTemp$9 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$9 > 100) {
                      this.field_R = 13;
                      this.field_Q = 0;
                    }
                  }
                  if (this.field_R == 13) {
                    if (50 == this.field_Q &&
                      ReflectionCheck.field_s) {
                      FriendOrderingHelpers.field_a.addSample(SpriteState.secondarySoundEffects[2], 100, 256 * StyleNode.field_p / 100);
                    }
                    fieldTemp$10 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$10 > 100) {
                      this.field_R = 14;
                      this.field_Q = 0;
                    }
                  }
                  if (this.field_R == 14) {
                    fieldTemp$11 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (100 < fieldTemp$11) {
                      this.field_Q = 0;
                      this.field_R = 15;
                    }
                  }
                  if (this.field_R == 15) {
                    fieldTemp$12 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (100 < fieldTemp$12) {
                      this.field_R = 16;
                      this.field_Q = 0;
                    }
                  }
                  if (16 == this.field_R) {
                    if (this.field_Q == 75 &&
                      GridActor.field_g > 0) {
                      DecodedSpritePalette.field_a = DecodedSpritePalette.field_a - 64000;
                      BufferedSocket.field_c = BufferedSocket.field_c + 1;
                      GridActor.field_g = GridActor.field_g - 1;
                      DiskCacheStore.field_f = DiskCacheStore.field_f + 1000;
                      var2 = GridActor.field_g % 5;
                      NetworkArchiveRequest.field_x = 0;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].initialize(9147, 1, NameAvailabilityFactory.field_e[0].tilePosition);
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.set(-113, NameAvailabilityFactory.field_e[0].tileOffset);
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.row = 0;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_h = -1;
                      dupTemp$13 = NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$13.column = dupTemp$13.column + 790;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].verticalVelocity = var2 * 20;
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                      NetworkArchiveRequest.field_x = 0;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].initialize(9147, 1, NameAvailabilityFactory.field_e[0].tilePosition);
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.set(-98, NameAvailabilityFactory.field_e[0].tileOffset);
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.row = 0;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_h = 1;
                      dupTemp$14 = NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$14.column = dupTemp$14.column + 790;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].verticalVelocity = 20 * var2;
                      this.field_Q = 70;
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                    }
                    fieldTemp$15 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$15 > 100) {
                      this.field_R = 17;
                      this.field_Q = 0;
                    }
                  }
                  if (this.field_R == 17) {
                    fieldTemp$16 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (200 < fieldTemp$16) {
                      BufferedSocket.field_c = BufferedSocket.field_c + (GridActor.field_g + 1);
                      LoadingMessageHelpers.field_f = LoadingMessageHelpers.field_f - 36;
                      DecodedSpritePalette.field_a = DecodedSpritePalette.field_a + (HuffmanDecoder.field_c + 6 * GridActor.field_l);
                      GridActor.field_g = -1;
                      HuffmanDecoder.field_c = 0;
                      GridActor.field_l = 6;
                    }
                  }
                  if (this.field_R == 1) {
                    this.field_Q = this.field_Q + 1;
                    if (0 == FadingDialog.field_I) {
                      this.field_Q = 0;
                      this.field_R = 2;
                    }
                  }
                  if (this.field_R == 2) {
                    fieldTemp$17 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (100 < fieldTemp$17) {
                      this.field_Q = 0;
                      this.field_R = 3;
                    }
                  }
                  if (this.field_R == 3) {
                    if (this.field_Q == 5 &&
                      ReflectionCheck.field_s) {
                      FriendOrderingHelpers.field_a.addSample(SpriteState.secondarySoundEffects[0], 100, 256 * StyleNode.field_p / 100);
                    }
                    fieldTemp$18 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$18 > 100) {
                      this.field_Q = 0;
                      this.field_R = 4;
                    }
                  }
                  if (this.field_R == 4) {
                    fieldTemp$19 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$19 > 100) {
                      this.field_R = 5;
                      this.field_Q = 0;
                    }
                  }
                  if (this.field_R == 5) {
                    fieldTemp$20 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$20 > 200) {
                      this.field_Q = 0;
                      this.field_R = 6;
                    }
                  }
                  if (this.field_R == 6) {
                    fieldTemp$21 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (200 < fieldTemp$21) {
                      this.field_Q = 0;
                      this.field_R = 7;
                    }
                  }
                  if (7 == this.field_R) {
                    fieldTemp$22 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (100 < fieldTemp$22) {
                      this.field_Q = 0;
                      this.field_R = 8;
                    }
                  }
                  if (8 == this.field_R) {
                    fieldTemp$23 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$23 > 100) {
                      this.field_R = 9;
                      this.field_Q = 0;
                    }
                  }
                  if (this.field_R == 9) {
                    if (50 == this.field_Q &&
                      FriendOrderingHelpers.field_e) {
                      SingleChildWidget.field_D.startTrack(true, param0 ^ -740, IntegerSyntaxHelpers.field_e);
                    }
                    if (75 == this.field_Q &&
                      GridActor.field_g < 5) {
                      HighscorePlayer.field_b = HighscorePlayer.field_b - 1;
                      GridActor.field_g = GridActor.field_g + 1;
                      NetworkArchiveRequest.field_x = 0;
                      var2 = GridActor.field_g;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].initialize(param0 ^ 8507, 1, NameAvailabilityFactory.field_e[0].tilePosition);
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.set(param0 ^ -751, NameAvailabilityFactory.field_e[0].tileOffset);
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.row = 0;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_h = -1;
                      dupTemp$24 = NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$24.column = dupTemp$24.column + 40;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].verticalVelocity = var2 % 3 * 20;
                      NetworkArchiveRequest.field_x = 0;
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].initialize(9147, 1, NameAvailabilityFactory.field_e[0].tilePosition);
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.set(-124, NameAvailabilityFactory.field_e[0].tileOffset);
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset.row = 0;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_h = 1;
                      dupTemp$25 = NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset;
                      dupTemp$25.column = dupTemp$25.column + 40;
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].verticalVelocity = 20 * (var2 % 3);
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                      this.field_Q = 70;
                    }
                    fieldTemp$26 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (100 < fieldTemp$26) {
                      this.field_R = 10;
                      this.field_Q = 0;
                    }
                  }
                  if (this.field_R == 10) {
                    AchievementSubmission.field_q = false;
                    BufferedSocket.field_a = 580;
                    UsernameLoginCredentials.field_j = ValidationHelpWidget.field_Q;
                  }
                  for (var2 = 0; WidgetTheme.field_k > var2; var2++) {
                    stackIn_688_0 = -1;
                    stackIn_688_1 = ~var2;
                    if (stackIn_688_0 != stackIn_688_1 ||
                      !AchievementSubmission.field_q) {
                      NameAvailabilityFactory.field_e[var2].updateActor((byte) -123, SavedDataRequest.level);
                    }
                  }
                }
                if (!AchievementSubmission.field_q) {
                  stackIn_688_0Lifetime1 = FadingDialog.field_I;
                  stackIn_688_1Lifetime1 = 255;
                  if (stackIn_688_0Lifetime1 == stackIn_688_1Lifetime1) {
                    WidgetTheme.field_k = 0;
                    HuffmanDecoder.field_c = HuffmanDecoder.field_c + 1;
                    HighscorePlayer.field_b = HighscorePlayer.field_b + 1;
                    if (HuffmanDecoder.field_c == 5 &&
                      GridActor.field_l == 0 &&
                      !AccountSocketHelpers.field_e) {
                      HuffmanDecoder.a(1, 254, 1);
                    }
                    NetworkArchiveRequest.field_x = 0;
                    if (5 == HuffmanDecoder.field_c) {
                      UiThemeSetupHelpers.field_b = 0;
                      IntegerSyntaxHelpers.field_e = SettingsCookieReader.field_a;
                      if (FriendOrderingHelpers.field_e) {
                        SingleChildWidget.field_D.startTrack(true, -127, IntegerSyntaxHelpers.field_e);
                      }
                      GameApplet.field_g = false;
                    }
                    if (HuffmanDecoder.field_c >= 6) {
                      if (!GameApplet.field_g) {
                        if (GridActor.field_l == 0) {
                          HuffmanDecoder.a(1, 250, 5);
                        }
                        if (1 == GridActor.field_l) {
                          HuffmanDecoder.a(1, 249, 6);
                        }
                        if (GridActor.field_l == 2) {
                          HuffmanDecoder.a(1, 248, 7);
                        }
                        if (GridActor.field_l == 3) {
                          HuffmanDecoder.a(1, 247, 8);
                        }
                        if (GridActor.field_l == 4) {
                          HuffmanDecoder.a(1, 246, 9);
                        }
                      }
                      if (!DelegatingCanvas.field_b) {
                        if (2 == GridActor.field_l) {
                          HuffmanDecoder.a(param0 ^ 641, 252, 3);
                        }
                        if (GridActor.field_l == 4) {
                          HuffmanDecoder.a(1, 251, 4);
                        }
                      }
                      if (GridActor.field_l == 0) {
                        HuffmanDecoder.a(1, 253, 2);
                      }
                      BufferedSocket.field_c = BufferedSocket.field_c - (HuffmanDecoder.field_c - 6);
                      GridActor.field_l = GridActor.field_l + 1;
                      HuffmanDecoder.field_c = 0;
                      if (TextButton.field_A < GridActor.field_l) {
                        PasswordFieldPainter.field_u.addLast(new ProgressSubmission(0, GridActor.field_l - 1, 0, 0, 0, 0), false);
                        TextButton.field_A = GridActor.field_l;
                      }
                      if (GridActor.field_l < 6) {
                        MidiNote.selectLevelMusic((byte) -71);
                      }
                    }
                    BufferedSocket.field_a = 580;
                    UsernameLoginCredentials.field_j = HighscorePlayer.field_f + (GridActor.field_l + 1) + MarkerSliderPainter.field_i + (1 + HuffmanDecoder.field_c);
                    if (-1 < GridActor.field_g) {
                      if (GridActor.field_l < 6) {
                        LevelDecodingHelpers.decodeCurrentLevel(7530);
                      }
                      var14 = new GridPoint();
                      var14.row = 2;
                      var14.column = 2;
                      if (GridActor.field_l == 4 &&
                        HuffmanDecoder.field_c == 5) {
                        var14.column = var14.column + 1;
                      }
                      NameAvailabilityFactory.field_e[WidgetTheme.field_k].initialize(9147, 0, var14);
                      WidgetTheme.field_k = WidgetTheme.field_k + 1;
                      LevelActorSpawner.c(69);
                      NanoTickClock.field_n = 0;
                      DiskCacheWorker.field_e = 100;
                    }
                    if (GridActor.field_l == 2 && (!(0 < ArchiveProvider.field_a) ||
                      ThreePieceFrameHelpers.a(param0 ^ -766))) {
                      this.s(208);
                    }
                  }
                }
                if (GridActor.field_g < 0 &&
                  BufferedSocket.field_a < -350) {
                  FadingDialog.field_I = 100;
                  this.s(208);
                }
                ProgressQuery.field_m.field_d = false;
                ProgressQuery.field_m.field_f = false;
                ProgressQuery.field_m.field_b = 0;
                if (AchievementSubmission.field_q &&
                  0 == GridActor.field_l &&
                  HuffmanDecoder.field_c == 0) {
                  while (true) {
                    if (EmailValidationError.pollKeyboardEvent(125)) {
                      stackIn_759_0 = 13;
                      stackIn_759_1 = MidiNote.field_r;
                      if (stackIn_759_0 != stackIn_759_1 &&
                        MidiNote.field_r != 84) {
                        continue;
                      }
                      UsernameLoginCredentials.field_j = IconButtonPainter.field_b;
                      BufferedSocket.field_a = 580;
                      AchievementSubmission.field_q = false;
                      if (FriendOrderingHelpers.field_e) {
                        SingleChildWidget.field_D.startTrack(true, -93, IntegerSyntaxHelpers.field_e);
                      }
                      LoadingMessageHelpers.field_f = LoadingMessageHelpers.field_f - GridActor.field_g;
                      HighscorePlayer.field_b = HighscorePlayer.field_b - 5;
                      GridActor.field_g = 5;
                      continue;
                    }
                    stackIn_759_0Lifetime1 = ~UiThemeSetupHelpers.field_c;
                    stackIn_759_1Lifetime1 = -2;
                    if (stackIn_759_0Lifetime1 != stackIn_759_1Lifetime1) {
                      break;
                    }
                    AchievementSubmission.field_q = false;
                    LoadingMessageHelpers.field_f = LoadingMessageHelpers.field_f - GridActor.field_g;
                    BufferedSocket.field_a = 580;
                    HighscorePlayer.field_b = HighscorePlayer.field_b - 5;
                    GridActor.field_g = 5;
                    UsernameLoginCredentials.field_j = IconButtonPainter.field_b;
                    if (!FriendOrderingHelpers.field_e) {
                      break;
                    }
                    SingleChildWidget.field_D.startTrack(true, -86, IntegerSyntaxHelpers.field_e);
                    break;
                  }
                }
                if (0 == FadingDialog.field_I) {
                  stackIn_766_0 = 0;
                  if (AchievementSubmission.field_q) {
                    stackIn_767_1 = 0;
                  } else {
                    stackIn_767_1 = 1;
                  }
                  if (stackIn_766_0 != stackIn_767_1) {
                    while (EmailValidationError.pollKeyboardEvent(88)) {
                      if (MidiNote.field_r == 49) {
                        stackIn_777_0 = !(ReflectionCheck.field_s);
                        ReflectionCheck.field_s = stackIn_777_0;
                      } else {
                        if (MidiNote.field_r == 70) {
                          if (FriendOrderingHelpers.field_e) {
                            FriendOrderingHelpers.field_e = false;
                            SingleChildWidget.field_D.stopPlayback(-94);
                          } else {
                            FriendOrderingHelpers.field_e = true;
                            SingleChildWidget.field_D.startTrack(true, -101, IntegerSyntaxHelpers.field_e);
                          }
                        }
                      }
                      if (13 != MidiNote.field_r) {
                        continue;
                      }
                      this.field_P = true;
                      stackIn_789_0 = -2;
                      stackIn_789_1 = ~DialogLayer.field_K;
                      if (stackIn_789_0 == stackIn_789_1 &&
                        EmailCheckRequest.field_h == 0) {
                        this.field_P = false;
                      }
                      if (EmailCheckRequest.field_h == 6) {
                        this.field_P = false;
                        DisplayNameForm.a(0, true);
                        EmailCheckRequest.field_h = 9;
                        this.field_J = true;
                      }
                      return;
                    }
                    stackIn_789_0Lifetime1 = BufferedSocket.field_a;
                    stackIn_789_1Lifetime1 = -350;
                    if (stackIn_789_0Lifetime1 <= stackIn_789_1Lifetime1) {
                      if (AccountCreationForm.field_T < 300 &&
                        EmailAddressValidator.field_l < 500) {
                        EmailAddressValidator.field_l = EmailAddressValidator.field_l + 1;
                      }
                      ArchiveLoadingPlan.field_g = ArchiveLoadingPlan.field_g + 1;
                      if (BufferedSocket.field_p[96]) {
                        ProgressQuery.field_m.field_b = -1;
                        if (AccountCreationForm.field_T < 25) {
                          AccountCreationForm.field_T = 50;
                          EmailAddressValidator.field_l = 0;
                          AccountCreationForm.field_T = AccountCreationForm.field_T + 1;
                        }
                      }
                      if (ArchiveLoadingPlan.field_g > 40) {
                        ArchiveLoadingPlan.field_g = ArchiveLoadingPlan.field_g - 40;
                      }
                      if (BufferedSocket.field_p[97]) {
                        if (AccountCreationForm.field_T < 25) {
                          AccountCreationForm.field_T = 50;
                          AccountCreationForm.field_T = AccountCreationForm.field_T + 1;
                          EmailAddressValidator.field_l = 0;
                        }
                        ProgressQuery.field_m.field_b = 1;
                      }
                      if (BufferedSocket.field_p[AccountFormTextHelpers.field_d] ||
                        BufferedSocket.field_p[98]) {
                        ProgressQuery.field_m.field_f = true;
                        if (AccountCreationForm.field_T >= 100 &&
                          AccountCreationForm.field_T < 150) {
                          EmailAddressValidator.field_l = 0;
                          AccountCreationForm.field_T = 250;
                        }
                      }
                      if (BufferedSocket.field_p[SpriteTextStyle.field_S] ||
                        BufferedSocket.field_p[83]) {
                        ProgressQuery.field_m.field_d = true;
                        if (50 <= AccountCreationForm.field_T &&
                          AccountCreationForm.field_T < 100) {
                          AccountCreationForm.field_T = 100;
                          EmailAddressValidator.field_l = 0;
                        }
                      }
                    }
                    stackIn_820_0 = (!RadixParsingHelpers.field_e) ? 0 : 1;
                    var3 = stackIn_820_0;
                    var2 = 0;
                    while (var2 < WidgetTheme.field_k) {
                      stackIn_855_0 = 2;
                      stackIn_855_1 = NameAvailabilityFactory.field_e[var2].actorType;
                      if (stackIn_855_0 < stackIn_855_1 &&
                        NameAvailabilityFactory.field_e[var2].actorType != 21 &&
                        44 != NameAvailabilityFactory.field_e[var2].actorType) {
                        var3 = 1;
                      }
                      if (!(BufferedSocket.field_a > -350) ||
                        !(0 <= GridActor.field_g)) {
                        NameAvailabilityFactory.field_e[var2].updateActor((byte) -123, SavedDataRequest.level);
                      }
                      var2++;
                    }
                    if (RadixParsingHelpers.field_e) {
                      if (0 >= BufferedSocket.field_a) {
                        MenuController.field_f = MenuController.field_f + 1;
                      }
                      if (HuffmanDecoder.field_c == 5 &&
                        GridActor.field_l == 1 &&
                        ArchiveProvider.field_a <= 0 &&
                        MenuController.field_f == 370) {
                        MenuController.field_f = MenuController.field_f + 1;
                        UsernameLoginCredentials.field_j = PcmResampler.field_d;
                        BufferedSocket.field_a = 580;
                      }
                      if (375 < MenuController.field_f) {
                        var4 = WidgetTheme.field_k;
                        for (var2 = 0; var4 > var2; var2++) {
                          stackIn_855_0Lifetime1 = 21;
                          stackIn_855_1Lifetime1 = NameAvailabilityFactory.field_e[var2].actorType;
                          if (stackIn_855_0Lifetime1 == stackIn_855_1Lifetime1) {
                            NameAvailabilityFactory.field_e[var2].field_k = 1;
                          }
                        }
                      }
                    }
                    if (var3 == 0 &&
                      !RadixParsingHelpers.field_e) {
                      AchievementUnlock.activateLevelExitEffect(2);
                    }
                    stackIn_855_0Lifetime2 = -1;
                    stackIn_855_1Lifetime2 = WidgetTheme.field_k;
                    for (var2 = stackIn_855_0Lifetime2 + stackIn_855_1Lifetime2; var2 >= 0; var2--) {
                      if (NameAvailabilityFactory.field_e[var2].field_k == 1) {
                        WidgetTheme.field_k = WidgetTheme.field_k - 1;
                        NameAvailabilityFactory.field_e[var2].field_w = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_w;
                        NameAvailabilityFactory.field_e[var2].field_o = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_o;
                        NameAvailabilityFactory.field_e[var2].field_z = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_z;
                        NameAvailabilityFactory.field_e[var2].animationFrame = NameAvailabilityFactory.field_e[WidgetTheme.field_k].animationFrame;
                        NameAvailabilityFactory.field_e[var2].actorType = NameAvailabilityFactory.field_e[WidgetTheme.field_k].actorType;
                        NameAvailabilityFactory.field_e[var2].field_x = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_x;
                        NameAvailabilityFactory.field_e[var2].verticalVelocity = NameAvailabilityFactory.field_e[WidgetTheme.field_k].verticalVelocity;
                        NameAvailabilityFactory.field_e[var2].tilePosition.set(-116, NameAvailabilityFactory.field_e[WidgetTheme.field_k].tilePosition);
                        NameAvailabilityFactory.field_e[var2].tileOffset.set(-89, NameAvailabilityFactory.field_e[WidgetTheme.field_k].tileOffset);
                        NameAvailabilityFactory.field_e[var2].field_h = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_h;
                        NameAvailabilityFactory.field_e[var2].field_d = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_d;
                        NameAvailabilityFactory.field_e[var2].field_k = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_k;
                        NameAvailabilityFactory.field_e[var2].field_p = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_p;
                        NameAvailabilityFactory.field_e[var2].field_r = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_r;
                        NameAvailabilityFactory.field_e[var2].field_s = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_s;
                        NameAvailabilityFactory.field_e[var2].field_y = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_y;
                        NameAvailabilityFactory.field_e[var2].field_A = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_A;
                        NameAvailabilityFactory.field_e[var2].field_q = NameAvailabilityFactory.field_e[WidgetTheme.field_k].field_q;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void drawOutlinedText(int param0, String param1, int param2, int param3, int param4) {
        String var6 = null;
        if (param1 == null) {
          return;
        }
        try {
          var6 = HighscorePlayer.replaceAllLiteral("<col", 0, "<", param1);
          int var7 = -9 % ((22 - param3) / 52);
          GameGraphicsResources.wizardFont2.drawStringCentered(var6, param4, -1 + param0, 0, -1);
          GameGraphicsResources.wizardFont2.drawStringCentered(var6, param4, 1 + param0, 0, -1);
          GameGraphicsResources.wizardFont2.drawStringCentered(var6, param4 - 1, param0, 0, -1);
          GameGraphicsResources.wizardFont2.drawStringCentered(var6, 1 + param4, param0, 0, -1);
          GameGraphicsResources.wizardFont2.drawStringCentered(param1, param4, param0, param2, -1);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "wizardrun.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void sortRankingIndices(boolean param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_34_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_15_0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_12_0Lifetime1;
        boolean stackIn_34_0Lifetime1;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = field_H;
        try {
          if (param6 >= param2) {
            return;
          }
          if (param3 <= (1 + param6)) {
            return;
          }
          if (param3 > (param6 + 5) &&
            ~param4 != ~param5) {
            var7_int = (param4 >> 1) + ((param5 >> 1) + (param4 & param5 & 1));
            var8 = param6;
            var9 = param5;
            var10 = param4;
            var11 = param6;
            while (var11 < param3) {
              var12 = EmailAddressValidator.field_m[var11];
              stackIn_34_0 = param0;
              if (stackIn_34_0) {
                stackIn_27_0 = RadialSelectorWidget.field_I[var12];
              } else {
                stackIn_27_0 = KeyboardShutdownHelpers.field_c[var12];
              }
              var13 = stackIn_27_0;
              if (var7_int >= var13) {
                if (var10 < var13) {
                  var10 = var13;
                }
              } else {
                EmailAddressValidator.field_m[var11] = EmailAddressValidator.field_m[var8];
                incrementValue$0 = var8;
                var8++;
                EmailAddressValidator.field_m[incrementValue$0] = var12;
                if (var13 < var9) {
                  var9 = var13;
                }
              }
              var11++;
            }
            wizardrun.sortRankingIndices(param0, param1, param2, var8, var9, param5, param6);
            stackIn_34_0Lifetime1 = param0;
            wizardrun.sortRankingIndices(stackIn_34_0Lifetime1, (byte) 11, param2, param3, param4, var10, var8);
            return;
          }
          var7_intLifetime1 = -1 + param3;
          while (true) {
            stackIn_12_0 = var7_intLifetime1;
            if (stackIn_12_0 <= param6) {
              return;
            }
            for (var8Lifetime1 = param6; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = EmailAddressValidator.field_m[var8Lifetime1];
              var10Lifetime1 = EmailAddressValidator.field_m[1 + var8Lifetime1];
              stackOut_15_0 = LoginCredentials.a(var10Lifetime1, var9Lifetime1, param0, (byte) -54);
              stackIn_12_0Lifetime1 = stackOut_15_0 ? 1 : 0;
              stackIn_16_0 = stackOut_15_0;
              if (stackIn_16_0) {
                EmailAddressValidator.field_m[var8Lifetime1] = var10Lifetime1;
                EmailAddressValidator.field_m[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
            var7_intLifetime1--;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var7), "wizardrun.CB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = field_H;
        this.a(11, false, 8, 10, false, 9, param0, 0);
        AudioOutput.configureAudio(22050, false, 10);
        NodeHashTableIterator.field_k = AudioOutput.create(MusicPatchLoader.field_g, (java.awt.Component) ((Object) field_G), 0, 512);
        Js5Index.field_d = AudioOutput.create(MusicPatchLoader.field_g, (java.awt.Component) ((Object) field_G), 1, 22050);
        FriendOrderingHelpers.field_a = new PcmStreamMixer();
        NodeHashTableIterator.field_k.setRootStream(FriendOrderingHelpers.field_a);
        SingleChildWidget.field_D = new MidiPcmStream();
        SingleChildWidget.field_D.setInitialProgram(128, 9, (byte) 108);
        Js5Index.field_d.setRootStream(SingleChildWidget.field_D);
        DisplayNameSyntaxHelpers.field_a = 500;
        BufferedSocket.field_c = BufferedSocket.field_c - DiskCacheStore.field_f * 64;
        HighscorePlayer.field_b = HighscorePlayer.field_b - HuffmanDecoder.field_c;
        LoadingMessageHelpers.field_f = LoadingMessageHelpers.field_f + GridActor.field_l * 6;
        GridActor.field_l = 0;
        DiskCacheStore.field_f = 0;
        NanoTickClock.field_n = 0;
        IntHashTable.field_d = new AccountSocketHelpers[16];
        HuffmanDecoder.field_c = 0;
        for (var2 = 0; 16 > var2; var2++) {
          IntHashTable.field_d[var2] = new AccountSocketHelpers();
        }
        NanoTickClock.field_n = IntHashTable.field_d[0].field_a;
        this.a(false, true, true, true, false);
    }

    public static void releaseStatics(boolean param0) {
        numberSprites = null;
        field_G = null;
        field_O = null;
        if (!param0) {
          return;
        }
        field_F = null;
    }

    public final void init() {
        this.a(12, (byte) 49, "wizardrun");
    }

    private final void drawBorderedText(int param0, String param1, int param2, int param3, int param4) {
        GameGraphicsResources.wizardFont2.drawStringCentered(param1, param3 - 1, param4, 1377125, 1377125);
        GameGraphicsResources.wizardFont2.drawStringCentered(param1, param3, -1 + param4, 1377125, 1377125);
        if (param0 != -12926) {
          return;
        }
        try {
          GameGraphicsResources.wizardFont2.drawStringCentered(param1, param3 - 1, 1 + param4, 1377125, 1377125);
          GameGraphicsResources.wizardFont2.drawStringCentered(param1, param3 + 1, -1 + param4, 1377125, 1377125);
          GameGraphicsResources.wizardFont2.drawStringCentered(param1, -1 + param3, param4 - 1, 1377125, -1);
          GameGraphicsResources.wizardFont2.drawStringCentered(param1, param3, param4 - 2, 1377125, -1);
          GameGraphicsResources.wizardFont2.drawStringCentered(param1, param3 - 2, param4, 1377125, -1);
          GameGraphicsResources.wizardFont2.drawStringCentered(param1, param3, param4, param2, 1377125);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "wizardrun.GB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0) {
        if (LoginChoicePanel.field_E != null) {
          WeightedLruCache.exitFullscreen((byte) 60);
        }
        if (NodeHashTableIterator.field_k != null) {
          NodeHashTableIterator.field_k.shutdown();
        }
        if (null != Js5Index.field_d) {
          Js5Index.field_d.shutdown();
        }
        if (param0) {
          return;
        }
        ClientShutdownHelpers.shutdownClient((byte) 84);
    }

    final void d(int param0) {
        int var3 = field_H;
        if (param0 != 7069) {
          field_E = -28;
        }
        wizardrun.releaseStatics(true);
        AchievementUnlock.releaseStatics(114);
        IntrusiveDeque.releaseStatics(param0 - 6962);
        TextPositionHelpers.releaseStatics(param0 ^ -7070);
        GameKeyHandler.releaseStatics((byte) 100);
        AccountValidationHelpers.releaseStatics(-7241);
        ThrowableFormattingHelpers.releaseStatics(13214);
        StringPaddingHelpers.releaseStatics(true);
        ErrorReportingHelpers.releaseStatics(true);
        DecodedSpritePalette.releaseStatics(true);
        IndexedSpriteArrayFactory.releaseStatics((byte) -62);
        UiThemeSetupHelpers.releaseStatics(-91);
        PasswordContentHelpers.releaseStatics(0);
        GameShell.releaseStatics(-18084);
        Base37Codec.releaseStatics(param0 - 6516);
        GameApplet.releaseStatics(113);
        UrlPacketDownloader.releaseStatics(240);
        MouseInputHandler.releaseStatics(4286);
        MouseWheelInput.releaseStatics(param0 ^ -7070);
        SoftwareRasterizer.releaseStatics();
        ResourceArchive.releaseStatics(param0 + 15706);
        KeyboardQueueConsumer.releaseStatics((byte) 102);
        MenuOverlayHelpers.releaseStatics(param0 ^ -32304);
        PacketBuffer.releaseStatics((byte) 118);
        MonotonicClockHelpers.releaseStatics(-5309);
        LoadingMessageHelpers.releaseStatics((byte) -31);
        TextWrappingHelpers.releaseStatics(false);
        LevelDecodingHelpers.releaseStatics(36);
        AccountPacketState.releaseStatics(-1);
        MusicPatchLoader.releaseStatics((byte) -122);
        SpriteFilterHelpers.releaseStatics(21100);
        SystemMemoryHelpers.releaseStatics((byte) 64);
        ChatMessage.releaseStatics(param0 ^ 7071);
        DisplayNameSyntaxHelpers.releaseStatics(0);
        BeveledFrameFactory.releaseStatics(param0 ^ 7127);
        RankingStatsDecoder.releaseStatics(false);
        FriendOrderingHelpers.releaseStatics((byte) -99);
        TickClock.releaseStatics((byte) -97);
        RasterBuffer.releaseStatics((byte) 75);
        ArchiveLoadingPlan.releaseStatics((byte) 37);
        FullscreenFocusCanvas.releaseStatics(true);
        FullscreenController.releaseStatics(false);
        Js5Transport.releaseStatics(0);
        DiskCacheWorker.releaseStatics(false);
        ArchiveCatalog.releaseStatics(-111);
        BufferedRandomAccessFile.releaseStatics((byte) -92);
        BufferedSocket.releaseStatics(param0 - 37603);
        MidiPcmStream.releaseStatics(91);
        AccountSocketHelpers.releaseStatics(false);
        PlatformActor.releaseStatics(param0 - 7133);
        FriendsListState.releaseStatics(param0 ^ -7150);
        GridPoint.releaseStatics(12523);
        LevelData.releaseStatics(true);
        AudioOutput.releaseStatics();
        GameMenu.releaseStatics(0);
        IntrusiveNode.releaseStatics((byte) 81);
        LoginPacketBuilder.releaseStatics(false);
        AccountFormText.releaseStatics(-1);
        ExceptionSupport.releaseStatics(1);
        KeyboardShutdownHelpers.releaseStatics(param0 - 7065);
        LoginCredentialKind.releaseStatics(0);
        LoginCredentials.releaseStatics(8192);
        IsaacPacketBuffer.releaseStatics((byte) -102);
        ThreePieceFrameHelpers.releaseStatics((byte) -2);
        IntrusiveNodeHashTable.releaseStatics(1);
        MidiNote.releaseStatics(true);
        MidiFileReader.releaseStatics();
        MidiNoteMixer.releaseStatics(-28471);
        SoundCache.releaseStatics(param0 - 7069);
        MeshLightingHelpers.releaseStatics(32348);
        CoverageFontLoader.releaseStatics((byte) 124);
        AudioServiceThread.releaseStatics(2);
        SpriteAlphaState.releaseStatics(102);
        BitmapFont.releaseStatics();
        ProgressRefreshState.releaseStatics((byte) 25);
        CharSequenceJoiner.releaseStatics(540);
        MenuInputState.releaseStatics(28);
        LogoAnimationLoader.releaseStatics(param0 - 7115);
        DialogLayer.releaseStatics((byte) 117);
        NameCheckProgressDialog.releaseStatics((byte) 120);
        ProgressDialog.releaseStatics(false);
        StandardContentTransitionDialog.releaseStatics(1);
        AccountProgressDialog.releaseStatics(true);
        AccountCreationForm.releaseStatics(-1);
        LoginChoicePanel.releaseStatics((byte) -121);
        LoginForm.releaseStatics(-6664);
        WidgetTheme.releaseStatics(23285);
        NameCheckHelpers.releaseStatics(0);
        Js5Index.releaseStatics(1);
        ArchiveProvider.releaseStatics(true);
        SpriteState.releaseStatics(110);
        DualLinkNode.releaseStatics(param0 - 7070);
        IndexedSpriteState.releaseStatics(false);
        MenuController.releaseStatics(true);
        StyleNode.releaseStatics(-21880);
        NineSliceFrame.releaseStatics(-6145);
        NameAvailabilityFactory.releaseStatics(1000);
        PcmResampler.releaseStatics((byte) 43);
        SynthInstrument.releaseStatics();
        VorbisSample.releaseStatics();
        VorbisFloor.releaseStatics();
        GridActor.releaseStatics((byte) -25);
        EncryptedLoginHelpers.releaseStatics(-49);
        SocketJs5Transport.releaseStatics(-1);
        DualLinkDeque.releaseStatics((byte) 92);
        NetworkArchiveRequest.releaseStatics((byte) -101);
        DiskCacheStore.releaseStatics((byte) 111);
        DiskCacheRequest.releaseStatics(100);
        CachedArchiveProvider.releaseStatics((byte) -8);
        ArchiveReadinessHelpers.releaseStatics(param0 ^ -7105);
        ArchiveRequest.releaseStatics(-86);
        IsaacRandom.releaseStatics((byte) -80);
        FriendLookupState.releaseStatics((byte) -60);
        PowerOfTwoHelpers.releaseStatics((byte) -63);
        WidgetPainter.releaseStatics(param0 - 3055);
        HighscorePlayerState.releaseStatics(-74);
        CheckboxPainter.releaseStatics(param0 - 6994);
        StatefulWidgetPainter.releaseStatics(param0 - 17128);
        RadialSelectorPainter.releaseStatics(param0 ^ -7141);
        MarkerSliderPainter.releaseStatics(param0 - 7067);
        IntrusiveDequeCursor.releaseStatics(91);
        UiWidget.releaseStatics((byte) 31);
        SingleChildWidget.releaseStatics(param0 ^ -7071);
        FadingDialog.releaseStatics(true);
        TextLayout.releaseStatics(false);
        LabeledField.releaseStatics(param0 ^ -7161);
        TextButton.releaseStatics(true);
        EditableTextWidget.releaseStatics((byte) 37);
        WidgetContainer.releaseStatics((byte) -106);
        ContentTransitionDialog.releaseStatics((byte) -68);
        ResizableDialog.releaseStatics(-6);
        StripedProgressBar.releaseStatics((byte) 111);
        NameSuggestionsPanel.releaseStatics(false);
        HotspotTextWidget.releaseStatics(-26);
        ValidationIndicator.releaseStatics(112);
        ValidationHelpWidget.releaseStatics((byte) 101);
        ToggleButton.releaseStatics(param0 ^ 20678);
        TextFieldValidator.releaseStatics(29);
        BrowserCookieHelpers.releaseStatics((byte) 52);
        AccountConsentPanel.releaseStatics((byte) -55);
        TriangleRasterState.releaseStatics();
        UiSpriteThemeHelpers.releaseStatics(-7077);
        FullscreenFailureDialog.releaseStatics(80);
        RankingWorkspaceHelpers.releaseStatics(param0 - 7067);
        MeshMaterial.releaseStatics((byte) -120);
        TriangleMesh.releaseStatics(0);
        BrowserUrlLauncher.releaseStatics((byte) -125);
        ArchiveContainerHelpers.releaseStatics(param0 - 6813);
        GameGraphicsResources.releaseStatics(0);
        RasterSnapshotStack.releaseStatics(false);
        HighscoreMessages.releaseStatics(-13078);
        SpriteTextStyle.releaseStatics(30828);
        DualLinkNodeHashTable.releaseStatics(-1);
        LevelActorSpawner.releaseStatics(0);
        IntHashTable.releaseStatics(31);
        ByteStorage.releaseStatics(16);
        Bzip2Decoder.releaseStatics();
        Bzip2State.releaseStatics(-124);
        ReflectionCheck.releaseStatics(param0 ^ -10072);
        ByteArrayPool.releaseStatics((byte) -43);
        Crc32Helpers.releaseStatics(-681844375);
        QuickChatPhraseDefinition.releaseStatics(0);
        RadixParsingHelpers.releaseStatics(true);
        QuickChatPhraseRepository.releaseStatics((byte) -44);
        WeightedLruCache.releaseStatics((byte) 80);
        AccountFormTextHelpers.releaseStatics(param0 - 7190);
        HuffmanDecoder.releaseStatics(110);
        SettingsCookieReader.releaseStatics(-106);
        CommonUiLoadingProgress.releaseStatics(param0 ^ 12465);
        SocketConnector.releaseStatics((byte) -64);
        ProxyAuthenticationException.releaseStatics(3543);
        NanoTickClock.releaseStatics(false);
        ImageProducerRasterBuffer.releaseStatics(0);
        FlatTriangleRasterizer.releaseStatics(-331851056);
        DisplayModeInfo.releaseStatics(-1926289535);
        WhirlpoolHasher.releaseStatics((byte) 58);
        MidiKeyUsage.releaseStatics(false);
        MusicPatch.releaseStatics(true);
        MidiEnvelope.releaseStatics(false);
        EmailDomainHelpers.releaseStatics(false);
        RadialSelectorWidget.releaseStatics(-13542);
        MarkerSliderWidget.releaseStatics((byte) 126);
        SynthFilter.releaseStatics();
        WrappedTextLayout.releaseStatics(10881);
        GrowableIntList.releaseStatics((byte) 55);
        DraggableWidget.releaseStatics(125);
        DropTargetWidget.releaseStatics(-27864);
        DateFormattingHelpers.releaseStatics(param0 ^ 7063);
        DirectByteStorage.releaseStatics(0);
        QuickChatDynamicCommand.releaseStatics((byte) 21);
        IterableNodeHashTable.releaseStatics((byte) 94);
        SecondaryNodeDeque.releaseStatics((byte) 5);
        CacheEntry.releaseStatics((byte) -110);
        StrongCacheEntry.releaseStatics(param0 - 6950);
        ProxySocketConnector.releaseStatics(4);
        NodeHashTableIterator.releaseStatics(339);
        RankingStatsRequest.releaseStatics(false);
        AchievementStateRequest.releaseStatics(10615);
        AchievementSubmission.releaseStatics((byte) -73);
        EmailCheckRequest.releaseStatics(125);
        DelayedServerPacket.releaseStatics(24944);
        ProgressQuery.releaseStatics((byte) -76);
        ProgressSubmission.releaseStatics(param0 - 7157);
        IntegerSyntaxHelpers.releaseStatics(-44);
        NameAvailabilityRequest.releaseStatics((byte) 119);
        SpriteButtonPainter.releaseStatics(2763306);
        HyperlinkPainter.releaseStatics(117);
        FramedButtonPainter.releaseStatics(-1);
        PasswordFieldPainter.releaseStatics((byte) -110);
        IconButtonPainter.releaseStatics((byte) -85);
        OpacityWidget.releaseStatics((byte) -19);
        HighscoreRequest.releaseStatics(-89);
        ScoreSubmission.releaseStatics(65535);
        HighscorePlayer.releaseStatics(true);
        FriendEntry.releaseStatics(false);
        RankingRequest.releaseStatics((byte) 118);
        ArchiveLoadingStage.releaseStatics((byte) -118);
        LoginMethodPreference.releaseStatics(-119);
        UsernameLoginCredentials.releaseStatics(24957);
        AlternateUsernameLoginCredentials.releaseStatics((byte) -118);
        EmailLoginCredentials.releaseStatics(-30);
        MessagePanel.releaseStatics(false);
        RasterSnapshot.releaseStatics(1);
        TextLayoutLine.releaseStatics(0);
        DisplayNameValidator.releaseStatics((byte) 100);
        PasswordValidator.releaseStatics(-110);
        EmailAddressValidator.releaseStatics(-128);
        ConfirmedEmailValidator.releaseStatics(param0 ^ 2098084476);
        AgeValidator.releaseStatics(true);
        ContentTransitionPhase.releaseStatics(24188);
        ValidationState.releaseStatics(0);
        TimedValidator.releaseStatics(param0 - 6948);
        FullscreenFailureKind.releaseStatics((byte) 99);
        SavedDataRequest.releaseStatics((byte) -100);
        SavedDataSubmission.releaseStatics(-1);
        EmailValidationError.releaseStatics(-2076560510);
        this.field_y = null;
    }

    public wizardrun() {
        this.field_M = 0;
        this.field_J = true;
        this.field_N = -1;
    }

    static {
        field_O = new byte[520];
        pointerX = -1;
        field_F = "Close";
        field_E = -1;
    }
}
