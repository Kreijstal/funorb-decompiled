/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_e;
    static String gameoptNotunlocked;
    static byte[] field_j;
    static String returntolobby;
    static String loginGameupdated;
    int field_i;
    short field_b;
    short field_l;
    int field_d;
    static int field_f;
    short field_k;
    boolean field_c;

    private final void a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var6 = param1 - param0[0];
        var7 = param2 - param0[1];
        var8 = param3 - 64 - param0[2];
        var9 = param0[9] * var6 + param0[10] * var7 + param0[11] * var8 >> 16;
        if (var9 > 0) {
          var10 = (SoftwareRasterizer.clipLeft + TriangleRasterizer.projectionCenterX << 4) + (param0[3] * var6 + param0[4] * var7 + param0[5] * var8 >> 3) / var9;
          var11 = (SoftwareRasterizer.clipTop + TriangleRasterizer.projectionCenterY << 4) + (param0[6] * var6 + param0[7] * var7 + param0[8] * var8 >> 3) / var9;
          param4 = param4 / var9;
          if (param4 > -23170 &&
            param4 < 23170) {
            SoftwareRasterizer.fillRadialGlow(var10, var11, param4, 4, bc.field_c);
          }
        }
    }

    final void a(int param0, int[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param1, this.field_e, this.field_i, this.field_d, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("dk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void bounceBallOffPoint(int param0, byte param1, int param2, Ball param3, int param4) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        long var12 = 0L;
        try {
          param3.advanceTo(param2, 6);
          var5_long = param3.horizontalSpeedSquared(-14770);
          var7 = param0 - param3.positionX;
          var8 = -param3.positionY + param4;
          var9 = IterableNodeHashTable.a(-107, FullscreenFocusCanvas.multiplyFixedChecked((long)var7, (long)var7, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var8, (long)var8, false));
          if (var9 <= 2147483647L &&
            var9 >= -2147483648L) {
            var7 = ArchiveProvider.divideFixed16((int)var9, (byte) -96, (long)var7);
            var8 = ArchiveProvider.divideFixed16((int)var9, (byte) -85, (long)var8);
            var11 = NameEntryPopup.a(var7, false, param3.velocityX) + NameEntryPopup.a(var8, false, param3.velocityY);
            param3.velocityX = param3.velocityX - 2 * NameEntryPopup.a(var11, false, var7);
            param3.velocityY = param3.velocityY - NameEntryPopup.a(var11, false, var8) * 2;
            param3.angularVelocityX = param3.angularVelocityX * kp.field_m >> 8;
            param3.motionState = 1;
            param3.angularVelocityY = param3.angularVelocityY * kp.field_m >> 8;
            param3.angularVelocityZ = kp.field_m * param3.angularVelocityZ >> 8;
            var12 = param3.horizontalSpeedSquared(-14770);
            if (td.field_b < nn.field_e.length) {
              nn.field_e[td.field_b][0] = param0;
              nn.field_e[td.field_b][1] = param4;
              nn.field_e[td.field_b][2] = -524288;
            }
            if (td.field_b < SoundCache.field_g.length) {
              fieldTemp$0 = td.field_b;
              td.field_b = td.field_b + 1;
              SoundCache.field_g[fieldTemp$0] = (int)(var5_long - var12);
            }
            if (param1 != -20) {
              returntolobby = (String) null;
            }
            return;
          }
          throw new IllegalStateException("d out of bounds.");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("dk.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        try {
          this.field_k = (short)(param2 - this.field_i);
          this.field_b = (short)(param0 - this.field_e);
          this.field_i = param2;
          this.field_e = param0;
          if (param1 != 78) {
            dk.formatProgressLabel((byte) -28, (String) null, (ResourceArchive) null, (String) null, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "dk.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(int param0) {
        String stackIn_59_0 = null;
        Object stackIn_97_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = Pool.field_O;
        try {
          if (param0 != 1) {
            dk.formatProgressLabel((byte) -62, (String) null, (ResourceArchive) null, (String) null, (String) null);
          }
          var1 = null;
          var2 = null;
          if (0 == hn.field_b &&
            tp.field_e != null) {
            var2 = cl.publicchatUnavailableRatedgame;
          }
          if (hn.field_b == 2 &&
            !hp.a(false)) {
            boolean decompiledSharedTail2 = !(!DialogLayer.a(ResourceArchive.field_a, -1));
            if (!decompiledSharedTail2) {
              var2 = AccountWelcomePanel.substituteTemplateArguments(new String[]{ArrayWidgetGroup.field_I}, param0 ^ -2, tp.privatechatFriendNotlisted);
              decompiledSharedTail2 = (var10 != 0);
            }
            if (decompiledSharedTail2) {
              var2 = AccountWelcomePanel.substituteTemplateArguments(new String[]{ArrayWidgetGroup.field_I}, -1, IterableNodeHashTable.privatechatFriendOffline);
            }
            if (ArrayWidgetGroup.field_H) {
              jh.a(0, (String) (var2), (String) null, 2, (String) null, true);
              th.b(-1);
            }
          }
          if (null == var2 &&
            !gd.field_b &&
            Bzip2DecoderState.field_D == null) {
            var2 = NineBallRules.chatviewscrolledup;
          }
          if (var2 != null) {
            dr.a((String) null, param0 + 11467, FreePlayRules.field_g, 0, (String) (var2));
          } else {
            var3 = ResourceArchive.field_j;
            var3 = IterableNodeHashTable.a(524288, var3);
            var4 = "";
            var5 = "|";
            var6 = hn.field_b;
            var7 = 0;
            if (var6 == 2) {
              var4 = AccountWelcomePanel.substituteTemplateArguments(new String[]{ArrayWidgetGroup.field_I}, -1, jl.privatequickchatToX);
              var8 = AccountWelcomePanel.substituteTemplateArguments(new String[]{var3}, -1, UiComponent.privatequickchatFromX);
              var7 = TimeTrialSelectScreen.field_J.width - (-NineBallRules.field_j.width + (485 - m.field_c.b(var8) + m.field_c.b(var4)));
              if (var7 < 0) {
                var7 = 0;
              }
            } else {
              if (var6 == 0) {
                if (null == HighscoresScreen.field_L &&
                  JaggrabDownloader.field_l) {
                  var4 = "[" + BirthDateValidator.muChatLobby + "] ";
                }
                if (null != HighscoresScreen.field_L) {
                  boolean decompiledSharedTail1 = (!(sa.field_c) ||
                    PlayerContextMenu.field_g == null);
                  if (!decompiledSharedTail1) {
                    var4 = "[" + PlayerContextMenu.field_g + "] ";
                    decompiledSharedTail1 = (var10 != 0);
                  }
                  if (decompiledSharedTail1) {
                    var4 = "[" + AccountWelcomePanel.substituteTemplateArguments(new String[]{HighscoresScreen.field_L.field_Ob}, -1, th.xsGame) + "] ";
                  }
                  var6 = 1;
                }
              }
              if (MenuSelection.b(-1)) {
                stackIn_59_0 = ": ";
              } else {
                stackIn_59_0 = "<img=3>: ";
              }
              var8 = stackIn_59_0;
              var4 = var4 + var3 + var8;
              boolean decompiledSharedTail0 = !(ea.field_z);
              if (!decompiledSharedTail0) {
                var5 = "";
                var4 = "<col=999999>" + var4 + WeightedLruCache.dobChatdisabled + "</col>";
                decompiledSharedTail0 = (var10 != 0);
              }
              if ((decompiledSharedTail0) &&
                (ViewportController.field_y)) {
                var5 = "";
                var4 = "<col=999999>" + var4 + je.clickToQuickchat + "</col>";
              }
              var9 = m.field_c.b(var4);
              if (!MenuSelection.b(param0 ^ -2)) {
                if (TimeTrialSelectScreen.field_J.activeInside &&
                  -TimeTrialSelectScreen.field_J.screenX + wn.field_i < var9) {
                  if (ea.field_z) {
                    var1 = "Broken!";
                  } else {
                    var1 = je.clickToQuickchat;
                  }
                }
                if (TimeTrialSelectScreen.field_J.pressedButton != 0 &&
                  var9 > TimeTrialSelectScreen.field_J.pressLocalX &&
                  !ea.field_z) {
                  EmailValidator.c((byte) 68);
                }
              }
            }
            dr.a(var5, 11468, Ball.field_F[var6], var7, var4 + BitmapFont.escapeMarkup(td.field_c.toString()));
            if (!DualLinkNode.field_p) {
              NineBallRules.field_j.activeInside = false;
            }
            if (NineBallRules.field_j.activeInside) {
              var1 = AccountWelcomePanel.substituteTemplateArguments(new String[]{var3, ArrayWidgetGroup.field_I}, -1, wb.privatechatBlankareaExplanation);
            }
          }
          stackIn_97_0 = var1;
          return (String) (stackIn_97_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) (var1), "dk.E(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        try {
          this.field_i = param0;
          this.field_e = param1;
          if (param2 <= 21) {
            this.a(-71, 118, (byte) -96);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "dk.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        returntolobby = null;
        if (param0 != 113) {
          return;
        }
        try {
          field_j = null;
          gameoptNotunlocked = null;
          loginGameupdated = null;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "dk.B(" + param0 + ')');
        }
    }

    final static String formatProgressLabel(byte param0, String param1, ResourceArchive param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.isIndexReady(58)) {
            stackIn_4_0 = (String) (param4);
            return stackIn_4_0;
          }
          var5_int = -40 / ((param0 - 48) / 49);
          stackIn_6_0 = param3 + " - " + param2.getGroupProgressByName(100, param1) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("dk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(UiComponent param0, byte param1) {
        Sprite var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        Sprite var2Lifetime1;
        try {
          if (param1 != 93) {
            dk.formatProgressLabel((byte) 91, (String) null, (ResourceArchive) null, (String) null, (String) null);
          }
          var2 = param0.sprite;
          var2.field_B = -var2.field_A + param0.height >> 1;
          var2.field_y = var2.field_B + var2.field_A;
          var2Lifetime1 = param0.selectedSprite;
          if (null != var2Lifetime1) {
            var2Lifetime1.field_B = -var2Lifetime1.field_A + param0.height >> 1;
            var2Lifetime1.field_y = var2Lifetime1.field_B + var2Lifetime1.field_A;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("dk.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    dk(int param0, int param1) {
        this.field_c = false;
        try {
          this.a(param1, param0, (byte) 34);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        gameoptNotunlocked = "This game option has not yet been unlocked for use.";
        field_f = 0;
        loginGameupdated = "This game has been updated! Please reload this page.";
        returntolobby = "Return to lobby";
    }
}
