/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RegistrationRequestDialog extends ProgressMessageDialog implements ButtonActionListener {
    private AccountCreationForm field_Ab;
    static long field_Gb;
    static Sprite field_Eb;
    static String field_Cb;
    private boolean field_Fb;
    private boolean field_Bb;
    static boolean field_Db;

    public final void onAction(int param0, TextButton param1, int param2, int param3, int param4) {
        if (this.field_Bb) {
          LoadingProgressDialog.openLoginScreen(true, false, -16113);
          return;
        }
        try {
          LoginCredentialType.loginWithStoredCredentials(param0 + 3344);
          this.closeDialog(true);
          if (param0 != 12085) {
            this.tickLayerAndCheckHidden(59);
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "b.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void showRegistrationComplete(int param0) {
        if (param0 < -85) {
          this.handleRegistrationResult(TypeCode.createSuggestedUsernameQuery(248, IntrusiveDequeCursor.field_d, 29493), true, 113);
          return;
        }
        this.field_Bb = false;
        this.handleRegistrationResult(TypeCode.createSuggestedUsernameQuery(248, IntrusiveDequeCursor.field_d, 29493), true, 113);
    }

    RegistrationRequestDialog(WidgetLayerStack param0, AccountCreationForm param1) {
        super(param0, LoginRsaKey.arezzo14BoldFont, TextWidgetPainter.field_e, false, false);
        try {
          this.field_Ab = param1;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "b.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static Sprite[] loadFrameSprites(String param0, Js5Archive param1, int param2, String param3) {
        Sprite[] var4 = null;
        RuntimeException var4_ref = null;
        Sprite[] var5 = null;
        Sprite[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = WidgetNode.loadSpritesByName(32, param1, param0, param3);
          var4 = var5;
          var5[3].field_z = var5[3].field_p;
          var5[1].field_u = var5[1].field_w;
          var5[5].field_z = var5[5].field_p;
          var5[param2].field_u = var5[7].field_w;
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("b.RA(");
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
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_Cb = null;
        if (param0 != -22) {
          field_Gb = 0L;
          field_Eb = null;
          return;
        }
        field_Eb = null;
    }

    private final void handleRegistrationResult(AccountRequestReply param0, boolean param1, int param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        DialogMessagePane var5 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          this.field_Fb = true;
          if (param2 <= 97) {
            this.field_Ab = (AccountCreationForm) null;
          }
          if (param0.field_a) {
            var4 = Js5ArchiveManager.field_e;
          } else {
            if (param0.field_b == null) {
              var4 = param0.field_e;
              if (param0.field_g == 248) {
                if (!param1) {
                  StrongCacheReference.setStatusCookie(0);
                }
                this.field_Bb = true;
                var4 = IntrusiveDequeCursor.field_d;
              }
            } else {
              var4 = CacheReference.field_t;
              if (null != this.field_Ab) {
                this.field_Ab.onMoreSuggestionsRequested((byte) -72);
              }
            }
          }
          var5 = new DialogMessagePane((ProgressMessageDialog) (this), LoginRsaKey.arezzo14BoldFont, var4);
          if (!param0.field_a) {
            if (this.field_Bb) {
              var5.addButton((UiListener) (this), 260, IntKeyLookup.field_c);
            } else {
              if (param0.field_g != 5) {
                var5.addActionButton(-1, AccountChoicePanel.field_D, (byte) 127);
              } else {
                var5.addActionButton(11, SocketConnector.field_g, (byte) 126);
                var5.addActionButton(17, BoundedUrlRequest.field_k, (byte) 127);
              }
            }
            if (param0.field_g == 3) {
              var5.addActionButton(7, AccountCreationForm.field_N, (byte) 127);
            } else {
              if (param0.field_g == 6) {
                var5.addActionButton(9, RequestResendSupport.field_f, (byte) 126);
              }
            }
          } else {
            if (param0.field_d) {
              this.transitionToContent(new AccountTermsPanel(this), (byte) -53);
              return;
            }
            var5.addButton((UiListener) (this), 260, IntKeyLookup.field_c);
          }
          this.transitionToContent(var5, (byte) -53);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("b.W(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean tickLayerAndCheckHidden(int param0) {
        AccountRequestReply var2 = null;
        AccountRequestReply var2Lifetime1;
        if (param0 != 3) {
          field_Gb = 49L;
          if (!this.field_G) {
            return super.tickLayerAndCheckHidden(3);
          }
          if (this.field_Fb) {
            return super.tickLayerAndCheckHidden(3);
          }
          var2 = CommonUiHelpers.takeRegistrationResult((byte) -113);
          if (var2 != null) {
            this.handleRegistrationResult(var2, false, 120);
            return super.tickLayerAndCheckHidden(3);
          }
          return super.tickLayerAndCheckHidden(3);
        }
        if (!this.field_G) {
          return super.tickLayerAndCheckHidden(3);
        }
        if (this.field_Fb) {
          return super.tickLayerAndCheckHidden(3);
        }
        var2Lifetime1 = CommonUiHelpers.takeRegistrationResult((byte) -113);
        if (var2Lifetime1 != null) {
          this.handleRegistrationResult(var2Lifetime1, false, 120);
          return super.tickLayerAndCheckHidden(3);
        }
        return super.tickLayerAndCheckHidden(3);
    }

    final static void drawDottedRectangle(int param0, byte param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          var5_int = param2 + param3;
          var6 = param4 + param0;
          if (Rasterizer.field_i >= param2) {
            stackIn_4_0 = Rasterizer.field_i;
          } else {
            stackIn_4_0 = param2;
          }
          var7 = stackIn_4_0;
          if (Rasterizer.field_g < param0) {
            stackIn_7_0 = param0;
          } else {
            stackIn_7_0 = Rasterizer.field_g;
          }
          var8 = stackIn_7_0;
          if (var5_int < Rasterizer.field_k) {
            stackIn_10_0 = var5_int;
          } else {
            stackIn_10_0 = Rasterizer.field_k;
          }
          var9 = stackIn_10_0;
          if (param1 <= 1) {
            field_Db = true;
          }
          if (var6 < Rasterizer.field_h) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = Rasterizer.field_h;
          }
          var10 = stackIn_15_0;
          if (Rasterizer.field_i <= param2 &&
            param2 < Rasterizer.field_k) {
            var11 = var8 * Rasterizer.field_e + param2;
            var12 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              Rasterizer.field_d[var11] = 16777215;
              var11 = var11 + Rasterizer.field_e * 2;
            }
          }
          if (param0 >= Rasterizer.field_g &&
            var6 < Rasterizer.field_h) {
            var11Lifetime1 = var7 + Rasterizer.field_e * param0;
            var12Lifetime1 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (0 > var12Lifetime1) {
                break;
              }
              Rasterizer.field_d[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= Rasterizer.field_i &&
            var5_int < Rasterizer.field_k) {
            var11Lifetime2 = (var8 + (var5_int - param2 & 1)) * Rasterizer.field_e + var5_int;
            var12Lifetime2 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              Rasterizer.field_d[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * Rasterizer.field_e;
            }
          }
          if (Rasterizer.field_g <= param0) {
            if (var6 >= Rasterizer.field_h) {
              return;
            }
            var11Lifetime3 = (1 & var6 - param0) + Rasterizer.field_e * var6 + var7;
            var12Lifetime3 = -var7 + 1 + var9 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              Rasterizer.field_d[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var5), "b.VA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_Cb = "Withdraw invitation to <%0> to join this game";
        field_Db = true;
    }
}
