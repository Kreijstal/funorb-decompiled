/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static String field_k;
    static Model field_g;
    static String[] field_h;
    static QuickChatCommandType field_i;
    static String field_f;
    private java.nio.ByteBuffer field_d;
    static String[] field_l;
    static int field_e;
    static String field_j;

    final static void computeCaretPositions(String param0, TextLayoutLine param1, BitmapFont param2, boolean param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        try {
          if (param3) {
            field_l = (String[]) null;
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; var7 < param0.length(); var7++) {
            var8 = param0.charAt(var7);
            if (var8 == 60) {
              var6 = param1.field_j[0] + (var5_int >> 8) + param2.textWidth(param0.substring(0, var7));
            }
            if (-1 == var6) {
              if (var8 == 32) {
                var5_int = var5_int + param4;
              }
              param1.field_j[var7] = param1.field_j[0] + ((var5_int >> 8) + param2.textWidth(param0.substring(0, 1 + var7))) - param2.measureCharacterAdvance((char) var8);
            } else {
              param1.field_j[var7] = var6;
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("la.I(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final byte[] toByteArray(int param0) {
        byte[] var4 = new byte[this.field_d.capacity()];
        byte[] var2 = var4;
        this.field_d.position(0);
        this.field_d.get(var4);
        int var3 = -92 % ((29 - param0) / 63);
        return var4;
    }

    final static String decodeNameFromLong(long param0, boolean param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = TetraLink.field_J;
        if (!param1) {
          String var12 = (String) null;
          DirectByteStorage.startEmailValidation((String) null, -122);
        }
        if (param0 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param0) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        int var3 = 0;
        long var4 = param0;
        while (var4 != 0L) {
          var3++;
          var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param0 != 0L) {
          var7 = param0;
          param0 = param0 / 37L;
          var9 = NameAlphabetTable.field_a[(int)(var7 - param0 * 37L)];
          if (var9 == 95) {
            var10 = -1 + var6.length();
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            var9 = 160;
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final void setBytes(int param0, byte[] param1) {
        try {
          if (param0 != -10543) {
            field_f = (String) null;
          }
          this.field_d = java.nio.ByteBuffer.allocateDirect(param1.length);
          this.field_d.position(0);
          this.field_d.put(param1);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static FlaggedTextValue startEmailValidation(String param0, int param1) {
        RuntimeException var2 = null;
        FlaggedTextValue stackIn_5_0 = null;
        FlaggedTextValue stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (HighscoreQuery.field_y.hasChanged(false) &&
            !param0.equals(HighscoreQuery.field_y.getText((byte) 72))) {
            HighscoreQuery.field_y = OpacityWidget.createEmailCheckResult(param0, 14781);
          }
          if (param1 == 0) {
            stackIn_7_0 = HighscoreQuery.field_y;
            return stackIn_7_0;
          }
          stackIn_5_0 = (FlaggedTextValue) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("la.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 37) {
          DirectByteStorage.releaseStatics(98);
        }
        field_k = null;
        field_j = null;
        field_l = null;
        field_h = null;
        field_i = null;
        field_g = null;
        field_f = null;
    }

    DirectByteStorage() {
    }

    final static void initializeCaptionTables(int param0) {
        if (MenuLabelGlobals.field_c != null) {
          return;
        }
        PendingReplyNode.field_p = new String[11];
        PendingReplyNode.field_p[7] = MiscTextGlobals.field_d;
        PendingReplyNode.field_p[3] = BevelFrameSpriteFactory.field_c;
        PendingReplyNode.field_p[2] = PacketBuffer.field_o;
        PendingReplyNode.field_p[0] = AudioPumpThread.field_b;
        PendingReplyNode.field_p[9] = AccountTextGlobals.field_e;
        PendingReplyNode.field_p[8] = NetworkGameClient.field_x;
        MenuLabelGlobals.field_c = new String[24];
        PendingReplyNode.field_p[6] = ValidatedTextWidget.field_db;
        PendingReplyNode.field_p[4] = BevelFrameSpriteFactory.field_c;
        PendingReplyNode.field_p[1] = BevelFrameSpriteFactory.field_c;
        MenuLabelGlobals.field_c[18] = ScreenDrawHelpers.field_a;
        MenuLabelGlobals.field_c[5] = MiscTextGlobals.field_d;
        MenuLabelGlobals.field_c[6] = GrowableIntList.field_g;
        MenuLabelGlobals.field_c[15] = IntrusiveDequeCursor.field_c;
        MenuLabelGlobals.field_c[7] = AudioPumpThread.field_b;
        MenuLabelGlobals.field_c[23] = SoundEffectLibrary.field_a;
        MenuLabelGlobals.field_c[0] = AlternateLongAndTextCredentials.field_q;
        MenuLabelGlobals.field_c[8] = PasswordFieldPainter.field_A;
        MenuLabelGlobals.field_c[16] = WeightedLruCache.field_f;
        if (param0 >= -106) {
          DirectByteStorage.decodeNameFromLong(126L, false);
        }
        MenuLabelGlobals.field_c[2] = MusicPatchEnvelope.field_l;
        MenuLabelGlobals.field_c[11] = MenuScreen.field_a;
        MenuLabelGlobals.field_c[19] = CachedArchiveSource.field_h;
        MenuLabelGlobals.field_c[9] = IntroFinalFrameHelpers.field_a;
        MenuLabelGlobals.field_c[4] = ValidatedTextWidget.field_db;
        MenuLabelGlobals.field_c[10] = field_f;
        MenuLabelGlobals.field_c[14] = SingleChildWidget.field_M;
        MenuLabelGlobals.field_c[1] = RasterSnapshot.field_n;
        MenuLabelGlobals.field_c[17] = SpriteState.field_z;
        MenuLabelGlobals.field_c[3] = NetworkGameClient.field_x;
        MenuLabelGlobals.field_c[13] = MusicPatch.field_E;
        MenuLabelGlobals.field_c[12] = LoginDialog.field_ob;
        MenuLabelGlobals.field_c[21] = LongAndTextCredentials.field_g[1];
        MenuLabelGlobals.field_c[20] = LongAndTextCredentials.field_g[0];
        MenuLabelGlobals.field_c[22] = UiComponent.field_ub;
    }

    static {
        field_h = new String[]{"All scores", "My scores", "Best each"};
        field_k = "Loading models";
        field_f = "Offer draw";
        field_l = new String[]{"Turn time", "Rated game?", "Allow spectators?"};
        field_i = new QuickChatCommandType(9, 0, 4, 1);
        field_j = "Respect";
    }
}
