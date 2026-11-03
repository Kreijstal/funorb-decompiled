/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategoryCache {
    private ResourceArchive field_a;
    static SecondaryNodeHashTable field_d;
    static boolean field_g;
    private WeightedLruCache field_h;
    static String field_c;
    private ResourceArchive field_b;
    static int field_e;
    static int field_f;

    final static int a(int param0) {
        if (param0 > -103) {
          return 88;
        }
        return LinkButtonPainter.field_i;
    }

    final QuickChatCategory a(int param0, boolean param1) {
        ResourceArchive stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        boolean stackIn_8_3;
        ResourceArchive stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        boolean stackIn_12_3;
        ResourceArchive stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        boolean stackIn_30_3;
        ResourceArchive stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        boolean stackIn_34_3;
        QuickChatCategory var3;
        byte[] var4;
        QuickChatCategory var5;
        QuickChatCategory var6;
        QuickChatCategory var3Lifetime1;
        QuickChatCategory var3Lifetime2;
        byte[] var4Lifetime1;
        if (!param1) {
          var3 = (QuickChatCategory) (this.field_h.a((long)param0, 0));
          if (var3 != null) {
            return var3;
          }
          if (32768 > param0) {
            stackIn_33_0 = this.field_a;
            stackIn_33_1 = 0;
            stackIn_33_2 = param0;
            stackIn_34_3 = (param1) ? false : true;
            var4 = ((ResourceArchive) (Object) stackIn_33_0).a(stackIn_33_1, stackIn_33_2, stackIn_34_3);
          } else {
            stackIn_29_0 = this.field_b;
            stackIn_29_1 = 0;
            stackIn_29_2 = 32767 & param0;
            stackIn_30_3 = (param1) ? false : true;
            var4 = ((ResourceArchive) (Object) stackIn_29_0).a(stackIn_29_1, stackIn_29_2, stackIn_30_3);
          }
          var6 = new QuickChatCategory();
          if (var4 != null) {
            var6.decode(false, new PacketBuffer(var4));
          }
          if (param0 >= 32768) {
            var6.applyGlobalIds((byte) 92);
          }
          this.field_h.a((long)param0, var6, (byte) 109);
          return var6;
        }
        field_e = 75;
        var3Lifetime1 = (QuickChatCategory) (this.field_h.a((long)param0, 0));
        if (var3Lifetime1 != null) {
          return var3Lifetime1;
        }
        if (32768 > param0) {
          stackIn_11_0 = this.field_a;
          stackIn_11_1 = 0;
          stackIn_11_2 = param0;
          stackIn_12_3 = (param1) ? false : true;
          var4Lifetime1 = ((ResourceArchive) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2, stackIn_12_3);
        } else {
          stackIn_7_0 = this.field_b;
          stackIn_7_1 = 0;
          stackIn_7_2 = 32767 & param0;
          stackIn_8_3 = (param1) ? false : true;
          var4Lifetime1 = ((ResourceArchive) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_8_3);
        }
        var5 = new QuickChatCategory();
        var3Lifetime2 = var5;
        if (var4Lifetime1 != null) {
          var5.decode(false, new PacketBuffer(var4Lifetime1));
        }
        if (param0 >= 32768) {
          var5.applyGlobalIds((byte) 92);
        }
        this.field_h.a((long)param0, var5, (byte) 109);
        return var5;
    }

    final static void a(int param0, LobbyPlayer param1) {
        LobbyPlayer var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 > -12) {
            return;
          }
          param1.c(2779);
          var2 = (LobbyPlayer) (ImageProducerRasterBuffer.field_n.c(1504642273));
          while (var2 != null) {
            if (var2.a(param1, (byte) -82)) {
              var2 = (LobbyPlayer) (ImageProducerRasterBuffer.field_n.last(1504642273));
              continue;
            }
            break;
          }
          if (var2 == null) {
            ImageProducerRasterBuffer.field_n.addFirst(22125, param1);
            return;
          }
          stackIn_10_0 = 126;
          BackgroundScene.$cfr$intArgs$a$2d0b7bdf67eb(stackIn_10_0, var2, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_14_0 = var2_ref;
          stackIn_14_1 = new StringBuilder().append("il.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != -17194) {
          field_c = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    QuickChatCategoryCache(int param0, ResourceArchive param1, ResourceArchive param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = new WeightedLruCache(64);
        try {
          this.field_a = param1;
          this.field_b = param2;
          if (this.field_a != null) {
            this.field_a.b(0, (byte) 63);
          }
          if (this.field_b == null) {
            return;
          }
          this.field_b.b(0, (byte) 24);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("il.<init>(").append(param0).append(',');
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
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_g = false;
        field_c = "Similar rating";
        field_e = -1;
    }
}
