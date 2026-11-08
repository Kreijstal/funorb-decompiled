/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteArrayPool {
    static DiskCacheWorker field_a;
    static int field_c;
    static long[] field_b;

    final synchronized static byte[] acquireByteArray(boolean param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param1 == 100 &&
          IconTextComponent.field_Hb > 0) {
          fieldTemp$3 = IconTextComponent.field_Hb - 1;
          IconTextComponent.field_Hb = IconTextComponent.field_Hb - 1;
          var2_ref_byte__ = GameEntryHelpers.field_b[fieldTemp$3];
          GameEntryHelpers.field_b[IconTextComponent.field_Hb] = null;
          return var2_ref_byte__;
        }
        if (param1 == 5000 &&
          ProxyAuthenticationRequiredException.field_i > 0) {
          fieldTemp$4 = ProxyAuthenticationRequiredException.field_i - 1;
          ProxyAuthenticationRequiredException.field_i = ProxyAuthenticationRequiredException.field_i - 1;
          var2_ref_byte__Lifetime1 = LoadingProgressHelpers.field_b[fieldTemp$4];
          LoadingProgressHelpers.field_b[ProxyAuthenticationRequiredException.field_i] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (30000 == param1 &&
          PopupMenuHelpers.field_b > 0) {
          fieldTemp$5 = PopupMenuHelpers.field_b - 1;
          PopupMenuHelpers.field_b = PopupMenuHelpers.field_b - 1;
          var2_ref_byte__Lifetime2 = DelayedPacket.field_k[fieldTemp$5];
          DelayedPacket.field_k[PopupMenuHelpers.field_b] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (param0) {
          field_c = 50;
        }
        if (IterableNodeHashTable.field_c != null) {
          for (var2 = 0; var2 < PasswordFieldPainter.field_E.length; var2++) {
            if (param1 == PasswordFieldPainter.field_E[var2] &&
              BufferedFile.field_s[var2] > 0) {
              dupTemp$6 = BufferedFile.field_s[var2] - 1;
              arrayValue$7 = IterableNodeHashTable.field_c[var2];
              BufferedFile.field_s[var2] = dupTemp$6;
              var3 = arrayValue$7[dupTemp$6];
              IterableNodeHashTable.field_c[var2][BufferedFile.field_s[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param1];
    }

    final static void updateLobbyAndFlushRequests(boolean param0, byte param1) {
        int var2;
        int stackIn_6_0 = 0;
        int stackIn_9_0;
        int stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        boolean stackIn_9_5;
        boolean stackIn_9_6;
        int stackIn_9_7;
        boolean stackIn_11_8 = false;
        boolean stackIn_14_9 = false;
        CredentialHelpers.tickLobbyHighlights(false);
        if (AudioSetupHelpers.field_d != null) {
          stackIn_6_0 = (GameOptionHelpers.isTwoPlayers((byte) 82, AudioSetupHelpers.field_d.field_ic)) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        stackIn_9_0 = 0;
        stackIn_9_1 = 13;
        stackIn_9_2 = -83;
        stackIn_9_3 = 15;
        stackIn_9_4 = BoundedUrlRequest.field_b;
        stackIn_9_5 = param0;
        stackIn_9_6 = true;
        stackIn_9_7 = var2;
        stackIn_11_8 = (DecodedSpriteHelpers.field_a) || (LoginRsaKey.field_d);
        stackIn_14_9 = (50 >= DirectByteStorage.field_l) ? false : true;
        PlayerContextMenu.updateLobbyFrameIntFlags(stackIn_9_0, stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7 != 0, stackIn_11_8, stackIn_14_9, 11, 14);
        if (param1 >= -101) {
          ByteArrayPool.updateLobbyAndFlushRequests(true, (byte) 117);
        }
        if (IndexedSpriteState.field_c) {
          IterableNodeHashTable.field_g.writeCipheredOpcode(57, 8);
          IndexedSpriteState.field_c = false;
        }
        if (AccountCreationSupport.field_c) {
          IterableNodeHashTable.field_g.writeCipheredOpcode(10, 8);
          AccountCreationSupport.field_c = false;
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != -101) {
          ByteArrayPool.updateLobbyAndFlushRequests(true, (byte) -43);
        }
    }

    static {
        field_b = new long[1000];
    }
}
