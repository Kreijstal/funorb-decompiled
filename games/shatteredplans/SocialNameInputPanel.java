/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialNameInputPanel extends AnimatedPanel {
    static TiledNineSlicePainter field_Cb;
    private AnimatedPanel field_yb;
    private AnimatedPanel field_zb;
    static String field_xb;
    static PcmStreamMixer field_Bb;
    private StringBuilder field_Db;
    private int field_Ab;

    final boolean handleNameKey(byte param0) {
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (0 != this.field_Ab) {
          return false;
        }
        if (TextReplacementEntry.field_j != 85) {
          if (this.field_Db.length() >= 12) {
            if (TextReplacementEntry.field_j == 84) {
              if (this.field_Db.length() > 0) {
                this.field_z = this.field_Db.toString();
                this.field_Ab = 2;
              } else {
                this.field_Ab = 1;
              }
            }
            if (param0 >= -93) {
              return false;
            }
            if (13 != TextReplacementEntry.field_j) {
              return true;
            }
            this.field_Ab = 1;
            return true;
          }
          var2 = Character.toLowerCase(QuickChatHelpSupport.field_h);
          if (var2 == 32) {
            var2 = 95;
          }
          if (var2 == 95 &&
            this.field_Db.length() > 0) {
            discarded$10 = this.field_Db.append((char) var2);
            if (AccountHandshakeSupport.isAsciiLetter(-103, (char) var2)) {
              discarded$11 = this.field_Db.append((char) var2);
            } else {
              if (TooltipSupport.isDigit((byte) 55, (char) var2)) {
                discarded$12 = this.field_Db.append((char) var2);
              }
            }
            if (TextReplacementEntry.field_j == 84) {
              if (this.field_Db.length() > 0) {
                this.field_z = this.field_Db.toString();
                this.field_Ab = 2;
              } else {
                this.field_Ab = 1;
              }
            }
            if (param0 >= -93) {
              return false;
            }
            if (13 == TextReplacementEntry.field_j) {
              this.field_Ab = 1;
            }
            return true;
          }
          if (AccountHandshakeSupport.isAsciiLetter(-103, (char) var2)) {
            discarded$13 = this.field_Db.append((char) var2);
            if (TextReplacementEntry.field_j == 84) {
              if (this.field_Db.length() > 0) {
                this.field_z = this.field_Db.toString();
                this.field_Ab = 2;
              } else {
                this.field_Ab = 1;
              }
            }
            if (param0 >= -93) {
              return false;
            }
            if (13 == TextReplacementEntry.field_j) {
              this.field_Ab = 1;
            }
            return true;
          }
          if (TooltipSupport.isDigit((byte) 55, (char) var2)) {
            discarded$14 = this.field_Db.append((char) var2);
            if (TextReplacementEntry.field_j == 84) {
              if (this.field_Db.length() > 0) {
                this.field_z = this.field_Db.toString();
                this.field_Ab = 2;
              } else {
                this.field_Ab = 1;
              }
            }
            if (param0 >= -93) {
              return false;
            }
            if (13 == TextReplacementEntry.field_j) {
              this.field_Ab = 1;
            }
            return true;
          }
          if (TextReplacementEntry.field_j == 84) {
            if (this.field_Db.length() <= 0) {
              this.field_Ab = 1;
            } else {
              this.field_z = this.field_Db.toString();
              this.field_Ab = 2;
            }
          }
          if (param0 >= -93) {
            return false;
          }
          if (13 == TextReplacementEntry.field_j) {
            this.field_Ab = 1;
          }
          return true;
        }
        if (this.field_Db.length() <= 0) {
          if (this.field_Db.length() >= 12) {
            if (TextReplacementEntry.field_j == 84) {
              if (this.field_Db.length() > 0) {
                this.field_z = this.field_Db.toString();
                this.field_Ab = 2;
              } else {
                this.field_Ab = 1;
              }
            }
          } else {
            var2Lifetime1 = Character.toLowerCase(QuickChatHelpSupport.field_h);
            if (var2Lifetime1 == 32) {
              var2Lifetime1 = 95;
            }
            if (var2Lifetime1 == 95 &&
              this.field_Db.length() > 0) {
              discarded$5 = this.field_Db.append((char) var2Lifetime1);
              if (AccountHandshakeSupport.isAsciiLetter(-103, (char) var2Lifetime1)) {
                discarded$6 = this.field_Db.append((char) var2Lifetime1);
              } else {
                if (TooltipSupport.isDigit((byte) 55, (char) var2Lifetime1)) {
                  discarded$7 = this.field_Db.append((char) var2Lifetime1);
                }
              }
              if (TextReplacementEntry.field_j == 84) {
                if (this.field_Db.length() > 0) {
                  this.field_z = this.field_Db.toString();
                  this.field_Ab = 2;
                } else {
                  this.field_Ab = 1;
                }
              }
              if (param0 >= -93) {
                return false;
              }
              if (13 == TextReplacementEntry.field_j) {
                this.field_Ab = 1;
              }
              return true;
            }
            if (AccountHandshakeSupport.isAsciiLetter(-103, (char) var2Lifetime1)) {
              discarded$8 = this.field_Db.append((char) var2Lifetime1);
              if (TextReplacementEntry.field_j == 84) {
                if (this.field_Db.length() > 0) {
                  this.field_z = this.field_Db.toString();
                  this.field_Ab = 2;
                } else {
                  this.field_Ab = 1;
                }
              }
              if (param0 >= -93) {
                return false;
              }
              if (13 == TextReplacementEntry.field_j) {
                this.field_Ab = 1;
              }
              return true;
            }
            if (TooltipSupport.isDigit((byte) 55, (char) var2Lifetime1)) {
              discarded$9 = this.field_Db.append((char) var2Lifetime1);
              if (TextReplacementEntry.field_j == 84) {
                if (this.field_Db.length() > 0) {
                  this.field_z = this.field_Db.toString();
                  this.field_Ab = 2;
                } else {
                  this.field_Ab = 1;
                }
              }
              if (param0 >= -93) {
                return false;
              }
              if (13 == TextReplacementEntry.field_j) {
                this.field_Ab = 1;
              }
              return true;
            }
            if (TextReplacementEntry.field_j == 84) {
              if (this.field_Db.length() <= 0) {
                this.field_Ab = 1;
              } else {
                this.field_z = this.field_Db.toString();
                this.field_Ab = 2;
              }
            }
          }
          if (param0 >= -93) {
            return false;
          }
          if (13 == TextReplacementEntry.field_j) {
            this.field_Ab = 1;
          }
          return true;
        }
        ClientContextMenuSupport.padWithChar(this.field_Db, this.field_Db.length() - 1, -121, ' ');
        if (this.field_Db.length() >= 12) {
          if (TextReplacementEntry.field_j == 84) {
            if (this.field_Db.length() > 0) {
              this.field_z = this.field_Db.toString();
              this.field_Ab = 2;
            } else {
              this.field_Ab = 1;
            }
          }
          if (param0 >= -93) {
            return false;
          }
          if (13 == TextReplacementEntry.field_j) {
            this.field_Ab = 1;
          }
          return true;
        }
        var2Lifetime2 = Character.toLowerCase(QuickChatHelpSupport.field_h);
        if (var2Lifetime2 == 32) {
          var2Lifetime2 = 95;
        }
        if (var2Lifetime2 == 95 &&
          this.field_Db.length() > 0) {
          discarded$0 = this.field_Db.append((char) var2Lifetime2);
          if (AccountHandshakeSupport.isAsciiLetter(-103, (char) var2Lifetime2)) {
            discarded$1 = this.field_Db.append((char) var2Lifetime2);
          } else {
            if (TooltipSupport.isDigit((byte) 55, (char) var2Lifetime2)) {
              discarded$2 = this.field_Db.append((char) var2Lifetime2);
            }
          }
          if (TextReplacementEntry.field_j == 84) {
            if (this.field_Db.length() <= 0) {
              this.field_Ab = 1;
            } else {
              this.field_z = this.field_Db.toString();
              this.field_Ab = 2;
            }
          }
          if (param0 >= -93) {
            return false;
          }
          if (13 == TextReplacementEntry.field_j) {
            this.field_Ab = 1;
          }
          return true;
        }
        if (AccountHandshakeSupport.isAsciiLetter(-103, (char) var2Lifetime2)) {
          discarded$3 = this.field_Db.append((char) var2Lifetime2);
          if (TextReplacementEntry.field_j == 84) {
            if (this.field_Db.length() <= 0) {
              this.field_Ab = 1;
            } else {
              this.field_z = this.field_Db.toString();
              this.field_Ab = 2;
            }
          }
          if (param0 >= -93) {
            return false;
          }
          if (13 == TextReplacementEntry.field_j) {
            this.field_Ab = 1;
          }
          return true;
        }
        if (!TooltipSupport.isDigit((byte) 55, (char) var2Lifetime2)) {
          if (TextReplacementEntry.field_j == 84) {
            if (this.field_Db.length() <= 0) {
              this.field_Ab = 1;
            } else {
              this.field_z = this.field_Db.toString();
              this.field_Ab = 2;
            }
          }
          if (param0 >= -93) {
            return false;
          }
          if (13 == TextReplacementEntry.field_j) {
            this.field_Ab = 1;
          }
          return true;
        }
        discarded$4 = this.field_Db.append((char) var2Lifetime2);
        if (TextReplacementEntry.field_j == 84) {
          if (this.field_Db.length() <= 0) {
            this.field_Ab = 1;
          } else {
            this.field_z = this.field_Db.toString();
            this.field_Ab = 2;
          }
        }
        if (param0 >= -93) {
          return false;
        }
        if (13 == TextReplacementEntry.field_j) {
          this.field_Ab = 1;
        }
        return true;
    }

    final static boolean isLocalPlayerName(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -105) {
            field_Cb = (TiledNineSlicePainter) null;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_3_0 = ArchiveIndex.field_d.equals(DateInputWidget.normalizeAccountName(var3, true));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jp.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    SocialNameInputPanel(int param0, int param1, int param2, int param3, String param4, AnimatedPanel param5, AnimatedPanel param6, AnimatedPanel param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_Ab = 0;
        try {
          this.field_yb = new AnimatedPanel(0L, param6, param4);
          this.addChild(4, this.field_yb);
          this.field_zb = new AnimatedPanel(0L, param7);
          this.field_zb.field_x = 16764006;
          this.addChild(4, this.field_zb);
          this.field_zb.field_u = "|";
          this.field_Db = new StringBuilder(12);
          var9_int = this.field_yb.measureWidthUnbounded(false);
          this.field_yb.setTarget(var9_int, UniformNineSliceFactory.field_c, (byte) 96, 3, 5);
          this.field_zb.setTarget(var9_int, UniformNineSliceFactory.field_c, (byte) 76, UniformNineSliceFactory.field_c + 3, 5);
          var10 = 5 + var9_int + 5;
          var11 = 3 + UniformNineSliceFactory.field_c * 2 + 3;
          var12 = ArchiveLoadProgress.positionPopupX(-57, param0, var10, param2);
          var13 = PopupPlacementSupport.positionPopupY(param3, 0, var11, param1);
          this.setTarget(var10, var11, (byte) 63, var13, var12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("jp.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int pollNameInput(byte param0, boolean param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        this.updatePointerState(param1, -20429);
        if (!param1) {
          if (param0 >= -42) {
            SocialNameInputPanel.closeQuickChatMenus((byte) -50);
          }
          this.field_zb.field_z = this.field_Db.toString();
          if (param1 &&
            LobbyCommandSupport.field_d != 0 &&
            0 == this.field_rb) {
            this.field_Ab = 1;
          }
          return this.field_Ab;
        }
        while (true) {
          if (!PasswordValidator.$cfr$intArgs$e$296a4c2b494e(55)) {
            if (param0 < -42) {
              this.field_zb.field_z = this.field_Db.toString();
              if (!param1) {
                return this.field_Ab;
              }
              if (LobbyCommandSupport.field_d == 0) {
                return this.field_Ab;
              }
              if (0 != this.field_rb) {
                return this.field_Ab;
              }
              this.field_Ab = 1;
              return this.field_Ab;
            }
            SocialNameInputPanel.closeQuickChatMenus((byte) -50);
            this.field_zb.field_z = this.field_Db.toString();
            if (!param1) {
              return this.field_Ab;
            }
            if (LobbyCommandSupport.field_d == 0) {
              return this.field_Ab;
            }
            if (0 != this.field_rb) {
              return this.field_Ab;
            }
            this.field_Ab = 1;
            return this.field_Ab;
          }
          if (85 == TextReplacementEntry.field_j &&
            0 < this.field_Db.length()) {
            ClientContextMenuSupport.padWithChar(this.field_Db, this.field_Db.length() - 1, 29, ' ');
          }
          if (TutorialMapGenerator.a(QuickChatHelpSupport.field_h, (CharSequence) ((Object) this.field_Db), (byte) 119)) {
            discarded$0 = this.field_Db.append(QuickChatHelpSupport.field_h);
          } else {
            if (this.field_Db.length() == 0 &&
              91 == QuickChatHelpSupport.field_h) {
              discarded$1 = this.field_Db.append(QuickChatHelpSupport.field_h);
            } else {
              if (this.field_Db.length() == 1 &&
                QuickChatHelpSupport.field_h == 35) {
                discarded$2 = this.field_Db.append(QuickChatHelpSupport.field_h);
              } else {
                if (QuickChatHelpSupport.field_h == 93) {
                  discarded$3 = this.field_Db.append(QuickChatHelpSupport.field_h);
                }
              }
            }
          }
          if (TextReplacementEntry.field_j != 84) {
            if (TextReplacementEntry.field_j == 13) {
              return 1;
            }
            continue;
          }
          break;
        }
        if (0 >= this.field_Db.length()) {
          return 1;
        }
        this.field_z = this.field_Db.toString();
        return 2;
    }

    final static void showLoadingProgress(String param0, float param1, byte param2, boolean param3) {
        try {
          if (MouseInputHandler.field_h == null) {
            MouseInputHandler.field_h = new ProgressDialog(ByteArrayStorage.field_e, GameClientShell.field_z);
            ByteArrayStorage.field_e.addDialog(true, MouseInputHandler.field_h);
          }
          MouseInputHandler.field_h.updateProgress(param3, param0, 65536, param1);
          if (param2 <= 118) {
            SocialNameInputPanel.releaseSocialNameInputStatics(-100);
          }
          SoftwareRasterizer.clear();
          CheckboxWidgetPainter.drawClientDialogs(0, true);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "jp.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void closeQuickChatMenus(byte param0) {
        String[] var2 = null;
        String[] var2Lifetime1;
        QuickChatPhraseDefinition.field_t = false;
        if (DerelictMapReader.field_h != null) {
          DerelictMapReader.field_h.clearSelection(0);
          if (0 != ProductionContent.field_h) {
            MusicVoice.clearChatInput(false);
          }
          ConquestVictoryChecker.field_m = 0;
          if (param0 < 83) {
            var2 = (String[]) null;
            SocialNameInputPanel.updateAccountNameSuggestions((String[]) null, false);
            return;
          }
          return;
        }
        if (0 != ProductionContent.field_h) {
          MusicVoice.clearChatInput(false);
        }
        ConquestVictoryChecker.field_m = 0;
        if (param0 < 83) {
          var2Lifetime1 = (String[]) null;
          SocialNameInputPanel.updateAccountNameSuggestions((String[]) null, false);
          return;
        }
    }

    final static void updateAccountNameSuggestions(String[] args, boolean param1) {
        if (null != TerritoryResourcePanelSupport.field_b) {
          TerritoryResourcePanelSupport.field_b.field_D.setSuggestions(args, 0);
        }
        if (param1) {
          return;
        }
        try {
          if (SocialListSetupSupport.field_b != null) {
            SocialListSetupSupport.field_b.field_F.setSuggestions(args, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "jp.D(" + (args != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseSocialNameInputStatics(int param0) {
        field_Bb = null;
        field_xb = null;
        field_Cb = null;
        if (param0 < -71) {
          return;
        }
        SocialNameInputPanel.closeQuickChatMenus((byte) -83);
    }

    static {
        field_xb = "Unpacking sound effects";
    }
}
