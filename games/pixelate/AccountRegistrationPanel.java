/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends UiContainer implements TextHotspotListener, ButtonListener, NameSuggestionListener {
    private ValidatedTextWidget field_U;
    private ValidatedTextWidget field_Q;
    private TextHotspotWidget field_M;
    private ValidatedTextWidget field_X;
    private TextButton field_K;
    private ValidatedTextWidget field_V;
    private ValidatedTextWidget field_P;
    static IntrusiveDeque field_Y;
    private Checkbox field_T;
    static int field_S;
    private TextButton field_R;
    static String[] field_J;
    NameSuggestionsPanel field_W;
    static int field_O;
    private ValidatedTextWidget field_L;

    public final void onMoreSuggestionsRequested(byte param0) {
        ((NameAvailabilityValidator) (this.field_U.getValidationSource(1))).clearCheckedName(-112);
        if (param0 <= 12) {
          this.field_X = (ValidatedTextWidget) null;
        }
    }

    private final String getLinkCloseTag(int param0) {
        if (param0 != 0) {
          field_S = -31;
        }
        return "</col></u>";
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        try {
          super.updatePointer(param0 ^ 0, param1, param2, param3);
          if (param0 != 40) {
            this.field_V = (ValidatedTextWidget) null;
          }
          this.field_R.field_H = this.areAllFieldsReady(true);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "pl.L(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.field_U = new ValidatedTextWidget("", (UiListener) null, 12);
        this.field_P = new ValidatedTextWidget("", (UiListener) null, 100);
        this.field_L = new ValidatedTextWidget("", (UiListener) null, 100);
        this.field_V = new ValidatedTextWidget("", (UiListener) null, 20);
        this.field_X = new ValidatedTextWidget("", (UiListener) null, 20);
        this.field_Q = new ValidatedTextWidget("", (UiListener) null, 3);
        int var1 = 1;
        this.field_T = new Checkbox("", (UiListener) null, var1 != 0);
        this.field_R = new TextButton(hm.field_d, (UiListener) null);
        this.field_K = new TextButton(MatchController.field_v, (UiListener) null);
        this.field_U.field_l = StatusBar.field_i;
        this.field_P.field_l = LabeledField.field_N;
        this.field_L.field_l = jf.field_b;
        this.field_V.field_l = QuickChatMenu.field_Eb;
        this.field_X.field_l = Puzzle.field_f;
        this.field_Q.field_l = IntrusiveDeque.field_d;
        this.field_T.field_l = mc.field_o;
        this.field_U.setValidationSource((byte) 101, new NameAvailabilityValidator(this.field_U));
        this.field_P.setValidationSource((byte) 118, new EmailValidator(this.field_P));
        this.field_L.setValidationSource((byte) 56, new EmailConfirmationValidator(this.field_L, this.field_P));
        this.field_V.setValidationSource((byte) 68, new PasswordValidator(this.field_V, this.field_U, this.field_P));
        this.field_X.setValidationSource((byte) 29, new MatchingTextValidator(this.field_X, this.field_V));
        this.field_Q.setValidationSource((byte) 97, new AgeValidator(this.field_Q));
        this.field_R.field_H = false;
        this.field_R.field_y = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.field_K.field_y = (WidgetPainter) ((Object) new LinkButtonPainter());
        this.field_U.field_y = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
        GradientOutlineTextPainter dupTemp$0 = new GradientOutlineTextPainter(10000536);
        this.field_L.field_y = (WidgetPainter) ((Object) dupTemp$0);
        this.field_P.field_y = (WidgetPainter) ((Object) dupTemp$0);
        this.field_Q.field_y = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
        this.field_T.field_y = (WidgetPainter) ((Object) new SpriteCheckboxPainter());
        PasswordFieldPainter dupTemp$1 = new PasswordFieldPainter(10000536);
        this.field_X.field_y = (WidgetPainter) ((Object) dupTemp$1);
        this.field_V.field_y = (WidgetPainter) ((Object) dupTemp$1);
        String var2 = AlphaContainer.formatTemplate(DelegatingCanvas.field_f, 27, new String[]{this.getLinkOpenTag(3), this.getLinkCloseTag(0)});
        int var3 = 20;
        var3 = var3 + this.addLabeledField(DialWidget.field_S, -21, this.field_P, 170, var3);
        var3 = var3 + (5 + this.addFieldWithHelp(mp.field_d, this.field_L, 20, 170, var3, 126, ""));
        var3 = var3 + this.addLabeledField(AccountRequestDialog.field_qb, -86, this.field_V, 170, var3);
        var3 = var3 + (5 + this.addFieldWithHelp(PictureStrip.field_i, var3, this.field_X, 35, 170, r.field_b));
        var3 = var3 + (this.addFieldWithHelp(na.field_a, var3, this.field_U, 35, 170, BufferedSocket.field_i) + 5);
        var3 = var3 + this.addLabeledFieldWithValidationIcon((byte) 85, 170, this.field_Q, var3, TriangleMesh.field_O);
        LabeledField var4 = new LabeledField(46, var3, this.field_E - 90, 25, this.field_T, true, this.field_E - 120, 5, ep.field_b, 11579568, CanvasRasterBuffer.field_j);
        this.addChild(var4, 80);
        var3 = var3 + var4.field_C;
        TextWidgetPainter var5 = new TextWidgetPainter(he.field_d, 0, 0, 0, 0, 16777215, -1, 0, 0, he.field_d.maxAscent, -1, 2147483647, true);
        this.field_M = new TextHotspotWidget(var2, var5);
        this.field_M.field_l = "";
        this.field_M.setHotspotTooltip(IntrusiveNode.field_g, 0, 0);
        this.field_M.setHotspotTooltip(IntrusiveNode.field_g, 0, 1);
        this.field_M.field_n = (UiListener) (this);
        this.field_M.setBoundsToPreferredWidth(46, -90 + this.field_E, var3, -93);
        var3 = var3 + (15 + this.field_M.field_C);
        this.addChild(this.field_M, 80);
        int var6 = 4;
        int var7 = 200;
        this.field_R.setBounds(var7, (byte) 68, var3, -var7 + 496 >> 1, 40);
        this.field_K.setBounds(60, (byte) 23, var3 + 15, var6 + 3, 40);
        this.field_K.field_n = (UiListener) (this);
        this.field_R.field_n = (UiListener) (this);
        this.addChild(this.field_R, 80);
        this.addChild(this.field_K, 80);
        this.field_W = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_W.setBounds(-this.field_U.field_E - this.field_U.field_z + (this.field_E - 60), (byte) 100, 20 + this.field_U.field_p, 60 + this.field_U.field_z + this.field_U.field_E, 150);
        this.addChild(this.field_W, 80);
        this.setBounds(496, (byte) 28, 0, 0, var3 + 55 + var6);
    }

    private final int addLabeledField(String param0, int param1, UiComponent param2, int param3, int param4) {
        LabeledField var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledField(20, param4, param3 + 120, 25, param2, false, 120, 3, he.field_d, 16777215, param0);
          this.addChild(var6, 80);
          if (param1 <= -6) {
            stackIn_4_0 = var6.field_C;
            return stackIn_4_0;
          }
          stackIn_2_0 = -103;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("pl.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int addLabeledFieldWithValidationIcon(byte param0, int param1, UiComponent param2, int param3, String param4) {
        RuntimeException var6 = null;
        ValidationIndicator var7 = null;
        int var8 = 0;
        LabeledField var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new LabeledField(20, param3, 120 + param1, 25, param2, false, 120, 3, he.field_d, 16777215, param4);
          this.addChild(var9, 80);
          var7 = new ValidationIndicator(((ValidationProvider) ((Object) param2)).getValidationSource(1));
          this.addChild(var7, 80);
          var7.setBounds(15, (byte) 73, (var9.field_C - 15 >> 1) + var9.field_p, var9.field_E + (var9.field_z + 3), 15);
          var8 = -32 / ((param0 + 2) / 54);
          stackIn_1_0 = var9.field_C;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("pl.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void handleSocialListPacket(boolean param0) {
        int stackIn_46_0 = 0;
        LobbyPlayer stackIn_51_0 = null;
        String stackIn_51_1 = null;
        String stackIn_51_2 = null;
        boolean stackIn_52_3;
        LobbyPlayer stackIn_55_0 = null;
        boolean stackIn_56_1 = false;
        CipherPacketBuffer stackIn_100_0 = null;
        boolean stackIn_101_1 = false;
        SecondaryNodeHashTable stackIn_105_0 = null;
        boolean stackIn_106_1 = false;
        LobbyPlayer stackIn_109_0 = null;
        boolean stackIn_110_1 = false;
        CipherPacketBuffer stackIn_113_0 = null;
        boolean stackIn_114_1 = false;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3 = 0L;
        int var3_int = 0;
        LobbyPlayer var3_ref_uj = null;
        LobbyGame var4 = null;
        int var4_int = 0;
        int var5 = 0;
        LobbyGame var6 = null;
        LobbyPlayer var7 = null;
        int var8 = 0;
        LobbyPlayer var8_ref_uj = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        LobbyGame var13 = null;
        LobbyPlayer var14 = null;
        Object var16 = null;
        Object var17 = null;
        LobbyGame var17_ref = null;
        Object var18 = null;
        Object var19 = null;
        LobbyGame var19_ref = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        LobbyPlayer var23 = null;
        String var24 = null;
        String var25 = null;
        LobbyPlayer var26 = null;
        LobbyPlayer var27 = null;
        LobbyGame var28 = null;
        Object var29 = null;
        LobbyPlayer var30 = null;
        LobbyPlayer var31 = null;
        LobbyGame var32 = null;
        LobbyGame var33 = null;
        LobbyPlayer var3_ref_ujLifetime1;
        long var3Lifetime1;
        long var3Lifetime2;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var3_intLifetime4;
        int var3_intLifetime5;
        int var3_intLifetime6;
        long var3Lifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var16 = null;
        var17 = null;
        var19 = null;
        var18 = null;
        var29 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          var1 = MusicCrossfadeStream.field_o;
          if (!param0) {
            AccountRegistrationPanel.isLocalPlayerGameHost(96);
          }
          var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
          if (var2 != 0 &&
            var2 != 1 &&
            2 != var2 &&
            3 != var2 &&
            var2 != 4) {
            if (var2 == 5) {
              var3 = ((PacketBuffer) ((Object) var1)).readLong(false);
              var21 = ((PacketBuffer) ((Object) var1)).readString(5);
              var20 = ((PacketBuffer) ((Object) var1)).readString(5);
              var22 = ((PacketBuffer) ((Object) var1)).readString(5);
              var8_ref_uj = ScrollContainer.findLobbyPlayer(2, var3);
              stackIn_46_0 = (var20.equals("")) ? 0 : 1;
              var9 = stackIn_46_0;
              if (var8_ref_uj != null) {
                if (var9 != 0) {
                  stackIn_51_0 = var8_ref_uj;
                  stackIn_51_1 = var22;
                  stackIn_51_2 = var21;
                  stackIn_52_3 = !(param0);
                  ((LobbyPlayer) (Object) stackIn_51_0).updateNames(stackIn_51_1, stackIn_51_2, stackIn_52_3);
                }
              } else {
                var8_ref_uj = new LobbyPlayer(var21, var22, var3);
                QuickChatCategoryCache.field_d.put(false, var8_ref_uj, var3);
              }
              var8_ref_uj.field_Pb = hm.monotonicMillis(64) - (long)((PacketBuffer) ((Object) var1)).readInt(0);
              var8_ref_uj.field_Rb = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 105);
              var10 = ((PacketBuffer) ((Object) var1)).readVarInt(127);
              var8_ref_uj.field_Yb = var10 >> 1;
              stackIn_55_0 = var8_ref_uj;
              stackIn_56_1 = ((var10 & 1) != 0);
              stackIn_55_0.field_Xb = stackIn_56_1;
              var8_ref_uj.field_Qb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
              var8_ref_uj.field_Ib = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
              QuickChatCategoryCache.insertLobbyPlayerSorted(-28, var8_ref_uj);
              return;
            }
            if (6 == var2) {
              var3Lifetime1 = ((PacketBuffer) ((Object) var1)).readLong(false);
              var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
              var30 = ScrollContainer.findLobbyPlayer(2, var3Lifetime1);
              if (var30 == null) {
                return;
              }
              if (var30.field_Jb) {
                ResizableModalPanel.field_X = ResizableModalPanel.field_X - 1;
                var30.field_Jb = false;
              }
              if (var5 != 0) {
                var30.field_Tb = mh.field_b;
                var30.field_Eb = var5;
              } else {
                var30.unlink(2779);
              }
              var30.unlinkSecondary(17);
              return;
            }
            if (var2 == 7) {
              var31 = (LobbyPlayer) (ImageProducerRasterBuffer.field_n.first(1504642273));
              while (var31 != null) {
                var31.unlink(2779);
                var31.unlinkSecondary(17);
                var31 = (LobbyPlayer) (ImageProducerRasterBuffer.field_n.next(1504642273));
              }
              ResizableModalPanel.field_X = 0;
              return;
            }
            if (8 == var2) {
              var3_int = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -124);
              var4 = (LobbyGame) (dg.field_f.get(-11434, (long)var3_int));
              if (var4 == null) {
                var4 = new LobbyGame(fj.field_b);
                dg.field_f.put(false, var4, (long)var3_int);
              }
              TextLayout.readLobbyGameStatus(true, var4, (byte) 120, var1);
              StatefulTextPainter.insertLobbyGameSorted((byte) -48, var4);
              return;
            }
            if (var2 == 9) {
              var3_intLifetime4 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 124);
              var4_int = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
              var33 = (LobbyGame) (dg.field_f.get(-11434, (long)var3_intLifetime4));
              if (var33 == null) {
                return;
              }
              if (0 != var4_int) {
                var33.field_Rb = mh.field_b;
                var33.field_Qb = var4_int;
              } else {
                var33.unlink(2779);
              }
              var33.unlinkSecondary(17);
              return;
            }
            if (10 == var2) {
              var32 = (LobbyGame) (nk.field_a.first(1504642273));
              while (var32 != null) {
                var32.unlink(2779);
                var32.unlinkSecondary(17);
                var32 = (LobbyGame) (nk.field_a.next(1504642273));
              }
              return;
            }
            if (11 != var2 &&
              12 != var2) {
              if (var2 == 13) {
                var3_intLifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 107);
                var4_intLifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                var17_ref = (LobbyGame) (dg.field_f.get(-11434, (long)var3_intLifetime5));
                if (var17_ref == null) {
                  return;
                }
                var17_ref.field_Ob = false;
                var13 = var17_ref;
                var6 = var13;
                if (var4_intLifetime1 != 0) {
                  var17_ref.field_Rb = mh.field_b;
                  var17_ref.field_Qb = var4_intLifetime1;
                }
                var13.field_cc = false;
                StatefulTextPainter.insertLobbyGameSorted((byte) -48, var17_ref);
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 != 18) {
                    if (19 == var2) {
                      var3Lifetime2 = ((PacketBuffer) ((Object) var1)).readLong(false);
                      var5Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                      var23 = JaggrabDownloader.findGamePlayer(var3Lifetime2, 14428);
                      if (var23 == null) {
                        return;
                      }
                      if (var5Lifetime1 != 0) {
                        var23.field_Eb = var5Lifetime1;
                        var23.field_Tb = mh.field_b;
                      } else {
                        var23.unlink(2779);
                      }
                      var23.unlinkSecondary(17);
                      LoginMethod.field_c.field_mc = LoginMethod.field_c.field_mc - 1;
                      return;
                    }
                    if (20 == var2) {
                      TextLayout.readLobbyGameStatus(false, LoginMethod.field_c, (byte) 120, var1);
                      return;
                    }
                    if (var2 == 21) {
                      var3_intLifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -120);
                      if (var3_intLifetime5 == 0) {
                        bo.field_e = 0L;
                        return;
                      }
                      bo.field_e = (long)var3_intLifetime5 + hm.monotonicMillis(64);
                      return;
                    }
                    if (var2 == 22) {
                      gi.field_a = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 63);
                      ui.field_e = ((PacketBuffer) ((Object) var1)).readVarInt(127);
                      return;
                    }
                    if (var2 == 23) {
                      DebouncedValidator.field_f = ((PacketBuffer) ((Object) var1)).readLong(false);
                      return;
                    }
                    CheckboxPainter.reportClientError(1, "L1: " + Cloud.describePacketHistory(-74), (Throwable) null);
                    na.closeGameSocket(true);
                    return;
                  }
                  stackIn_100_0 = var1;
                  stackIn_101_1 = !(param0);
                  var3Lifetime2 = ((PacketBuffer) (Object) stackIn_100_0).readLong(stackIn_101_1);
                  var24 = ((PacketBuffer) ((Object) var1)).readString(5);
                  var25 = ((PacketBuffer) ((Object) var1)).readString(5);
                  var7 = JaggrabDownloader.findGamePlayer(var3Lifetime2, 14428);
                  if (var7 == null) {
                    var7 = new LobbyPlayer(var24, var25, var3Lifetime2);
                    stackIn_105_0 = SocketConnector.field_f;
                    stackIn_106_1 = !(param0);
                    ((SecondaryNodeHashTable) (Object) stackIn_105_0).put(stackIn_106_1, var7, var3Lifetime2);
                    LoginMethod.field_c.field_mc = LoginMethod.field_c.field_mc + 1;
                  }
                  var7.field_Rb = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 25);
                  var8 = ((PacketBuffer) ((Object) var1)).readVarInt(127);
                  stackIn_109_0 = var7;
                  stackIn_110_1 = (0 != (1 & var8));
                  stackIn_109_0.field_Xb = stackIn_110_1;
                  var7.field_Yb = var8 >> 1;
                  var7.field_Qb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                  var7.field_Ib = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                  ClientContextMenu.field_a.addLast(22125, var7);
                  return;
                }
                stackIn_113_0 = var1;
                stackIn_114_1 = !(param0);
                var3Lifetime2 = ((PacketBuffer) (Object) stackIn_113_0).readLong(stackIn_114_1);
                var5Lifetime1Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                var14 = ScrollContainer.findLobbyPlayer(2, var3Lifetime2);
                var26 = var14;
                if (var14 != null) {
                  if (15 != var2) {
                    if (var26.field_Jb) {
                      ResizableModalPanel.field_X = ResizableModalPanel.field_X - 1;
                      var26.field_Jb = false;
                    }
                  } else {
                    var14.field_Vb = false;
                  }
                  if (var5Lifetime1Lifetime1 != 0) {
                    var26.field_Tb = mh.field_b;
                    var26.field_Eb = var5Lifetime1Lifetime1;
                  }
                  QuickChatCategoryCache.insertLobbyPlayerSorted(-124, var26);
                }
                return;
              }
              var3Lifetime2Lifetime1 = ((PacketBuffer) ((Object) var1)).readLong(false);
              var27 = ScrollContainer.findLobbyPlayer(2, var3Lifetime2Lifetime1);
              if (var27 != null) {
                if (var2 == 14) {
                  var27.field_Vb = true;
                } else {
                  if (!var27.field_Jb) {
                    ResizableModalPanel.field_X = ResizableModalPanel.field_X + 1;
                    var27.field_Jb = true;
                  }
                }
                QuickChatCategoryCache.insertLobbyPlayerSorted(-97, var27);
              }
              return;
            }
            var3_intLifetime6 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) -124);
            var19_ref = (LobbyGame) (dg.field_f.get(-11434, (long)var3_intLifetime6));
            var28 = var19_ref;
            if (var28 == null) {
              return;
            }
            if (var2 != 11) {
              var28.field_Ob = true;
            } else {
              var28.field_cc = true;
            }
            StatefulTextPainter.insertLobbyGameSorted((byte) -48, var28);
            return;
          }
          var3_ref_uj = (LobbyPlayer) (ClientContextMenu.field_a.first(1504642273));
          while (var3_ref_uj != null) {
            var3_ref_uj.unlink(2779);
            var3_ref_uj.unlinkSecondary(17);
            var3_ref_uj = (LobbyPlayer) (ClientContextMenu.field_a.next(1504642273));
          }
          var3_ref_ujLifetime1 = (LobbyPlayer) (QuickChatCategoryCache.field_d.first(-110));
          while (var3_ref_ujLifetime1 != null) {
            if (var3_ref_ujLifetime1.field_Vb ||
              var3_ref_ujLifetime1.field_Jb) {
              if (var3_ref_ujLifetime1.field_Jb) {
                ResizableModalPanel.field_X = ResizableModalPanel.field_X - 1;
                var3_ref_ujLifetime1.field_Jb = false;
              }
              var3_ref_ujLifetime1.field_Vb = false;
              QuickChatCategoryCache.insertLobbyPlayerSorted(-117, var3_ref_ujLifetime1);
            }
            var3_ref_ujLifetime1 = (LobbyPlayer) (QuickChatCategoryCache.field_d.next((byte) 50));
          }
          if (var2 == 1 &&
            null != LoginMethod.field_c) {
            wo.field_b = LoginMethod.field_c.field_pc;
          }
          if (var2 == 4) {
            var3_intLifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedShort((byte) 49);
            LoginMethod.field_c = new LobbyGame(fj.field_b);
            LoginMethod.field_c.setSecondaryKey((long)var3_intLifetime1, 29574);
            TextLayout.readLobbyGameStatus(false, LoginMethod.field_c, (byte) 120, var1);
            bo.field_e = 0L;
          } else {
            LoginMethod.field_c = null;
          }
          if (var2 != 2 &&
            var2 != 3) {
            DraggableWidget.field_S = null;
          } else {
            if (DraggableWidget.field_S == null) {
              DraggableWidget.field_S = new LobbyGame(fj.field_b);
            }
          }
          if (var2 != 3) {
            TriangleMesh.field_r = false;
            return;
          }
          TriangleMesh.field_r = true;
          for (var3_intLifetime2 = 0; var3_intLifetime2 < TextButton.field_J.length; var3_intLifetime2++) {
            TextButton.field_J[var3_intLifetime2] = ((PacketBuffer) ((Object) var1)).readByte(0);
          }
          ib.field_a = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
          TextFieldValidator.field_i = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
          for (var3_intLifetime3 = 0; NanoTickClock.field_k.length > var3_intLifetime3; var3_intLifetime3++) {
            NanoTickClock.field_k[var3_intLifetime3] = ((PacketBuffer) ((Object) var1)).readByte(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1_ref), "pl.O(" + param0 + ')');
        }
    }

    public final void onHotspotAction(int param0, int param1, int param2, TextHotspotWidget param3) {
        int discarded$1 = 0;
        int var6 = 0;
        UiComponent var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != 0) {
            if (param0 != 1) {
              if (param0 == 2) {
                SpriteCheckboxPainter.requestOpenLinkNotice("conduct.ws", -120);
              }
            } else {
              SpriteCheckboxPainter.requestOpenLinkNotice("privacy.ws", -27);
            }
          } else {
            SpriteCheckboxPainter.requestOpenLinkNotice("terms.ws", -14);
          }
          if (param2 != -8894) {
            var7 = (UiComponent) null;
            discarded$1 = this.addLabeledField((String) null, 66, (UiComponent) null, -19, -43);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void onAction(TextButton param0, int param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param2 != 11) {
            this.field_K = (TextButton) null;
          }
          if (this.field_K != param0) {
            if (param0 == this.field_R) {
              discarded$1 = this.submitRegistration(10152);
            }
          } else {
            ScoreMarkerDemo.showAccountChoicePanel(24496);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("pl.Q(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean isFieldReady(ValidationProvider param0, boolean param1) {
        ValidationSource var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.getValidationSource(1);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getState((byte) 112);
          if (sk.field_a == var4) {
            return false;
          }
          if (var4 == BufferedRandomAccessFile.field_b) {
            return false;
          }
          if (var4 == HighscoresScreen.field_o) {
            return false;
          }
          if (!param1) {
            return true;
          }
          AccountRegistrationPanel.isLocalPlayerGameHost(-52);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("pl.I(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void onSuggestionChosen(String param0, byte param1) {
        ValidatedTextWidget var3 = null;
        String var5 = null;
        try {
          int var4 = 117 % ((34 - param1) / 59);
          var3 = this.field_U;
          var5 = param0;
          ((EditableTextWidget) ((Object) var3)).setText(false, (byte) 87, var5);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "pl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int addFieldWithHelp(String param0, UiComponent param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException var8 = null;
        ValidationHelpWidget var9 = null;
        LabeledField var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new LabeledField(20, param4, 120 + param3, 25, param1, false, 120, 3, he.field_d, 16777215, param0);
          this.addChild(var10, 80);
          var9 = new ValidationHelpWidget(((ValidationProvider) ((Object) param1)).getValidationSource(param5 - 125), param6, param5, var10.field_C + param4, 50 + param3, param2);
          var9.field_n = (UiListener) (this);
          this.addChild(var9, 80);
          stackIn_1_0 = var10.field_C + var9.field_C;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("pl.S(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final String getLinkOpenTag(int param0) {
        String discarded$0 = null;
        if (param0 != 3) {
          discarded$0 = this.getLinkOpenTag(-59);
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean onFocusedKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.onFocusedKey(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_5_0 = this.focusPreviousChild(param1 - 3, param2);
            return stackIn_5_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_8_0 = this.focusNextChild(10, param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pl.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean submitRegistration(int param0) {
        if (!this.areAllFieldsReady(true)) {
          return false;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_Q.field_q);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 != 10152) {
          UiComponent var4 = (UiComponent) null;
          this.updatePointer(-14, 96, -17, (UiComponent) null);
        }
        return oi.startRegistrationSubmission(this, var2, this.field_T.field_M, this.field_P.field_q, (byte) -98, this.field_V.field_q, this.field_U.field_q);
    }

    private final boolean areAllFieldsReady(boolean param0) {
        boolean discarded$1 = false;
        ValidationProvider var3;
        ValidatedTextWidget stackIn_4_1 = null;
        boolean stackIn_5_2 = false;
        ValidatedTextWidget stackIn_9_1 = null;
        boolean stackIn_10_2 = false;
        ValidatedTextWidget stackIn_13_1 = null;
        boolean stackIn_14_2 = false;
        ValidatedTextWidget stackIn_17_1 = null;
        boolean stackIn_18_2 = false;
        ValidatedTextWidget stackIn_21_1 = null;
        boolean stackIn_22_2 = false;
        if (!param0) {
          var3 = (ValidationProvider) null;
          discarded$1 = this.isFieldReady((ValidationProvider) null, false);
        }
        stackIn_4_1 = this.field_U;
        stackIn_5_2 = !(param0);
        if (this.isFieldReady(stackIn_4_1, stackIn_5_2) &&
          this.isFieldReady(this.field_P, false)) {
          stackIn_9_1 = this.field_L;
          stackIn_10_2 = !(param0);
          if (this.isFieldReady(stackIn_9_1, stackIn_10_2)) {
            stackIn_13_1 = this.field_V;
            stackIn_14_2 = !(param0);
            if (this.isFieldReady(stackIn_13_1, stackIn_14_2)) {
              stackIn_17_1 = this.field_X;
              stackIn_18_2 = !(param0);
              if (this.isFieldReady(stackIn_17_1, stackIn_18_2)) {
                stackIn_21_1 = this.field_Q;
                stackIn_22_2 = !(param0);
                if (this.isFieldReady(stackIn_21_1, stackIn_22_2)) {
                  return true;
                }
              }
            }
          }
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        field_J = null;
        if (param0 <= 63) {
          AccountRegistrationPanel.isLocalPlayerGameHost(-75);
        }
        field_Y = null;
    }

    final static boolean isLocalPlayerGameHost(int param0) {
        if (param0 != 99) {
          field_O = 123;
        }
        return DebouncedValidator.field_f == LoginMethod.field_c.field_kc ? true : false;
    }

    private final int addFieldWithHelp(String param0, int param1, UiComponent param2, int param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 35) {
            this.field_T = (Checkbox) null;
          }
          stackIn_3_0 = this.addFieldWithHelp(param5, param2, 35, param4, param1, 126, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("pl.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_Y = new IntrusiveDeque();
    }
}
