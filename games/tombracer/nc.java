/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static ToolkitSprite field_e;
    private ResourceArchive field_a;
    private SoftReferenceCache field_c;
    private ResourceArchive field_d;
    static int[] field_b;

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 <= 44) {
          nc.releaseStatics(-93);
          field_e = null;
          return;
        }
        field_e = null;
    }

    final QuickChatCategory getCategory(byte param0, int param1) {
        byte[] var4 = null;
        int var5 = 0;
        QuickChatCategory var3 = (QuickChatCategory) (this.field_c.get((byte) 114, (long)param1));
        int var5Lifetime1;
        if (var3 != null) {
          return var3;
        }
        if (param1 >= 32768) {
          var4 = this.field_d.getFile(false, 0, 32767 & param1);
        } else {
          var4 = this.field_a.getFile(false, 0, param1);
        }
        QuickChatCategory var6 = new QuickChatCategory();
        if (var4 == null) {
          if (param1 >= 32768) {
            var6.applyGlobalIds(10211);
          }
          var5 = -55 / ((param0 + 25) / 35);
          this.field_c.put(29166, var6, (long)param1);
          return var6;
        }
        var6.decode(new PacketBuffer(var4), -26706);
        if (param1 >= 32768) {
          var6.applyGlobalIds(10211);
        }
        var5Lifetime1 = -55 / ((param0 + 25) / 35);
        this.field_c.put(29166, var6, (long)param1);
        return var6;
    }

    nc(int param0, ResourceArchive param1, ResourceArchive param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = new SoftReferenceCache(64);
        try {
          this.field_a = param1;
          this.field_d = param2;
          if (this.field_a != null) {
            this.field_a.getFileCount((byte) -88, 0);
          }
          if (null == this.field_d) {
            return;
          }
          this.field_d.getFileCount((byte) -91, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("nc.<init>(").append(param0).append(',');
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
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_b = new int[8192];
    }
}
