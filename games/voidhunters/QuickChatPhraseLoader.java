/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseLoader {
    static int field_d;
    static int field_b;
    private SoftLruCache cache;
    private ResourceArchive alternateArchive;
    private ResourceArchive primaryArchive;

    final QuickChatPhraseDefinition getPhrase(int param0, int param1) {
        QuickChatPhraseDefinition var3;
        byte[] var4;
        QuickChatPhraseDefinition var5;
        QuickChatPhraseDefinition var6;
        byte[] var4Lifetime1;
        var3 = (QuickChatPhraseDefinition) (this.cache.get(0, (long)param0));
        if (var3 != null) {
          return var3;
        }
        if (param1 < -99) {
          if (32768 > param0) {
            var4 = this.primaryArchive.fetchFile(1, param0, (byte) 13);
          } else {
            var4 = this.alternateArchive.fetchFile(1, param0 & 32767, (byte) 13);
          }
          var6 = new QuickChatPhraseDefinition();
          if (var4 != null) {
            var6.decode(new PacketBuffer(var4), -1);
          }
          if (param0 >= 32768) {
            var6.markAlternateArchiveReferences((byte) 97);
          }
          this.cache.put(var6, (long)param0, (byte) -117);
          return var6;
        }
        this.cache = (SoftLruCache) null;
        if (32768 > param0) {
          var4Lifetime1 = this.primaryArchive.fetchFile(1, param0, (byte) 13);
        } else {
          var4Lifetime1 = this.alternateArchive.fetchFile(1, param0 & 32767, (byte) 13);
        }
        var5 = new QuickChatPhraseDefinition();
        if (var4Lifetime1 != null) {
          var5.decode(new PacketBuffer(var4Lifetime1), -1);
        }
        if (param0 >= 32768) {
          var5.markAlternateArchiveReferences((byte) 97);
        }
        this.cache.put(var5, (long)param0, (byte) -117);
        return var5;
    }

    QuickChatPhraseLoader(int param0, ResourceArchive param1, ResourceArchive param2, rs param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.cache = new SoftLruCache(64);
        try {
          this.primaryArchive = param1;
          this.alternateArchive = param2;
          if (this.primaryArchive != null) {
            this.primaryArchive.getGroupFileCapacity(1, -6942);
          }
          if (null == this.alternateArchive) {
            return;
          }
          this.alternateArchive.getGroupFileCapacity(1, -6942);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("voa.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_b = 1280;
        field_d = 0;
    }
}
