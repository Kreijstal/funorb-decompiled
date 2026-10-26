/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScoreSubmission extends IntrusiveNode {
    int firstContextValue;
    int firstShortValue;
    int[] scores;
    static int field_l;
    int submissionId;
    int fourthContextValue;
    int secondShortValue;
    long submissionToken;
    int secondContextValue;
    int thirdContextValue;

    final static boolean a(int param0, int param1, int param2) {
        if (param0 != 0) {
          ScoreSubmission.createRendererResources(-70);
        }
        boolean stackIn_6_0 = (0 != (param2 & 2048)) && ((param1 & 55) != 0);
        return stackIn_6_0;
    }

    final static void createRendererResources(int obfuscationGuard) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          GraphicsRenderer var6 = FlightSession.rendererManager.a((byte) 100);
          if (hr.aircraftSprites == null) {
            hr.aircraftSprites = new RenderSprite[SteeringMode.aircraftSpriteData.length][];
            is.backgroundSprites = new RenderSprite[oo.backgroundSpriteData.length];
            sd.cloudSprites = new RenderSprite[na.cloudSpriteData.length];
            es.smokeSprites = new RenderSprite[tq.smokeSpriteData.length];
            bl.explosionSprites = new RenderSprite[ud.explosionSpriteData.length];
            ac.keySprites = new RenderSprite[qa.keySpriteData.length];
            jm.levelRingSprites = new RenderSprite[hq.levelRingSpriteData.length];
            aa.achievementSprites = new RenderSprite[la.achievementSpriteData.length];
            rs.medalSprites = new RenderSprite[af.medalSpriteData.length];
            bs.upgradeSprites = new RenderSprite[qq.upgradeSpriteData.length];
            HighscoreQuery.powerBulbSprites = new RenderSprite[tt.powerBulbSpriteData.length];
            ua.counterPanelSprites = new RenderSprite[eb.counterPanelSpriteData.length];
            in.scoreDigitSprites = new RenderSprite[kb.scoreDigitSpriteData.length];
            ii.gaugeSprites = new RenderSprite[ArchiveIndex.gaugeSpriteData.length][];
            Pickup.powerchuteSprites = new RenderSprite[ol.powerchuteSpriteData.length];
            po.powerIconSprites = new RenderSprite[nu.powerIconSpriteData.length];
            co.scorchSprites = new RenderSprite[gn.scorchSpriteData.length];
            ec.radarSprites = new RenderSprite[FlightBody.radarSpriteData.length];
            mb.brassButtonSprites = new RenderSprite[vl.brassButtonSpriteData.length];
            CipherPacketBuffer.brassSliderSprites = new RenderSprite[qk.brassSliderSpriteData.length];
            ko.brassFrameSprites = new RenderSprite[gu.brassFrameSpriteData.length];
            for (int var2 = 0; ii.gaugeSprites.length > var2; var2++) {
              RenderSprite[] array$0 = new RenderSprite[ArchiveIndex.gaugeSpriteData[var2].length];
              ii.gaugeSprites[var2] = array$0;
            }
          }
          for (int var2Lifetime1 = 0; var2Lifetime1 < SteeringMode.aircraftSpriteData.length; var2Lifetime1++) {
            if (hr.aircraftSprites[var2Lifetime1] == null) {
              RenderSprite[] array$1 = new RenderSprite[SteeringMode.aircraftSpriteData[var2Lifetime1].length];
              hr.aircraftSprites[var2Lifetime1] = array$1;
            }
            for (int var3 = 0; var3 < SteeringMode.aircraftSpriteData[var2Lifetime1].length; var3++) {
              hr.aircraftSprites[var2Lifetime1][var3] = var6.createSprite(SteeringMode.aircraftSpriteData[var2Lifetime1][var3], false);
            }
          }
          for (int var2Lifetime2 = 0; var2Lifetime2 < oo.backgroundSpriteData.length; var2Lifetime2++) {
            is.backgroundSprites[var2Lifetime2] = var6.createSprite(oo.backgroundSpriteData[var2Lifetime2], false);
          }
          for (int var2Lifetime3 = 0; na.cloudSpriteData.length > var2Lifetime3; var2Lifetime3++) {
            sd.cloudSprites[var2Lifetime3] = var6.createSprite(na.cloudSpriteData[var2Lifetime3], false);
          }
          for (int var2Lifetime4 = 0; tq.smokeSpriteData.length > var2Lifetime4; var2Lifetime4++) {
            es.smokeSprites[var2Lifetime4] = var6.createSprite(tq.smokeSpriteData[var2Lifetime4], false);
          }
          for (int var2Lifetime5 = 0; ud.explosionSpriteData.length > var2Lifetime5; var2Lifetime5++) {
            bl.explosionSprites[var2Lifetime5] = var6.createSprite(ud.explosionSpriteData[var2Lifetime5], false);
          }
          for (int var2Lifetime6 = 0; ol.powerchuteSpriteData.length > var2Lifetime6; var2Lifetime6++) {
            Pickup.powerchuteSprites[var2Lifetime6] = var6.createSprite(ol.powerchuteSpriteData[var2Lifetime6], false);
          }
          for (int var2Lifetime7 = 0; nu.powerIconSpriteData.length > var2Lifetime7; var2Lifetime7++) {
            po.powerIconSprites[var2Lifetime7] = var6.createSprite(nu.powerIconSpriteData[var2Lifetime7], false);
          }
          for (int var2Lifetime8 = 0; gn.scorchSpriteData.length > var2Lifetime8; var2Lifetime8++) {
            co.scorchSprites[var2Lifetime8] = var6.createSprite(gn.scorchSpriteData[var2Lifetime8], false);
          }
          for (int var2Lifetime9 = 0; FlightBody.radarSpriteData.length > var2Lifetime9; var2Lifetime9++) {
            ec.radarSprites[var2Lifetime9] = var6.createSprite(FlightBody.radarSpriteData[var2Lifetime9], false);
          }
          int var2Lifetime10 = 0;
          if (obfuscationGuard <= 38) {
            ScoreSubmission.createRendererResources(65);
          }
          while (var2Lifetime10 < gu.brassFrameSpriteData.length) {
            ko.brassFrameSprites[var2Lifetime10] = var6.createSprite(gu.brassFrameSpriteData[var2Lifetime10], false);
            var2Lifetime10++;
          }
          for (int var2Lifetime11 = 0; var2Lifetime11 < vl.brassButtonSpriteData.length; var2Lifetime11++) {
            mb.brassButtonSprites[var2Lifetime11] = var6.createSprite(vl.brassButtonSpriteData[var2Lifetime11], false);
          }
          for (int var2Lifetime12 = 0; qk.brassSliderSpriteData.length > var2Lifetime12; var2Lifetime12++) {
            CipherPacketBuffer.brassSliderSprites[var2Lifetime12] = var6.createSprite(qk.brassSliderSpriteData[var2Lifetime12], false);
          }
          qk.woodenTileSprite = var6.createSprite(lt.woodenTileSpriteData, false);
          for (int var2Lifetime13 = 0; var2Lifetime13 < qa.keySpriteData.length; var2Lifetime13++) {
            ac.keySprites[var2Lifetime13] = var6.createSprite(qa.keySpriteData[var2Lifetime13], false);
          }
          for (int var2Lifetime14 = 0; var2Lifetime14 < ArchiveIndex.gaugeSpriteData.length; var2Lifetime14++) {
            int var5 = 0;
            int var3Lifetime1 = var5;
            while (var5 < ArchiveIndex.gaugeSpriteData[var2Lifetime14].length) {
              ii.gaugeSprites[var2Lifetime14][var5] = var6.createSprite(ArchiveIndex.gaugeSpriteData[var2Lifetime14][var5], false);
              var5++;
            }
          }
          for (int var2Lifetime15 = 0; qq.upgradeSpriteData.length > var2Lifetime15; var2Lifetime15++) {
            bs.upgradeSprites[var2Lifetime15] = var6.createSprite(qq.upgradeSpriteData[var2Lifetime15], false);
          }
          for (int var2Lifetime16 = 0; var2Lifetime16 < tt.powerBulbSpriteData.length; var2Lifetime16++) {
            HighscoreQuery.powerBulbSprites[var2Lifetime16] = var6.createSprite(tt.powerBulbSpriteData[var2Lifetime16], false);
          }
          for (int var2Lifetime17 = 0; hq.levelRingSpriteData.length > var2Lifetime17; var2Lifetime17++) {
            jm.levelRingSprites[var2Lifetime17] = var6.createSprite(hq.levelRingSpriteData[var2Lifetime17], false);
          }
          for (int var2Lifetime18 = 0; var2Lifetime18 < eb.counterPanelSpriteData.length; var2Lifetime18++) {
            ua.counterPanelSprites[var2Lifetime18] = var6.createSprite(eb.counterPanelSpriteData[var2Lifetime18], false);
          }
          for (int var2Lifetime19 = 0; var2Lifetime19 < kb.scoreDigitSpriteData.length; var2Lifetime19++) {
            in.scoreDigitSprites[var2Lifetime19] = var6.createSprite(kb.scoreDigitSpriteData[var2Lifetime19], false);
          }
          mp.titleImage = var6.createSprite(fs.titleImageData, false);
          dc.bulletSprite = var6.createSprite(RendererManager.bulletSpriteData, false);
          se.bigGameFont = var6.a(kn.bigFontMetrics, q.bigFontSpriteData, true);
          kn.titleFont = var6.a(dp.titleFontMetrics, nc.titleFontSpriteData, true);
          PacketBuffer.gameFont = var6.a(hi.gameFontMetrics, CipherPacketBuffer.fontSpriteData, true);
          for (int var2Lifetime20 = 0; la.achievementSpriteData.length > var2Lifetime20; var2Lifetime20++) {
            aa.achievementSprites[var2Lifetime20] = var6.createSprite(la.achievementSpriteData[var2Lifetime20], false);
          }
          for (int var2Lifetime21 = 0; var2Lifetime21 < af.medalSpriteData.length; var2Lifetime21++) {
            RenderSprite[] stackIn_78_0 = rs.medalSprites;
            stackIn_78_0[var2Lifetime21] = var6.createSprite(af.medalSpriteData[var2Lifetime21], false);
          }
          lg.coinSprite = var6.createSprite(vl.coinSpriteData, false);
          ut.lockedSprite = var6.createSprite(es.lockedSpriteData, false);
          dh.unachievedSprite = var6.createSprite(HighscoreQuery.unachievedSpriteData, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "ga.A(" + obfuscationGuard + ')');
        }
    }

    ScoreSubmission(int firstShortValue, int secondShortValue, int firstContextValue, int secondContextValue, int thirdContextValue, int fourthContextValue, int[] scores) {
        try {
          this.secondShortValue = secondShortValue;
          this.secondContextValue = secondContextValue;
          this.thirdContextValue = thirdContextValue;
          this.firstShortValue = firstShortValue;
          this.scores = scores;
          int fieldTemp$0 = am.nextScoreSubmissionId;
          am.nextScoreSubmissionId = am.nextScoreSubmissionId + 1;
          this.submissionId = 65535 & fieldTemp$0;
          this.firstContextValue = firstContextValue;
          this.fourthContextValue = fourthContextValue;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ga.<init>(" + firstShortValue + ',' + secondShortValue + ',' + firstContextValue + ',' + secondContextValue + ',' + thirdContextValue + ',' + fourthContextValue + ',' + (scores != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = -1;
    }
}
