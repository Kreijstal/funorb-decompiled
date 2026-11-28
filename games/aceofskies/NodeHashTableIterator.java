/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    static HighscoreNameEntry[] highscoreNameEntries;
    private IterableNodeHashTable table;
    private IntrusiveNode lastReturned;
    private IntrusiveNode nextNode;
    private int nextBucketIndex;
    static String field_c;
    static long field_g;

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        String stackIn_35_2 = null;
        try {
          if (param1 != 1) {
            Class stackIn_2_0 = (Class) null;
            return stackIn_2_0;
          }
          if (param0.equals("B")) {
            Class stackIn_6_0 = Byte.TYPE;
            return stackIn_6_0;
          }
          if (param0.equals("I")) {
            Class stackIn_9_0 = Integer.TYPE;
            return stackIn_9_0;
          }
          if (param0.equals("S")) {
            Class stackIn_13_0 = Short.TYPE;
            return stackIn_13_0;
          }
          if (param0.equals("J")) {
            Class stackIn_16_0 = Long.TYPE;
            return stackIn_16_0;
          }
          if (param0.equals("Z")) {
            Class stackIn_20_0 = Boolean.TYPE;
            return stackIn_20_0;
          }
          if (param0.equals("F")) {
            Class stackIn_24_0 = Float.TYPE;
            return stackIn_24_0;
          }
          if (param0.equals("D")) {
            Class stackIn_27_0 = Double.TYPE;
            return stackIn_27_0;
          }
          if (!param0.equals("C")) {
            return Class.forName(param0);
          }
          Class stackIn_31_0 = Character.TYPE;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_34_0 = var2;
          StringBuilder stackIn_34_1 = new StringBuilder().append("pe.A(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void reset(boolean param0) {
        this.nextNode = this.table.buckets[0].next;
        this.nextBucketIndex = 1;
        if (!param0) {
          return;
        }
        this.lastReturned = null;
    }

    public final boolean hasNext() {
        int var2 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.nextNode != this.table.buckets[-1 + this.nextBucketIndex]) {
          return true;
        }
        while (this.nextBucketIndex < this.table.bucketCount) {
          IntrusiveNode[] fieldTemp$0 = this.table.buckets;
          int fieldTemp$1 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          if (fieldTemp$0[fieldTemp$1].next != this.table.buckets[this.nextBucketIndex - 1]) {
            this.nextNode = this.table.buckets[this.nextBucketIndex - 1].next;
            return true;
          }
          this.nextNode = this.table.buckets[this.nextBucketIndex - 1];
        }
        return false;
    }

    final static void decodeGameImagesAndFonts(ResourceArchive fontMetricsArchive, byte obfuscationGuard, ResourceArchive sharedSpriteArchive, ResourceArchive gameSpriteArchive) {
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          oo.backgroundSpriteData = new SpriteData[2];
          for (int var4_int = 0; oo.backgroundSpriteData.length > var4_int; var4_int++) {
            oo.backgroundSpriteData[var4_int] = SpriteData.loadFirstFrame(gameSpriteArchive, "aceofskies", "background" + var4_int);
          }
          SteeringMode.aircraftSpriteData = new SpriteData[8][];
          for (int var4_intLifetime1 = 0; var4_intLifetime1 < 8; var4_intLifetime1++) {
            SteeringMode.aircraftSpriteData[var4_intLifetime1] = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "plane" + var4_intLifetime1);
          }
          if (obfuscationGuard <= 22) {
            field_c = (String) null;
          }
          na.cloudSpriteData = new SpriteData[1];
          for (int var4_intLifetime2 = 0; var4_intLifetime2 < 1; var4_intLifetime2++) {
            na.cloudSpriteData[var4_intLifetime2] = SpriteData.loadFirstFrame(gameSpriteArchive, "aceofskies", "cloud" + var4_intLifetime2);
          }
          RendererManager.bulletSpriteData = SpriteData.loadFirstFrame(gameSpriteArchive, "aceofskies", "bullet");
          tq.smokeSpriteData = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "smoke");
          ud.explosionSpriteData = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "explosion");
          gn.scorchSpriteData = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "scorch");
          BoundedRandomAccessFile.titleImageData = SpriteData.loadFirstFrame(gameSpriteArchive, "", "titleimage");
          ArchiveIndex.gaugeSpriteData = new SpriteData[3][];
          ArchiveIndex.gaugeSpriteData[0] = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "oilgauge");
          ArchiveIndex.gaugeSpriteData[1] = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "heatgauge");
          ArchiveIndex.gaugeSpriteData[2] = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "supergauge");
          qq.upgradeSpriteData = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "upgrades");
          FlightBody.radarSpriteData = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "radar");
          eb.counterPanelSpriteData = new SpriteData[2];
          eb.counterPanelSpriteData[0] = SpriteData.loadFirstFrame(gameSpriteArchive, "aceofskies", "scorecounter");
          eb.counterPanelSpriteData[1] = SpriteData.loadFirstFrame(gameSpriteArchive, "aceofskies", "multiplier");
          kb.scoreDigitSpriteData = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "scorenumbers");
          hq.levelRingSpriteData = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "levelring");
          qa.keySpriteData = SpriteData.loadFrames(gameSpriteArchive, "", "keys");
          CipherPacketBuffer.fontSpriteData = SpriteData.loadFrames(gameSpriteArchive, "", "fontalpha");
          hi.gameFontMetrics = tg.a(fontMetricsArchive, 8191, "", "font");
          q.bigFontSpriteData = SpriteData.loadFrames(gameSpriteArchive, "", "bigfontalpha");
          kn.bigFontMetrics = tg.a(fontMetricsArchive, 8191, "", "bigfont");
          nc.titleFontSpriteData = SpriteData.loadFrames(gameSpriteArchive, "", "titlefontalpha");
          ImageProducerRasterBuffer.titleFontMetrics = tg.a(fontMetricsArchive, 8191, "", "titlefont");
          lt.woodenTileSpriteData = SpriteData.loadFirstFrame(gameSpriteArchive, "", "woodentile");
          gu.brassFrameSpriteData = SpriteData.loadFrames(gameSpriteArchive, "", "brassframe");
          vl.brassButtonSpriteData = SpriteData.loadFrames(gameSpriteArchive, "", "brassbutton");
          qk.brassSliderSpriteData = SpriteData.loadFrames(gameSpriteArchive, "", "brassslider");
          ol.powerchuteSpriteData = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "powerchutes");
          nu.powerIconSpriteData = SpriteData.loadFrames(gameSpriteArchive, "aceofskies", "powericons");
          tt.powerBulbSpriteData = new SpriteData[2];
          tt.powerBulbSpriteData[0] = SpriteData.loadFirstFrame(gameSpriteArchive, "aceofskies", "glassbulb");
          tt.powerBulbSpriteData[1] = SpriteData.loadFirstFrame(gameSpriteArchive, "aceofskies", "bulblight");
          BufferElementType.achievementSpriteData = SpriteData.loadFrames(gameSpriteArchive, "", "achievements");
          ByteStorage.medalSpriteData = SpriteData.loadFrames(gameSpriteArchive, "", "medals");
          vl.coinSpriteData = SpriteData.loadFirstFrame(sharedSpriteArchive, "basic", "orbcoin");
          SecondaryKeyHashTable.lockedSpriteData = SpriteData.loadFirstFrame(sharedSpriteArchive, "basic", "locked");
          HighscoreQuery.unachievedSpriteData = SpriteData.loadFirstFrame(sharedSpriteArchive, "basic", "unachieved");
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "pe.D(" + (fontMetricsArchive != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (sharedSpriteArchive != null ? "{...}" : "null") + ',' + (gameSpriteArchive != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink(-123);
        this.lastReturned = null;
    }

    public final Object next() {
        IntrusiveNode var1;
        int var2 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.nextNode != this.table.buckets[-1 + this.nextBucketIndex]) {
          var1 = this.nextNode;
          this.lastReturned = var1;
          this.nextNode = var1.next;
          return var1;
        }
        do {
          if (this.nextBucketIndex >= this.table.bucketCount) {
            return null;
          }
          IntrusiveNode[] fieldTemp$0 = this.table.buckets;
          int fieldTemp$1 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          var1 = fieldTemp$0[fieldTemp$1].next;
        } while (this.table.buckets[-1 + this.nextBucketIndex] == var1);
        this.lastReturned = var1;
        this.nextNode = var1.next;
        return var1;
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.lastReturned = null;
        try {
          this.table = param0;
          this.reset(true);
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        highscoreNameEntries = null;
        if (param0 != 19592) {
          return;
        }
        field_c = null;
    }

    final static DefaultTextWidgetRenderer a(byte param0) {
        int var1 = 33 / ((14 - param0) / 58);
        if (ij.field_j == null) {
          ij.field_j = new DefaultTextWidgetRenderer(oi.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, oi.field_c.maxAscent, -1, 2147483647, true);
        }
        return ij.field_j;
    }

    static {
        highscoreNameEntries = new HighscoreNameEntry[255];
        for (int var0 = 0; highscoreNameEntries.length > var0; var0++) {
          highscoreNameEntries[var0] = new HighscoreNameEntry();
        }
        field_c = "This is a hidden Achievement";
    }
}
