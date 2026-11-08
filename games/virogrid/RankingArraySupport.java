/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RankingArraySupport {
    static String field_c;
    static String field_a;
    static IntrusiveDeque field_b;

    final static void ensureRankingArrays(byte param0, int param1, int param2) {
        if (WidgetNode.field_r == null ||
          !(WidgetNode.field_r.length >= param2)) {
          WidgetNode.field_r = new int[2 * param2];
        }
        if (null == ByteStorage.field_c ||
          !(param2 <= ByteStorage.field_c.length)) {
          ByteStorage.field_c = new int[2 * param2];
        }
        if (null == LoadingProgressDialog.field_jb ||
          !(LoadingProgressDialog.field_jb.length >= param2)) {
          LoadingProgressDialog.field_jb = new int[param2 * 2];
        }
        if (TextButton.field_A == null ||
          !(param2 <= TextButton.field_A.length)) {
          TextButton.field_A = new int[param2 * 2];
        }
        if (DualLinkHashTable.field_j == null ||
          !(param2 <= DualLinkHashTable.field_j.length)) {
          DualLinkHashTable.field_j = new int[2 * param2];
        }
        if (TextureCache.field_i == null ||
          !(param2 <= TextureCache.field_i.length)) {
          TextureCache.field_i = new int[2 * param2];
        }
        if (param0 <= 116) {
          field_c = (String) null;
        }
        if (null == LobbyPlayerEntry.field_Tb ||
          !(LobbyPlayerEntry.field_Tb.length >= param1 + param2)) {
          LobbyPlayerEntry.field_Tb = new int[2 * (param2 + param1)];
        }
        if (null == SoundCache.field_b ||
          !(param2 <= SoundCache.field_b.length)) {
          SoundCache.field_b = new boolean[param2 * 2];
        }
        PlayerContextMenu.field_c = -2147483648;
        PendingRequest.field_m = 0;
        PendingRequest.field_k = 2147483647;
        RasterEffectHelpers.field_e = 2147483647;
        DiskArchiveRequest.field_F = -2147483648;
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 > -47) {
          field_a = (String) null;
        }
        field_b = null;
    }

    final static QuickChatOpenHelpers[] readMeshMaterials(CipherPacketBuffer param0, int param1) {
        int var5 = 0;
        Object stackIn_3_0 = null;
        QuickChatOpenHelpers[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        QuickChatOpenHelpers[] var4 = null;
        QuickChatOpenHelpers var6 = null;
        int var6_int = 0;
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param0.readBits((byte) -78, 8);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (QuickChatOpenHelpers[]) (stackIn_3_0);
          }
          var3 = param0.readBits((byte) -78, 12);
          var4 = new QuickChatOpenHelpers[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (UrlRewriteHelpers.readBooleanBit(param1 - 8, param0)) {
              var6 = new QuickChatOpenHelpers();
              param0.readBits((byte) -78, 24);
              param0.readBits((byte) -78, 24);
              var6.field_b = param0.readBits((byte) -78, 24);
              param0.readBits((byte) -78, 9);
              param0.readBits((byte) -78, 12);
              param0.readBits((byte) -78, 12);
              param0.readBits((byte) -78, 12);
              var4[var5] = var6;
            } else {
              var6_int = param0.readBits((byte) -78, MusicPatch.bitLength(-1 + var5, 4));
              var4[var5] = var4[var6_int];
            }
          }
          if (param1 != 9) {
            RankingArraySupport.releaseStatics((byte) 38);
          }
          stackIn_13_0 = var4;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("fj.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Lobby";
        field_b = new IntrusiveDeque();
    }
}
