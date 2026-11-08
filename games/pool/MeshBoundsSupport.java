/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshBoundsSupport {
    static MeshBuilder field_b;
    static MessageDialog field_d;
    static Sprite[] field_a;
    static UiComponent field_e;
    static UiComponent field_c;
    static UiComponent field_f;

    public static void releaseStatics(byte param0) {
        int var1 = -51 / ((param0 + 42) / 53);
        field_f = null;
        field_b = null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static void computeMeshBounds(MeshBuilder param0, int param1) {
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] var8 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        MeshBuilder var16 = null;
        var15 = Pool.field_O;
        try {
          param0.clearCaches();
          var2_int = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          if (param1 != -23109) {
            var16 = (MeshBuilder) null;
            MeshBoundsSupport.computeMeshBounds((MeshBuilder) null, -11);
          }
          var6 = -32768;
          var7 = -32768;
          var8 = new int[][]{param0.faceVertexA, param0.faceVertexB, param0.faceVertexC};
          for (var9 = 0; var9 < param0.faceCount; var9++) {
            if (param0.field_Q == null ||
              param0.field_Q[var9] != 2) {
              for (var10 = 0; 3 > var10; var10++) {
                var11 = var8[var10][var9];
                var12 = param0.vertexX[var11];
                var13 = param0.vertexY[var11];
                if (var12 < var2_int) {
                  var2_int = var12;
                }
                if (var5 < var12) {
                  var5 = var12;
                }
                if (var6 < var13) {
                  var6 = var13;
                }
                var14 = param0.vertexZ[var11];
                if (var3 > var13) {
                  var3 = var13;
                }
                if (var7 < var14) {
                  var7 = var14;
                }
                if (var14 < var4) {
                  var4 = var14;
                }
              }
            }
          }
          param0.field_S = (short)var6;
          param0.field_D = (short)var2_int;
          param0.field_w = (short)var5;
          param0.field_y = (short)var3;
          param0.field_x = (short)var7;
          param0.field_V = (short)var4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("d.B(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void updateIgnoreListPanel(int param0, byte param1, boolean param2) {
        ScrollPane stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        boolean stackIn_3_2 = false;
        UiComponent stackIn_19_0 = null;
        String stackIn_20_1 = null;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        IntrusiveDeque var4 = null;
        Object var5_ref = null;
        int var5 = 0;
        SocialListEntry var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        PlayerContextMenu var16 = null;
        PlayerContextMenu var17 = null;
        try {
          stackIn_2_0 = InputIdleSupport.field_c.scrollPane;
          stackIn_2_1 = param2;
          stackIn_3_2 = (InputIdleSupport.field_c.scrollPane == WidgetStyleLayer.field_c);
          var3_int = ((ScrollPane) (Object) stackIn_2_0).updateContentLayout(stackIn_2_1, stackIn_3_2, 2, (byte) 115, ArchiveIndex.field_x + 2, param0 * (3 * ArchiveIndex.field_x + 6)) ? 1 : 0;
          var4 = InputIdleSupport.field_c.content.children;
          if (ChatInputSupport.field_a != 2 &&
            ChatInputSupport.field_a != 1) {
            InputIdleSupport.field_c.enabled = false;
            InputIdleSupport.field_c.scrollPane.viewport.text = UiComponentNode.loading;
            AudioService.a(InputIdleSupport.field_c.content, (byte) 109);
          } else {
            InputIdleSupport.field_c.enabled = true;
            InputIdleSupport.field_c.scrollPane.viewport.text = null;
            var5_ref = null;
            var6 = (SocialListEntry) (var4.last((byte) -127));
            while (var6 != null) {
              var7 = 0;
              if (var6.children == null) {
                var6.field_Pb = new UiComponent(0L, PacketBuffer.field_s);
                var6.addChild(-99, var6.field_Pb);
                var6.field_Ob = new UiComponent(0L, PacketBuffer.field_s);
                var6.addChild(-120, var6.field_Ob);
                var6.markDescendantsToInheritVisualState((byte) -127);
                var7 = 1;
              }
              var6.width = InputIdleSupport.field_c.content.width;
              var6.field_Pb.setBounds(0, 2147483647, 0, var6.width, ArchiveIndex.field_x);
              var8 = 0;
              if (var6.previousName != null &&
                !var6.previousName.equals("")) {
                var6.field_Ob.activeTextColor = 16737894;
                var6.field_Ob.sprite = IntegerRecordSubmission.field_o;
                var8 = 1;
                var6.field_Ob.setBounds(0, 2147483647, 0, IntegerRecordSubmission.field_o.field_w + 3, ArchiveIndex.field_x);
              }
              var9 = 0;
              var10 = var6.width;
              if (var8 != 0) {
                var9 = IntegerRecordSubmission.field_o.field_w + 3;
                var10 = var10 - var9;
              }
              stackIn_19_0 = var6.field_Pb;
              if (var10 <= 0) {
                stackIn_20_1 = var6.name;
              } else {
                stackIn_20_1 = BitmapFont.truncateText(var6.field_Pb.font, var6.name, var10);
              }
              stackIn_19_0.text = stackIn_20_1;
              stackIn_23_0 = (var6.field_Pb.text.equals(var6.name)) ? 0 : 1;
              var11 = stackIn_23_0;
              var6.field_Pb.setBounds(0, 2147483647, var9, var10, ArchiveIndex.field_x);
              if (var3_int == 0) {
                var6.remainingHeight = ArchiveIndex.field_x - var6.height;
              }
              if (var7 != 0) {
                InputIdleSupport.field_c.content.placeBelow((UiComponent) (var5_ref), 2, var6, -41);
              }
              if (var6.field_Ob != null &&
                var6.field_Ob.activeInside) {
                CacheEntry.field_B = var6.previousName;
              } else {
                if (var6.field_Pb.activeInside &&
                  var11 != 0) {
                  CacheEntry.field_B = var6.name;
                }
              }
              if (0 != var6.pressedButton) {
                LogoFinalFrameLoader.openPlayerContextMenu(var6.name, -1, 0L, -1, InputIdleSupport.field_c.scrollPane, var6.actionName, 32540, var6, (int[]) null);
                var16 = PlasmaBallSkin.field_m;
                var13_ref_String = LookupRetrySupport.muLobbyNameRm;
                var16.field_n.addAction(var13_ref_String, 17130, 7);
                var17 = PlasmaBallSkin.field_m;
                var13 = DialogLayer.field_W;
                var14 = UsernameAvailabilityValidator.field_o;
                var17.field_n.layoutAtAnchor(0, 0, var13, 0, var14);
              }
              var5_ref = var6;
              var6 = (SocialListEntry) (var4.previous((byte) -5));
            }
            if (0 != InputIdleSupport.field_c.leftFooter.pressedButton) {
              PasswordInputPainter.field_C = new NameEntryPopup(InputIdleSupport.field_c.leftFooter.screenX, InputIdleSupport.field_c.leftFooter.screenY, InputIdleSupport.field_c.leftFooter.width, InputIdleSupport.field_c.leftFooter.height, SpaceObject.enterignoreAdd, ProgressDialog.field_qb, AlignedIconLabel.field_Lb, AlignedIconLabel.field_Lb);
              MatchingTextValidator.field_m = 2;
            }
            if (InputIdleSupport.field_c.rightFooter.pressedButton != 0) {
              PasswordInputPainter.field_C = new NameEntryPopup(InputIdleSupport.field_c.rightFooter.screenX, InputIdleSupport.field_c.rightFooter.screenY, InputIdleSupport.field_c.rightFooter.width, InputIdleSupport.field_c.rightFooter.height, BirthDatePromptPanel.enterignoreDel, ProgressDialog.field_qb, AlignedIconLabel.field_Lb, AlignedIconLabel.field_Lb);
              MatchingTextValidator.field_m = 3;
            }
          }
          var5 = 46 / ((-55 - param1) / 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "d.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void readLobbyGameDetails(LobbyGame game, int obfuscationGuard, PacketBuffer buffer, boolean includePlayerCount) {
        int var9 = 0;
        LobbyGame stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        LobbyGame stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        LobbyGame stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        LobbyGame stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        LobbyGame stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        LobbyGame stackIn_22_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        var10 = Pool.field_O;
        try {
          if (includePlayerCount) {
            game.field_mc = buffer.readUnsignedByte(-67);
          }
          game.field_Nb = buffer.readUnsignedByte(-70);
          game.field_ac = buffer.readUnsignedByte(-124);
          var4_int = buffer.readUnsignedByte(-124);
          var5 = 36 / ((63 - obfuscationGuard) / 46);
          stackIn_6_0 = (LobbyGame) (game);
          stackIn_7_1 = ((128 & var4_int) != 0);
          stackIn_6_0.field_Qb = stackIn_7_1;
          stackIn_10_0 = (LobbyGame) (game);
          stackIn_11_1 = (game.field_Qb) && (game.field_mc < game.field_Nb);
          stackIn_10_0.field_ic = stackIn_11_1;
          stackIn_13_0 = (LobbyGame) (game);
          stackIn_14_1 = ((32 & var4_int) != 0);
          stackIn_13_0.field_wc = stackIn_14_1;
          stackIn_16_0 = (LobbyGame) (game);
          stackIn_17_1 = ((8 & var4_int) != 0);
          stackIn_16_0.field_Dc = stackIn_17_1;
          stackIn_19_0 = (LobbyGame) (game);
          stackIn_20_1 = ((var4_int & 64) != 0);
          stackIn_19_0.field_ec = stackIn_20_1;
          stackIn_22_0 = (LobbyGame) (game);
          if ((var4_int & 16) == 0) {
            stackIn_23_1 = 1;
          } else {
            stackIn_23_1 = 2;
          }
          stackIn_22_0.field_Yb = stackIn_23_1;
          stackIn_26_0 = (0 == (4 & var4_int)) ? 0 : 1;
          var6 = stackIn_26_0;
          buffer.a(0, (byte) -127, game.settings, game.settings.length);
          stackIn_29_0 = ((var4_int & 2) == 0) ? 0 : 1;
          var7 = stackIn_29_0;
          game.field_pc = buffer.readUnsignedShort(-1034);
          game.field_sc = MonotonicClock.monotonicTimeMillis((byte) -95) - (long)buffer.readInt(true);
          if (var6 != 0) {
            game.field_qc = buffer.readInt(true);
          } else {
            game.field_qc = -1;
          }
          game.field_Zb = buffer.readLong(-412303328);
          var8 = buffer.position;
          game.field_Ob = buffer.j(-57);
          if (var7 != 0) {
            buffer.position = var8;
            game.playerNames = new String[game.field_mc];
            for (var9 = 0; game.field_mc > var9; var9++) {
              game.playerNames[var9] = buffer.j(-72);
            }
            return;
          }
          game.playerNames = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_40_0 = var4;
          stackIn_40_1 = new StringBuilder().append("d.D(");
          if (game == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(obfuscationGuard).append(',');
          if (buffer == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(includePlayerCount).append(')').toString());
        }
    }

    static {
    }
}
