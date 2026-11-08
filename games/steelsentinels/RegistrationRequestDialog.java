/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RegistrationRequestDialog extends AccountRequestDialog implements ButtonListener {
    static NodeDeque field_Ub;
    private boolean field_Nb;
    private AccountRegistrationPanel field_Zb;
    static SocialTabsPanel field_Tb;
    static String field_Pb;
    static volatile int field_Rb;
    static String field_Qb;
    private boolean field_Sb;
    static LoginConnectionStage field_Yb;
    static String field_Vb;
    static String field_Wb;
    static int field_Ob;
    static int[] field_Xb;

    final static void emptyGuardStub(int param0) {
        if (param0 != -6) {
          CharSequence var2 = (CharSequence) null;
          RegistrationRequestDialog.isDecimalInteger((CharSequence) null, -105);
        }
    }

    final static PlayingSound playSampleAtVolume(int param0, int param1, int param2, PcmSample param3) {
        RuntimeException var4 = null;
        PlayingSound stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 248) {
            field_Wb = (String) null;
          }
          stackIn_3_0 = EmailCredentials.playStream(PcmSampleStream.createAtRatePercentQ6(param3, 100, param0, param1), -48);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("fg.FB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_Xb = null;
        field_Tb = null;
        field_Yb = null;
        field_Pb = null;
        field_Ub = null;
        field_Vb = null;
        field_Wb = null;
        if (param0 != -29) {
          return;
        }
        field_Qb = null;
    }

    private final void handleRegistrationResult(int param0, boolean param1, AccountRequestResult param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        AccountMessagePanel var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.obfuscationControl;
        try {
          this.field_Nb = true;
          if (!param2.field_d) {
            if (param2.field_c == null) {
              var4 = param2.field_e;
              if (248 == param2.field_a) {
                if (!param1) {
                  RankingQuery.setTuhstatbutCookie(true);
                }
                var4 = ClientUiHelpers.field_g;
                this.field_Sb = true;
              }
            } else {
              var4 = field_Qb;
              if (this.field_Zb != null) {
                this.field_Zb.onMoreSuggestions((byte) 86);
              }
            }
          } else {
            var4 = ValidationIndicator.field_Z;
          }
          if (param0 != 5) {
            field_Yb = (LoginConnectionStage) null;
          }
          var5 = new AccountMessagePanel((AccountRequestDialog) (this), GeneratedSpriteHelpers.field_d, var4);
          if (param2.field_d) {
            if (param2.field_f) {
              this.transitionToContent(new AccountTermsPanel(this), -22908735);
              return;
            }
            var5.appendButton(-122, (UiListener) (this), SocialListEntry.field_Sb);
          } else {
            if (!this.field_Sb) {
              if (param2.field_a == 5) {
                var5.addActionButton(11, LoginResultHelpers.field_c, param0 ^ 110);
                var5.addActionButton(17, TextSpriteHelpers.field_b, 74);
              } else {
                var5.addActionButton(-1, StrongCacheEntry.field_J, 75);
              }
            } else {
              var5.appendButton(param0 ^ -105, (UiListener) (this), SocialListEntry.field_Sb);
            }
            if (3 != param2.field_a) {
              if (param2.field_a != 6) {
                this.transitionToContent(var5, -22908735);
                return;
              }
              var5.addActionButton(9, PendingAckRequest.field_s, 74);
            } else {
              var5.addActionButton(7, ProxyAuthenticationException.field_d, 76);
            }
          }
          this.transitionToContent(var5, -22908735);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("fg.UA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static void layoutLobbyPanels(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = SteelSentinels.obfuscationControl;
        try {
          var6_int = 8 + param4 + (485 + param3 + param0);
          ProxyAuthenticationException.field_g.setBounds(0, 3, -6 + DisplayNameForm.field_V.field_Lb, 3, -6 + var6_int);
          var7 = -5 + ProxyAuthenticationException.field_g.field_Lb;
          CombatWorld.field_H.setBounds(0, var7 - param1, param1, 5, param3 + 485 + 2 + param4);
          TransitionTimerHelpers.field_d.setBounds(0, 0, param1, param3, -DualNodeDequeIterator.field_e.field_zb + (-param3 + CombatWorld.field_H.field_zb));
          DualNodeDequeIterator.field_e.setBounds(0, 0, param1, TransitionTimerHelpers.field_d.field_zb + param3, DualNodeDequeIterator.field_e.field_zb);
          var7 = var7 - (2 + param1);
          BoundedRandomAccessFile.field_j.setBoundsAndLayout(param4 + param3 + 485 + 2, -2048, param4, var7 - 5, 2, 5, 5);
          if (AssetDecoders.field_b != null) {
            AssetDecoders.field_b.setBounds(BoundedRandomAccessFile.field_j.field_Y, (byte) -92, BoundedRandomAccessFile.field_j.field_eb, BoundedRandomAccessFile.field_j.field_zb, BoundedRandomAccessFile.field_j.field_Lb);
          }
          var8 = -param3 + (DisplayNameForm.field_V.field_zb - var6_int);
          var9 = var8 / 2;
          var10 = param3 + (param2 + var9);
          var11 = 0;
          for (var12 = 0; var12 < 6; var12++) {
            if (5 <= var12 ||
              SocialListEntry.field_Yb[var12] != null) {
              var13 = 3 + var11 * (2 + (-6 + DisplayNameForm.field_V.field_Lb)) / (1 + PendingByteArrayRequest.field_u);
              var11++;
              var7Lifetime1 = var11 * (-4 + DisplayNameForm.field_V.field_Lb) / (1 + PendingByteArrayRequest.field_u) + 1 - var13;
              if (var12 < 5) {
                SocialListEntry.field_Yb[var12].setBounds(0, var13, var7Lifetime1, var6_int, var8);
                LoadingScreenHelpers.field_b[var12].setBounds(0, 0, var7Lifetime1, param3, -param3 + var9);
                IntKeyLookup.field_a[var12].setBounds(0, param5, var7Lifetime1 - param5 - param5, var9, param2);
                ByteStorage.field_f[var12].setBounds(0, param5, -param5 + (var7Lifetime1 - param5), var10, -var10 + (-param3 + var8));
              } else {
                QuickChatParameterType.field_b.setBounds(param0 - 10, var13, var7Lifetime1, var6_int, var8);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var6), "fg.BB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean updateAnimationsAndCheckClosed(int param0) {
        AccountRequestResult var2 = null;
        if (this.field_Q &&
          !this.field_Nb) {
          var2 = TickClock.takeRegistrationResult((byte) 73);
          if (var2 != null) {
            this.handleRegistrationResult(5, false, var2);
          }
        }
        if (param0 != -8350) {
          RegistrationRequestDialog.isAccountOverlayOpen((byte) -108);
        }
        return super.updateAnimationsAndCheckClosed(param0 + 0);
    }

    final static PendingIntArrayRequest queueOutgoingRequest(int param0, int param1) {
        PendingIntArrayRequest var2 = new PendingIntArrayRequest();
        if (param1 != 19999) {
          RegistrationRequestDialog.queueOutgoingRequest(125, 90);
        }
        MidiPcmStream.field_D.addLast(3, var2);
        SocialListUiHelpers.sendTwoByteRequest(param0, -17274);
        return var2;
    }

    final static boolean isAccountOverlayOpen(byte param0) {
        int var1 = 77 / ((param0 - 28) / 44);
        return null != HighscoreSubmissionFactory.field_f ? true : false;
    }

    final static boolean isDecimalInteger(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -21) {
            field_Tb = (SocialTabsPanel) null;
          }
          stackIn_3_0 = TextAndBitHelpers.isIntegerInRadix(true, 10, false, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fg.CB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void onAction(int param0, byte param1, int param2, TextButton param3, int param4) {
        if (this.field_Sb) {
          ChecksumAndFrameHelpers.showLoginDialog(false, true, 95);
          return;
        }
        try {
          SettingSearchHelpers.beginStoredLogin(0);
          this.closeDialog(112);
          int var6_int = -27 / ((param1 + 85) / 36);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "fg.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    RegistrationRequestDialog(ModalStack param0, AccountRegistrationPanel param1) {
        super(param0, GeneratedSpriteHelpers.field_d, LobbyGame.field_Jc, false, false);
        try {
          this.field_Zb = param1;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "fg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void showIneligibleResult(int param0) {
        this.handleRegistrationResult(5, true, CachedArchiveProvider.createAccountResponse(123, ClientUiHelpers.field_g, 248));
        if (param0 < 77) {
          field_Yb = (LoginConnectionStage) null;
        }
    }

    static {
        field_Qb = "That name is not available";
        field_Rb = 0;
        field_Pb = "or";
        field_Ub = new NodeDeque();
        field_Vb = "Detail: Low";
        field_Yb = new LoginConnectionStage();
        field_Wb = "Mission Complete";
        field_Ob = 1;
        field_Xb = new int[]{0, 5, 10, 1, 6, 11, 2, 7, 12, 33, 32, 26, 18, 21, 28, 29, 36, 27, 24, 3, 8, 13, 9, 4, 14, 42, 15, 39, 40, 20, 30, 35, 38, 37, 44, 41};
    }
}
