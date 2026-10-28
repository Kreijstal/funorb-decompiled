/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static tf field_c;
    static String[] field_d;
    static AchievementsScreen field_b;
    static String field_a;

    final static void a(byte param0) {
        if (!SpriteState.guestSession) {
          throw new IllegalStateException();
        }
        CipherPacketBuffer.field_u = true;
        if (param0 == -112) {
          SeekerMine.a((byte) -123, false);
          QuickChatPhraseCache.field_e = 0;
          return;
        }
        field_d = (String[]) null;
        SeekerMine.a((byte) -123, false);
        QuickChatPhraseCache.field_e = 0;
    }

    final static boolean c(byte param0) {
        ByteStorage.field_a = true;
        ContactEntry.field_mb = td.b(128) + 15000L;
        if (param0 < -19) {
          return 11 == QuickChatPhraseCache.field_e ? true : false;
        }
        return false;
    }

    final static IndexedSprite b(byte param0) {
        int var2 = 85 % ((param0 + 46) / 39);
        IndexedSprite var1 = new IndexedSprite(on.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, gn.spriteOffsetXs[0], ChatMessage.spriteOffsetYs[0], SpriteLoadTask.spriteWidths[0], SavedDataQuerySupport.spriteHeights[0], AnimatedPathMarker.spriteIndices[0], ArchiveLoadTask.spritePalette);
        SpriteDecodeSupport.releaseSpriteSheet(false);
        return var1;
    }

    public static void releaseStatics(int guard) {
        field_b = null;
        if (guard != 0) {
          return;
        }
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static boolean a(CipherPacketBuffer param0, byte param1) {
        String stackIn_9_2 = null;
        try {
          if (param1 > -96) {
            field_b = (AchievementsScreen) null;
          }
          boolean stackIn_5_0 = (param0.readBits(1, 8) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var2;
          StringBuilder stackIn_8_1 = new StringBuilder().append("da.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = new String[]{"redsandstone", "venus", "moon", "alien", "virtual", "tutorial"};
        field_a = "Achievements";
    }
}
