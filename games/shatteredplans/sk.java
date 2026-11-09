/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends IntrusiveNode {
    int field_j;
    long field_l;
    static AnimatedPanel field_k;
    byte[] field_h;
    static String field_i;

    public static void clearStatics(int param0) {
        field_i = null;
        field_k = null;
        if (param0 >= -6) {
          sk.a(false, 27);
        }
    }

    final static nf a(boolean param0, int param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        QuickChatCategoryDefinition var9 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var8 = sa.field_a;
        var3 = var8.readUnsignedByte(param1 ^ 113);
        stackIn_3_0 = (param1 != ~(128 & var3));
        InvalidMapConnectionException.field_b = stackIn_3_0;
        PacketBuffer.field_k = var3 & 127;
        nj.field_a = var8.readUnsignedByte(-77);
        WidgetStyle.field_j = var8.readLong(param1 ^ -31);
        if (PacketBuffer.field_k != 2) {
          TertiaryNodeList.field_f = 0;
          va.field_b = 0;
        } else {
          TertiaryNodeList.field_f = var8.readUnsignedShort(param1 - 20975);
          va.field_b = var8.readMedium(param1 + 256);
        }
        stackIn_9_0 = (1 != var8.readUnsignedByte(param1 - 66)) ? 0 : 1;
        var4 = stackIn_9_0;
        ArchiveRequest.field_s = var8.readString(param1 ^ 0);
        if (var4 == 0) {
          ProductionContent.field_a = ArchiveRequest.field_s;
        } else {
          ProductionContent.field_a = var8.readString(-1);
        }
        if (PacketBuffer.field_k != 1 &&
          PacketBuffer.field_k != 4) {
          HuffmanCodec.field_f = 0;
          WeightedCacheEntry.field_q = null;
        } else {
          HuffmanCodec.field_f = var8.readUnsignedShort(param1 - 20975);
          WeightedCacheEntry.field_q = var8.readString(param1 + 0);
        }
        if (!param0) {
          BufferedSocket.field_h = UnderageAccountInfoPanel.a(var8, param1 + 1, 80);
          AgeValidator.field_p = null;
          return new nf(param0);
        }
        var5 = var8.readUnsignedShort(-20976);
        try {
          var9 = dh.field_c.a((byte) 47, var5);
          BufferedSocket.field_h = var9.f(80);
          if (ProductionContent.field_a.equals(Star.field_o)) {
            stackIn_22_0 = null;
          } else {
            stackIn_22_0 = var9.field_o;
          }
          AgeValidator.field_p = stackIn_22_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          GameKeyHandler.a(param1 - 29900, (Throwable) ((Object) var6), "CC1");
          BufferedSocket.field_h = null;
          AgeValidator.field_p = null;
          return new nf(param0);
        }
        return new nf(param0);
    }

    sk(long param0, int param1, byte[] param2) {
        try {
          this.field_l = param0;
          this.field_j = param1;
          this.field_h = param2;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "sk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Terraformed system";
    }
}
