/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategoryLoader {
    static GameStateFactory field_d;
    private ResourceArchive alternateArchive;
    private ResourceArchive primaryArchive;
    private SoftLruCache cache;
    static int field_b;
    static String field_f;

    final QuickChatCategoryDefinition getCategory(byte param0, int param1) {
        byte[] var4 = null;
        QuickChatCategoryDefinition var3 = (QuickChatCategoryDefinition) (this.cache.get(0, (long)param1));
        if (var3 != null) {
          return var3;
        }
        if (param0 != -72) {
          return (QuickChatCategoryDefinition) null;
        }
        if (param1 >= 32768) {
          var4 = this.alternateArchive.fetchFile(0, 32767 & param1, (byte) 13);
        } else {
          var4 = this.primaryArchive.fetchFile(0, param1, (byte) 13);
        }
        QuickChatCategoryDefinition var5 = new QuickChatCategoryDefinition();
        if (var4 != null) {
          var5.decode(new PacketBuffer(var4), param0 + 8524);
          if (32768 <= param1) {
            var5.markAlternateArchiveReferences(0);
            this.cache.put(var5, (long)param1, (byte) -117);
            return var5;
          }
          this.cache.put(var5, (long)param1, (byte) -117);
          return var5;
        }
        if (32768 > param1) {
          this.cache.put(var5, (long)param1, (byte) -117);
          return var5;
        }
        var5.markAlternateArchiveReferences(0);
        this.cache.put(var5, (long)param1, (byte) -117);
        return var5;
    }

    final static int adjustPopupX(byte param0, int param1, int param2, int param3) {
        if (!(SoftwareRasterizer2D.width < param3 + param1)) {
          return param1;
        }
        if (param0 != -109) {
          QuickChatCategoryLoader.clearSharedReferences((byte) 16);
          if (0 <= param2 + param1 - param3) {
            return param2 + (param1 - param3);
          }
          return -param3 + SoftwareRasterizer2D.width;
        }
        if (0 <= param2 + param1 - param3) {
          return param2 + (param1 - param3);
        }
        return -param3 + SoftwareRasterizer2D.width;
    }

    public static void clearSharedReferences(byte param0) {
        field_f = null;
        field_d = null;
        if (param0 != -33) {
          field_b = -56;
        }
    }

    QuickChatCategoryLoader(int param0, ResourceArchive param1, ResourceArchive param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.cache = new SoftLruCache(64);
        try {
          this.primaryArchive = param1;
          this.alternateArchive = param2;
          if (this.primaryArchive != null) {
            this.primaryArchive.getGroupFileCapacity(0, -6942);
          }
          if (null == this.alternateArchive) {
            return;
          }
          this.alternateArchive.getGroupFileCapacity(0, -6942);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("jv.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_d = (GameStateFactory) ((Object) new MissionConditionFactory());
        field_f = "Updates will sent to the email address you've given";
    }
}
