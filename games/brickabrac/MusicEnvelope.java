/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicEnvelope {
    static String field_l;
    int vibratoRate;
    int field_h;
    byte[] releaseEnvelope;
    int vibratoDelay;
    int decayRate;
    int field_b;
    int vibratoDepth;
    static tq field_f;
    byte[] volumeEnvelope;
    static String field_i;
    int field_k;

    final static SoftwareFramebuffer createFramebuffer(java.awt.Component component, int width, int obfuscationGuard, int height) {
        try {
          Class implementationClass = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          SoftwareFramebuffer framebuffer = null;
          ProducerFramebuffer fallback = null;
          java.awt.Component var6 = null;
          SoftwareFramebuffer stackIn_3_0 = null;
          ProducerFramebuffer stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (obfuscationGuard != -2414) {
              var6 = (java.awt.Component) null;
              MusicEnvelope.createFramebuffer((java.awt.Component) null, 85, -118, 37);
            }
            try {
              implementationClass = Class.forName("BufferedImageFramebuffer");
              framebuffer = (SoftwareFramebuffer) (implementationClass.newInstance());
              framebuffer.initialize(component, height, true, width);
              stackIn_3_0 = framebuffer;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              fallback = new ProducerFramebuffer();
              ((SoftwareFramebuffer) ((Object) fallback)).initialize(component, height, true, width);
              stackIn_5_0 = fallback;
              return (SoftwareFramebuffer) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("jm.A(");
            if (component == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(width).append(',').append(obfuscationGuard).append(',').append(height).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        ScrollPane stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int stackIn_3_4;
        boolean stackIn_3_5;
        boolean stackIn_4_6 = false;
        UiComponent stackIn_20_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        NodeDeque var4 = null;
        Object var5 = null;
        SocialListEntry var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ContextActionController var16 = null;
        ContextActionController var17 = null;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          stackIn_3_0 = f.field_c.scrollPane;
          stackIn_3_1 = 2;
          stackIn_3_2 = param2 * (np.uiRowHeight * 3 + 6);
          stackIn_3_3 = np.uiRowHeight + 2;
          stackIn_3_4 = 22676;
          stackIn_3_5 = param0;
          stackIn_4_6 = (o.field_b == f.field_c.scrollPane);
          var3_int = ((ScrollPane) (Object) stackIn_3_0).updateContentLayout(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5, stackIn_4_6) ? 1 : 0;
          var4 = f.field_c.content.children;
          if (!param1) {
            return;
          }
          if (LevelMetadata.field_m != 2 &&
            LevelMetadata.field_m != 1) {
            f.field_c.enabled = false;
            f.field_c.scrollPane.viewport.text = AlternateNumericLoginCredentials.field_t;
            jh.a(param1, f.field_c.content);
            return;
          }
          f.field_c.enabled = true;
          f.field_c.scrollPane.viewport.text = null;
          var5 = null;
          var6 = (SocialListEntry) (var4.first(-57));
          while (var6 != null) {
            var7 = 0;
            if (null == var6.children) {
              var6.nameLabel = new UiComponent(0L, TextFieldWidget.field_K);
              var6.addChild(var6.nameLabel, 0);
              var6.renameIndicator = new UiComponent(0L, TextFieldWidget.field_K);
              var6.addChild(var6.renameIndicator, 0);
              var6.markDescendantsToInheritVisualState(param1);
              var7 = 1;
            }
            var6.width = f.field_c.content.width;
            var6.nameLabel.setBounds(np.uiRowHeight, 0, 0, var6.width, (byte) 64);
            var8 = 0;
            if (null != var6.previousName &&
              !var6.previousName.equals("")) {
              var6.renameIndicator.sprite = ok.field_g;
              var6.renameIndicator.activeTextColor = 16737894;
              var8 = 1;
              var6.renameIndicator.setBounds(np.uiRowHeight, 0, 0, ok.field_g.canvasWidth + 3, (byte) 64);
            }
            var9 = 0;
            var10 = var6.width;
            if (var8 != 0) {
              var9 = ok.field_g.canvasWidth + 3;
              var10 = var10 - var9;
            }
            stackIn_20_0 = var6.nameLabel;
            if (0 < var10) {
              stackIn_21_1 = TextFont.truncateText(var6.nameLabel.font, var6.name, var10);
            } else {
              stackIn_21_1 = var6.name;
            }
            stackIn_20_0.text = stackIn_21_1;
            stackIn_24_0 = (var6.nameLabel.text.equals(var6.name)) ? 0 : 1;
            var11 = stackIn_24_0;
            var6.nameLabel.setBounds(np.uiRowHeight, 0, var9, var10, (byte) 64);
            if (var3_int == 0) {
              var6.remainingHeight = np.uiRowHeight - var6.height;
            }
            if (var7 != 0) {
              f.field_c.content.placeBelow((UiComponent) (var5), 2, var6, 17290);
            }
            if (null != var6.renameIndicator &&
              var6.renameIndicator.activeInside) {
              WidgetTextLayout.field_e = var6.previousName;
            } else {
              if (var6.nameLabel.activeInside &&
                var11 != 0) {
                WidgetTextLayout.field_e = var6.name;
              }
            }
            if (var6.pressedButton != 0) {
              SpriteGeometry.a(-1, var6, f.field_c.scrollPane, (int[]) null, var6.actionName, -1, (byte) -58, 0L, var6.name);
              var16 = bm.contextActions;
              var13_ref_String = ng.field_e;
              var16.contextMenu.addAction(var13_ref_String, 7, (byte) 126);
              var17 = bm.contextActions;
              var13 = LoadingProgressDialog.pressX;
              var14 = PlayerNameChooserPanel.pressY;
              var17.contextMenu.layoutAtAnchor(var14, -126, 0, 0, var13);
            }
            var5 = var6;
            var6 = (SocialListEntry) (var4.next((byte) 116));
          }
          if (f.field_c.leftFooter.pressedButton != 0) {
            MusicCrossfadeStream.nameEntryPopup = new NameEntryPopup(f.field_c.leftFooter.screenX, f.field_c.leftFooter.screenY, f.field_c.leftFooter.width, f.field_c.leftFooter.height, CacheIoWorker.field_e, GameUiController.field_c, CappedUrlRequest.field_l, CappedUrlRequest.field_l);
            GameUiController.field_d = 2;
          }
          if (0 == f.field_c.rightFooter.pressedButton) {
            return;
          }
          MusicCrossfadeStream.nameEntryPopup = new NameEntryPopup(f.field_c.rightFooter.screenX, f.field_c.rightFooter.screenY, f.field_c.rightFooter.width, f.field_c.rightFooter.height, MultiplayerExitScreen.field_A, GameUiController.field_c, CappedUrlRequest.field_l, CappedUrlRequest.field_l);
          GameUiController.field_d = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var3), "jm.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static AlphaFont a(byte[] param0, byte param1) {
        AlphaFont var2 = null;
        RuntimeException var2_ref = null;
        AlphaFont stackIn_5_0 = null;
        AlphaFont stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param1 >= -7) {
            stackIn_5_0 = (AlphaFont) null;
            return stackIn_5_0;
          }
          var2 = new AlphaFont(param0, ArrayWidgetGroup.decodedSpriteOffsetX, SocketConnector.decodedSpriteOffsetY, jh.decodedSpriteWidths, TextHotspotRegion.decodedSpriteHeights, qp.decodedSpritePalette, cn.decodedSpriteIndices);
          MotionWaypoint.clearDecodedSpriteData((byte) 96);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("jm.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(boolean param0, char param1) {
        if (!param0) {
          field_l = (String) null;
        }
        return String.valueOf(param1);
    }

    final static void handleCommonDataResponse(byte obfuscationGuard) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int requestId = 0;
        int var4 = 0;
        IntArrayRequest var4_ref_pe = null;
        LevelResultSubmission levelResult = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        BitPacketBuffer var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var10 = jl.incomingPackets;
          if (obfuscationGuard != 22) {
            field_l = (String) null;
          }
          var2 = var10.readUnsignedByte(255);
          requestId = var10.readUnsignedByte(obfuscationGuard + 233);
          if (var2 == 0) {
            var4_ref_pe = (IntArrayRequest) (PasswordFieldRenderer.pendingIntArrayRequests.first(-37));
            if (var4_ref_pe == null) {
              hn.a((byte) 57);
              return;
            }
            var5_int = ga.incomingPacketLength - var10.position;
            var12 = var4_ref_pe.values;
            var11 = var12;
            var6 = var11;
            if (var12.length << 2 < var5_int) {
              var5_int = var12.length << 2;
            }
            for (var7 = 0; var5_int > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.readUnsignedByte(255) << (IntrusiveHashIterator.a(3, var7) << 8));
            }
            var4_ref_pe.complete = true;
            var4_ref_pe.unlink((byte) 111);
            return;
          }
          if (var2 == 1) {
            var4 = var10.readSignedSmart(-1342);
            levelResult = (LevelResultSubmission) (NinjaBackground.pendingLevelResults.first(-19));
            while (levelResult != null) {
              if (requestId != levelResult.packId ||
                var4 != levelResult.levelIndex) {
                levelResult = (LevelResultSubmission) (NinjaBackground.pendingLevelResults.next((byte) 116));
                continue;
              }
              break;
            }
            if (levelResult != null) {
              levelResult.unlink((byte) 111);
              return;
            }
            hn.a((byte) 110);
            return;
          }
          AlignedIconLabel.a("LR1: " + WhirlpoolHasher.c((byte) -96), (Throwable) null, 53);
          hn.a((byte) 52);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "jm.D(" + obfuscationGuard + ')');
        }
    }

    public static void b(byte param0) {
        field_f = null;
        field_i = null;
        field_l = null;
        if (param0 != 31) {
          field_l = (String) null;
        }
    }

    static {
        field_l = "The following settings need to be changed:  ";
        field_f = new tq();
        field_i = "Please enter your date of birth to enable chat:";
    }
}
