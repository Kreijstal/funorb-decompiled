/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ListEntryMenuHelpers extends IntrusiveNode {
    int field_l;
    static SceneWidget field_h;
    int field_i;
    static String field_g;
    static int field_k;
    static BitmapFont field_j;

    final static void openSubscribePage(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              if (param1 >= -56) {
                return;
              }
              param0.getAppletContext().showDocument(UrlHelpers.appendSessionParameters(param0, var2, -31843), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("ko.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void openListEntryMenu(int param0, SceneWidget param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ResourceArchive var8 = null;
        PlayerActionMenu var10 = null;
        Sprite var11 = null;
        String var12 = null;
        PlayerActionMenu var13 = null;
        Sprite var14 = null;
        String var15 = null;
        PlayerActionMenu var16 = null;
        Sprite var17 = null;
        String var18 = null;
        PlayerActionMenu var19 = null;
        Sprite var20 = null;
        String var21 = null;
        PlayerActionMenu var22 = null;
        Sprite var23 = null;
        String var24 = null;
        PlayerActionMenu var25 = null;
        Sprite var26 = null;
        String var27 = null;
        PlayerActionMenu var28 = null;
        Sprite var29 = null;
        String var30 = null;
        PlayerActionMenu var31 = null;
        Sprite var32 = null;
        String var33 = null;
        PlayerActionMenu var34 = null;
        Sprite var35 = null;
        String var36 = null;
        PlayerActionMenu var37 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Sprite var20Lifetime1;
        Sprite var20Lifetime2;
        Sprite var20Lifetime3;
        Sprite var20Lifetime4;
        Sprite var20Lifetime5;
        Sprite var20Lifetime6;
        try {
          ArcanistsMulti.openInfoPanel(-26335, (int[]) null, (SceneScrollPane) null, (String) null, 0L, param0, -1, (String) null, param1);
          if (param0 == 0) {
            var10 = PackedShortHelpers.field_c;
            var11 = ArchiveProvider.field_a[0];
            var20 = var11;
            var20Lifetime2 = var11;
            var12 = ReflectionCheckRequest.field_q;
            var10.field_l.addIconAction((byte) -32, 11, var11, var12);
            var13 = PackedShortHelpers.field_c;
            var14 = ArchiveProvider.field_a[1];
            var20Lifetime3 = var14;
            var20Lifetime4 = var14;
            var15 = AccountCreationHelpers.field_c;
            var13.field_l.addIconAction((byte) -32, 12, var14, var15);
            var16 = PackedShortHelpers.field_c;
            var17 = ArchiveProvider.field_a[2];
            var20Lifetime5 = var17;
            var20Lifetime6 = var17;
            var18 = ChatLine.field_j;
            var16.field_l.addIconAction((byte) -32, 13, var17, var18);
          }
          if (1 == param0) {
            var19 = PackedShortHelpers.field_c;
            var20Lifetime1 = ArchiveProvider.field_a[0];
            var21 = IsaacCipher.field_f;
            var19.field_l.addIconAction((byte) -32, 11, var20Lifetime1, var21);
            var22 = PackedShortHelpers.field_c;
            var23 = ArchiveProvider.field_a[1];
            var24 = PlayerInfoPanel.field_Hb;
            var22.field_l.addIconAction((byte) -32, 12, var23, var24);
            var25 = PackedShortHelpers.field_c;
            var26 = ArchiveProvider.field_a[2];
            var27 = AlphaContainer.field_J;
            var25.field_l.addIconAction((byte) -32, 13, var26, var27);
          }
          if (param0 == 2) {
            var28 = PackedShortHelpers.field_c;
            var29 = ArchiveProvider.field_a[0];
            var30 = ChatInputWidget.field_Jb;
            var28.field_l.addIconAction((byte) -32, 11, var29, var30);
            var31 = PackedShortHelpers.field_c;
            var32 = ArchiveProvider.field_a[1];
            var33 = Js5Transport.field_l;
            var31.field_l.addIconAction((byte) -32, 12, var32, var33);
            var34 = PackedShortHelpers.field_c;
            var35 = ArchiveProvider.field_a[2];
            var36 = CameraFollowTarget.field_c;
            var34.field_l.addIconAction((byte) -32, 13, var35, var36);
          }
          var37 = PackedShortHelpers.field_c;
          var4 = param1.field_V;
          var5 = param1.field_nb;
          var6 = param1.field_x;
          var7 = param1.field_I;
          var37.field_l.openAt(var6, var7, -29466, var5, var4);
          if (param2 > -51) {
            var8 = (ResourceArchive) null;
            ListEntryMenuHelpers.loadIndexedSprites(99, (byte) -116, 31, (ResourceArchive) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ko.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_j = null;
        field_h = null;
        field_g = null;
        if (param0 == 32) {
          return;
        }
        field_j = (BitmapFont) null;
    }

    final static IndexedSprite[] loadIndexedSprites(int param0, byte param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        IndexedSprite[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 94) {
            stackIn_2_0 = (IndexedSprite[]) null;
            return stackIn_2_0;
          }
          if (SpriteDecodeHelpers.decodeSpriteSheet(19, param3, param0, param2)) {
            return SoundEffectVoice.createDecodedIndexedSprites(0);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ko.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean drawChatInputLine(int param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        int var4;
        String var4_ref_String;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var57;
        String var58;
        String var59;
        String var60;
        String var61;
        String var62;
        Object var63;
        CharSequence var64;
        int var5Lifetime1;
        String var7Lifetime1;
        String var7Lifetime2;
        var63 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 >= -105) {
          return true;
        }
        var3 = 1;
        if (!NodeHashTable.field_j &&
          null == IntensityTableHelpers.field_d) {
          var3 = 0;
        }
        if (0 == NameCheckHelpers.field_c &&
          null != CapsuleBar.field_x) {
          var3 = 0;
        }
        if (NameCheckHelpers.field_c == 2 &&
          !PaddedContainer.isLoginNameValid(false)) {
          var3 = 0;
        }
        if (84 == IntrusiveDeque.field_d) {
          if (var3 == 0) {
            if (0 == NameCheckHelpers.field_c) {
              return true;
            }
            BattleStartHelpers.clearChatInput(10);
            return true;
          }
          if (ViewControllerHelpers.field_e.length() <= 0) {
            BattleStartHelpers.clearChatInput(10);
          } else {
            var4_ref_String = ViewControllerHelpers.field_e.toString();
            var7 = var4_ref_String;
            var7Lifetime2 = var4_ref_String;
            if (!ClientException.containsFilterWord(-1, var4_ref_String)) {
              var5 = NameCheckHelpers.field_c;
              if (0 == var5 &&
                DirectByteStorage.field_f != null) {
                var5 = 1;
              }
              if (ReflectionCheckRequest.getChatMode((byte) 117, var5) != 2) {
                BufferedRandomAccessFile.sendReport(-1, var4_ref_String, 82, param1, NameCheckHelpers.field_c, MenuInputState.field_p);
              } else {
                DiskCacheRequest.updateChatModeSetting(param2, 1, true, var5);
                BufferedRandomAccessFile.sendReport(-1, var4_ref_String, 82, param1, NameCheckHelpers.field_c, MenuInputState.field_p);
                BattleStartHelpers.clearChatInput(10);
              }
            } else {
              var13 = (String) null;
              var12 = (String) null;
              LobbyLayoutHelpers.addChatMessage(0, (byte) 83, IconButtonPainter.field_q, (String) null, 2, (String) null);
              var15 = (String) null;
              var14 = (String) null;
              LobbyLayoutHelpers.addChatMessage(0, (byte) 73, TextTableInitializer.field_b, (String) null, 2, (String) null);
              BattleStartHelpers.clearChatInput(10);
            }
          }
          return true;
        }
        if (IntrusiveDeque.field_d == 85) {
          if (var3 == 0) {
            return true;
          }
          if (ViewControllerHelpers.field_e.length() <= 0) {
            return true;
          }
          TimeAndInputHelpers.padToLength(ViewControllerHelpers.field_e.length() - 1, ViewControllerHelpers.field_e, ' ', false);
          return true;
        }
        var4 = MainMenuDialog.field_Bb;
        if (!ByteStorage.isPrintableCharacter(-256, (char) var4)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (ViewControllerHelpers.field_e.length() >= 80) {
          return true;
        }
        discarded$0 = ViewControllerHelpers.field_e.append((char) var4);
        var5Lifetime1 = 485;
        var17 = AccountFlowHelpers.field_b;
        var16 = MusicPatch.prefixRankIcon(var17, -2);
        var19 = var16;
        if (2 != NameCheckHelpers.field_c) {
          var7Lifetime1 = "";
          if (0 != NameCheckHelpers.field_c) {
            var57 = var7Lifetime1 + var19 + ": ";
            var5Lifetime1 = var5Lifetime1 - QuickChatCategory.field_x.textWidth(var57);
            if (QuickChatCategory.field_x.textWidth(ViewControllerHelpers.field_e.toString()) <= var5Lifetime1) {
              return true;
            }
            TimeAndInputHelpers.padToLength(-1 + ViewControllerHelpers.field_e.length(), ViewControllerHelpers.field_e, ' ', false);
            return true;
          }
          if (DirectByteStorage.field_f == null &&
            Cp1252Helpers.field_c) {
            var7Lifetime1 = "[" + NanoFrameClock.field_p + "] ";
          }
          if (null != DirectByteStorage.field_f) {
            if (!CalendarHelpers.field_a) {
              var60 = "[" + CachedArchiveProvider.formatTemplate(-68, new String[]{DirectByteStorage.field_f.field_ic}, Bzip2State.field_j) + "] ";
              var61 = var60 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - QuickChatCategory.field_x.textWidth(var61);
              if (QuickChatCategory.field_x.textWidth(ViewControllerHelpers.field_e.toString()) <= var5Lifetime1) {
                return true;
              }
              TimeAndInputHelpers.padToLength(-1 + ViewControllerHelpers.field_e.length(), ViewControllerHelpers.field_e, ' ', false);
              return true;
            }
            if (StatusMessageHelpers.field_d == null) {
              var58 = "[" + CachedArchiveProvider.formatTemplate(-68, new String[]{DirectByteStorage.field_f.field_ic}, Bzip2State.field_j) + "] ";
              var59 = var58 + var19 + ": ";
              var5Lifetime1 = var5Lifetime1 - QuickChatCategory.field_x.textWidth(var59);
              if (QuickChatCategory.field_x.textWidth(ViewControllerHelpers.field_e.toString()) <= var5Lifetime1) {
                return true;
              }
              TimeAndInputHelpers.padToLength(-1 + ViewControllerHelpers.field_e.length(), ViewControllerHelpers.field_e, ' ', false);
              return true;
            }
            var7Lifetime1 = "[" + StatusMessageHelpers.field_d + "] ";
          }
          var62 = var7Lifetime1 + var19 + ": ";
          var5Lifetime1 = var5Lifetime1 - QuickChatCategory.field_x.textWidth(var62);
        } else {
          var64 = (CharSequence) ((Object) MenuInputState.field_p);
          var18 = CachedArchiveProvider.formatTemplate(-45, new String[]{NameHelpers.normalizeName((byte) 84, var64)}, BattleAction.field_n);
          var8 = CachedArchiveProvider.formatTemplate(113, new String[]{var16}, IterableNodeHashTable.field_f);
          var9 = QuickChatCategory.field_x.textWidth(var18);
          var10 = QuickChatCategory.field_x.textWidth(var8);
          if (var10 >= var9) {
            var5Lifetime1 = var5Lifetime1 - var10;
          } else {
            var5Lifetime1 = var5Lifetime1 - var9;
          }
        }
        if (QuickChatCategory.field_x.textWidth(ViewControllerHelpers.field_e.toString()) <= var5Lifetime1) {
          return true;
        }
        TimeAndInputHelpers.padToLength(-1 + ViewControllerHelpers.field_e.length(), ViewControllerHelpers.field_e, ' ', false);
        return true;
    }

    final static int[] orArrays(int[] param0, int[] param1, boolean param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        IndexedSprite var6 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3 = new int[8];
          var4 = 0;
          if (!param2) {
            var6 = (IndexedSprite) null;
            ListEntryMenuHelpers.circleHitsMask((Battle) null, -45, 124, 15, (IndexedSprite) null, 88);
          }
          while (var4 < 8) {
            var3[var4] = BitAndSpriteHelpers.bitOr(param0[var4], param1[var4]);
            var4++;
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ko.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean hasDisallowedCharacter(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!ClipState.isTextureCharacter((char) var3, (byte) -122) &&
              !LoginPanel.isDigit(30, (char) var3)) {
              return true;
            }
          }
          var3Lifetime1 = 117 % ((-63 - param0) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ko.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private ListEntryMenuHelpers() throws Throwable {
        throw new Error();
    }

    final static boolean circleHitsMask(Battle param0, int param1, int param2, int param3, IndexedSprite param4, int param5) {
        Sprite var6 = null;
        RuntimeException var6_ref = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new Sprite(param3 * 2, 2 * param3);
          var6.makeRasterTarget();
          SoftwareRasterizer.fillCircle(param3, param3, param3, param5);
          stackIn_1_0 = SoundEffectVoice.spriteHitsMask(param0, -(param3 * 2) + param1, param4, param2 - param3, (byte) -1, var6);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("ko.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_g = "This password contains repeated characters, and would be easy to guess";
        field_k = 71;
    }
}
