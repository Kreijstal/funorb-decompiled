/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HuffmanCodec {
    static int field_h;
    private int[] field_c;
    static int field_a;
    static UiComponent[] field_f;
    static int field_g;
    private int[] field_e;
    static char[] field_b;
    private byte[] field_i;
    static String field_d;

    final static SocialListEntry findSocialEntryByName(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        SocialListEntry var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_8_0 = null;
        SocialListEntry stackIn_22_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          if (param0 != -32055) {
            field_b = (char[]) null;
          }
          if (LoginDialog.field_nb == null) {
            stackIn_8_0 = null;
            return (SocialListEntry) (stackIn_8_0);
          }
          var2 = DialWidgetPainter.normalizeDisplayName((CharSequence) ((Object) param1), (byte) 118);
          if (var2 == null) {
            var2 = param1;
          }
          var3 = (SocialListEntry) (LoginDialog.field_nb.findByKey((long)var2.hashCode(), 1));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var3))) {
            var4 = DialWidgetPainter.normalizeDisplayName((CharSequence) ((Object) var3.field_Mb), (byte) 124);
            stackIn_25_0 = null;
            if (var5 == 0) {
              if (stackIn_25_0 == var4) {
                var4 = var3.field_Mb;
              }
              if (var4.equals(var2)) {
                stackIn_22_0 = var3;
                return stackIn_22_0;
              }
              var3 = (SocialListEntry) (LoginDialog.field_nb.nextWithSameKey(126));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_25_0 = null;
          }
          return (SocialListEntry) (stackIn_25_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_29_0 = var2_ref;
          stackIn_29_1 = new StringBuilder().append("fh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static int getChatFilterSetting(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 0;
          if (param1 == 0) {
            var2_int = RegistrationResponseHelpers.field_e;
          }
          if (param0 != 79) {
            stackIn_6_0 = -50;
            return stackIn_6_0;
          }
          if (param1 == 1) {
            var2_int = RasterStackHelpers.field_b;
          }
          if (param1 == 2) {
            var2_int = IntrusiveNode.field_f;
          }
          stackIn_16_0 = var2_int;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2), "fh.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        try {
          field_b = null;
          field_d = null;
          field_f = null;
          if (param0 != -48) {
            HuffmanCodec.buildChatInputPrompt((byte) -44);
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "fh.E(" + param0 + ')');
        }
    }

    final static void popRasterTarget(boolean param0) {
        try {
          DefaultQuickChatContext.field_c = DefaultQuickChatContext.field_c - 1;
          SoftwareRasterizer.setTarget(TooltipTextGlobals.field_a[DefaultQuickChatContext.field_c], PopupAndStripHelpers.field_a[DefaultQuickChatContext.field_c], PacketDiagnosticsHelpers.field_s[DefaultQuickChatContext.field_c]);
          SoftwareRasterizer.field_j = DialWidget.field_Y[DefaultQuickChatContext.field_c];
          SoftwareRasterizer.field_l = IterableNodeHashTable.field_b[DefaultQuickChatContext.field_c];
          SoftwareRasterizer.field_i = SocketConnector.field_f[DefaultQuickChatContext.field_c];
          SoftwareRasterizer.field_g = ContentTransitionDialog.field_ib[DefaultQuickChatContext.field_c];
          if (!param0) {
            field_f = (UiComponent[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "fh.G(" + param0 + ')');
        }
    }

    final static String buildChatInputPrompt(byte param0) {
        String stackIn_55_0 = null;
        Object stackIn_95_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        int var2 = 0;
        Object var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = TetraLink.field_J;
        try {
          var2 = 55 % ((param0 - 21) / 59);
          var1 = null;
          var3 = null;
          if (SecondaryNodeDequeIterator.field_d == 0 &&
            null != GameKeyHandler.field_a) {
            var3 = SettingsCookieHelpers.field_b;
          }
          if (2 == SecondaryNodeDequeIterator.field_d &&
            !ClockAndTextHelpers.isPrivateRecipientFriend(true)) {
            if (IsaacCipher.isFriend(1, NineSliceFrameHelpers.field_a)) {
              var3 = SectorCacheStore.formatTemplate(new String[]{LongAndTextCredentials.field_m}, ArchiveGroupHelpers.field_c, 119);
              if (var11 != 0) {
                var3 = SectorCacheStore.formatTemplate(new String[]{LongAndTextCredentials.field_m}, LoginPanel.field_Z, 119);
              }
            } else {
              var3 = SectorCacheStore.formatTemplate(new String[]{LongAndTextCredentials.field_m}, LoginPanel.field_Z, 119);
            }
            if (TextLayout.field_a) {
              AccountCreationDialog.addChatMessage(0, 0, (String) null, 2, (String) (var3), (String) null);
              HotspotTextWidget.closeQuickChatMenuIfOpen((byte) -8);
            }
          }
          if (var3 == null &&
            !AccountCreationDialog.field_Cb &&
            null == UiContainer.field_I) {
            var3 = TabbedPanel.field_Nb;
          }
          if (var3 != null) {
            KeyEventHelpers.setChatInputPrefix((String) (var3), (byte) -48, (String) null, ArchiveIndex.field_l, 0);
          } else {
            var4 = NetworkGameClient.field_w;
            var4 = NetworkArchiveRequest.prefixRankIcon(var4, -62);
            var5 = "";
            var6 = "|";
            var7 = SecondaryNodeDequeIterator.field_d;
            var8 = 0;
            if (var7 == 2) {
              var5 = SectorCacheStore.formatTemplate(new String[]{LongAndTextCredentials.field_m}, GrowableIntList.field_b, 126);
              var9 = SectorCacheStore.formatTemplate(new String[]{var4}, IntrusiveNode.field_h, 119);
              var8 = -485 + MessageDialogContent.field_L.field_Hb + (PageReloadHelpers.field_g.field_Hb + CachedTextLayout.field_k.textWidth(var9)) - CachedTextLayout.field_k.textWidth(var5);
              if (0 > var8) {
                var8 = 0;
              }
            } else {
              if (var7 == 0) {
                if (AccountWelcomePanel.field_N == null &&
                  GzipDecompressor.field_c) {
                  var5 = "[" + ReflectionCheck.field_v + "] ";
                }
                if (AccountWelcomePanel.field_N != null) {
                  boolean decompiledSharedTail1 = (!(IconLabelItem.field_Sb) ||
                    null == WeightedLruCache.field_h);
                  if (!decompiledSharedTail1) {
                    var5 = "[" + WeightedLruCache.field_h + "] ";
                    decompiledSharedTail1 = (var11 != 0);
                  }
                  if (decompiledSharedTail1) {
                    var5 = "[" + SectorCacheStore.formatTemplate(new String[]{AccountWelcomePanel.field_N.field_ec}, GameKeyHandler.field_e, 126) + "] ";
                  }
                  var7 = 1;
                }
              }
              if (PasswordLoginCredentials.hasPendingValidation((byte) 87)) {
                stackIn_55_0 = ": ";
              } else {
                stackIn_55_0 = "<img=3>: ";
              }
              var9 = stackIn_55_0;
              var5 = var5 + var4 + var9;
              boolean decompiledSharedTail0 = !(MenuLabelGlobals.field_a);
              if (!decompiledSharedTail0) {
                var5 = "<col=999999>" + var5 + WidgetStyleLayer.field_l + "</col>";
                var6 = "";
                decompiledSharedTail0 = (var11 != 0);
              }
              if ((decompiledSharedTail0) &&
                (DisplayNameForm.field_K)) {
                var6 = "";
                var5 = "<col=999999>" + var5 + PacketBuffer.field_n + "</col>";
              }
              var10 = CachedTextLayout.field_k.textWidth(var5);
              if (!PasswordLoginCredentials.hasPendingValidation((byte) 87)) {
                if (PageReloadHelpers.field_g.field_Y &&
                  ContextMenu.field_Nb - PageReloadHelpers.field_g.field_eb < var10) {
                  if (MenuLabelGlobals.field_a) {
                    var1 = "Broken!";
                  } else {
                    var1 = PacketBuffer.field_n;
                  }
                }
                if (PageReloadHelpers.field_g.field_F != 0 &&
                  var10 > PageReloadHelpers.field_g.field_Z &&
                  !MenuLabelGlobals.field_a) {
                  GameBoard.switchToPublicChat(-20715);
                }
              }
            }
            KeyEventHelpers.setChatInputPrefix(var5 + BitmapFont.escapeMarkup(StartupFlagsHelpers.field_h.toString()), (byte) -48, var6, AudioPumpThread.field_f[var7], var8);
            if (!MenuScreen.field_e) {
              MessageDialogContent.field_L.field_Y = false;
            }
            if (MessageDialogContent.field_L.field_Y) {
              var1 = SectorCacheStore.formatTemplate(new String[]{var4, LongAndTextCredentials.field_m}, ArrayWidgetContainer.field_L, 126);
            }
          }
          stackIn_95_0 = var1;
          return (String) (stackIn_95_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) (var1), "fh.B(" + param0 + ')');
        }
    }

    final int decompress(byte[] param0, int param1, int param2, int param3, boolean param4, byte[] param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_95_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = TetraLink.field_J;
        try {
          if (param3 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param4) {
            stackIn_6_0 = -26;
            return stackIn_6_0;
          }
          param3 = param3 + param1;
          var7_int = 0;
          var8 = param2;
          scanLoop1: while (true) {
            var9 = param0[var8];
            if (var9 >= 0) {
              var7_int++;
              if (var11 != 0) {
              }
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$0 = this.field_c[var7_int];
            var10 = dupTemp$0;
            if (0 > dupTemp$0) {
              incrementValue$1 = param1;
              param1++;
              param5[incrementValue$1] = (byte)(~var10);
              if (param3 <= param1 &&
                var11 == 0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 64) != 0) {
              var7_int = this.field_c[var7_int];
            }
            if ((var9 & 64) == 0 ||
              var11 != 0) {
              var7_int++;
            }
            dupTemp$2 = this.field_c[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (0 > dupTemp$2) {
              incrementValue$3 = param1;
              param1++;
              param5[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param1 >= param3 &&
                var11 == 0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((32 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            }
            if ((32 & var9) == 0 ||
              var11 != 0) {
              var7_int++;
            }
            dupTemp$4 = this.field_c[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param1;
              param1++;
              param5[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param3 <= param1) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 16) != 0) {
              var7_int = this.field_c[var7_int];
            }
            if ((var9 & 16) == 0 ||
              var11 != 0) {
              var7_int++;
            }
            dupTemp$6 = this.field_c[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param1;
              param1++;
              param5[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param3 <= param1) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if (0 != (var9 & 8)) {
              var7_int = this.field_c[var7_int];
            }
            if (0 == (var9 & 8) ||
              var11 != 0) {
              var7_int++;
            }
            dupTemp$8 = this.field_c[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param1;
              param1++;
              param5[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param3 <= param1 &&
                var11 == 0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 4) == 0) {
              var7_int++;
            }
            if ((var9 & 4) != 0 ||
              var11 != 0) {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$10 = this.field_c[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param1;
              param1++;
              param5[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param3 <= param1) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((2 & var9) == 0) {
              var7_int++;
            }
            if ((2 & var9) != 0 ||
              var11 != 0) {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$12 = this.field_c[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (0 > dupTemp$12) {
              incrementValue$13 = param1;
              param1++;
              param5[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param3 <= param1) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((1 & var9) == 0) {
              var7_int++;
            }
            if ((1 & var9) != 0 ||
              var11 != 0) {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$14 = this.field_c[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param1;
              param1++;
              param5[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param3 <= param1 &&
                var11 == 0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            var8++;
            if (var11 == 0) {
              continue;
            }
            break;
          }
          stackIn_95_0 = -param2 + var8 + 1;
          return stackIn_95_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_99_0 = var7;
          stackIn_99_1 = new StringBuilder().append("fh.A(");
          if (param0 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(')').toString());
        }
    }

    final int compress(int param0, int param1, byte[] param2, int param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = TetraLink.field_J;
        try {
          var7_int = 0;
          param3 = param3 + param0;
          var8 = param1 << 3;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (param0 >= param3))) {
            var9 = 255 & param2[param0];
            var10 = this.field_e[var9];
            var11 = this.field_i[var9];
            stackIn_25_0 = -1;
            stackIn_25_1 = ~var11;
            if (var15 == 0) {
              if (stackIn_25_0 == stackIn_25_1) {
                throw new RuntimeException("" + var9);
              }
              var12 = var8 >> 3;
              var13 = 7 & var8;
              var7_int = var7_int & -var13 >> 31;
              var14 = var12 + (var11 + var13 - 1 >> 3);
              var13 += 24;
              dupTemp$0 = IntrusiveNode.bitOr(var7_int, var10 >>> var13);
              var7_int = dupTemp$0;
              param4[var12] = (byte)dupTemp$0;
              if (var12 < var14) {
                var12++;
                var13 -= 8;
                var7_int = var10 >>> var13;
                param4[var12] = (byte)(var10 >>> var13);
                if (var14 > var12) {
                  var13 -= 8;
                  var12++;
                  var7_int = var10 >>> var13;
                  param4[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var13 -= 8;
                    var12++;
                    var7_int = var10 >>> var13;
                    param4[var12] = (byte)(var10 >>> var13);
                    if (var12 < var14) {
                      var13 -= 8;
                      var12++;
                      var7_int = var10 << -var13;
                      param4[var12] = (byte)(var10 << -var13);
                    }
                  }
                }
              }
              var8 = var8 + var11;
              param0++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_25_0 = param5;
            stackIn_25_1 = 28677;
          }
          if (stackIn_25_0 != stackIn_25_1) {
            field_d = (String) null;
          }
          stackIn_29_0 = (var8 + 7 >> 3) - param1;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_33_0 = var7;
          stackIn_33_1 = new StringBuilder().append("fh.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param5).append(')').toString());
        }
    }

    HuffmanCodec(byte[] param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_26_0Lifetime1;
        int stackIn_26_1Lifetime1;
        int stackIn_63_0Lifetime1;
        int stackIn_63_1Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        var15 = TetraLink.field_J;
        try {
          var2_int = param0.length;
          this.field_i = param0;
          this.field_e = new int[var2_int];
          this.field_c = new int[8];
          var3 = new int[33];
          var4 = 0;
          var5 = 0;
          scanLoop1: while (true) {
            stackIn_3_0 = ~var5;
            stackIn_3_1 = ~var2_int;
            if (stackIn_3_0 > stackIn_3_1) {
              var6 = param0[var5];
              if (var15 != 0) {
                return;
              }
              if (var6 != 0) {
                boolean decompiledFrameRemainder0 = true;
                var7 = 1 << 32 - var6;
                var8 = var3[var6];
                this.field_e[var5] = var8;
                if (0 == (var8 & var7)) {
                  var10 = -1 + var6;
                  scanLoop2: while (true) {
                    if (var10 >= 1) {
                      var11 = var3[var10];
                      stackIn_26_0 = var11;
                      stackIn_26_1 = var8;
                      if (stackIn_26_0 == stackIn_26_1) {
                        var12 = 1 << -var10 + 32;
                        if (0 == (var12 & var11)) {
                          var3[var10] = IntrusiveNode.bitOr(var11, var12);
                        } else {
                          var3[var10] = var3[-1 + var10];
                          break scanLoop2;
                        }
                        var10--;
                        continue;
                      }
                    }
                    break;
                  }
                  stackIn_26_0Lifetime1 = var7;
                  stackIn_26_1Lifetime1 = var8;
                  var9 = stackIn_26_0Lifetime1 | stackIn_26_1Lifetime1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var9 = var3[-1 + var6];
                }
                var3[var6] = var9;
                var10Lifetime1 = var6 + 1;
                while (32 >= var10Lifetime1) {
                  stackIn_3_0 = var8;
                  stackIn_3_1 = var3[var10Lifetime1];
                  if (stackIn_3_0 == stackIn_3_1) {
                    var3[var10Lifetime1] = var9;
                  }
                  var10Lifetime1++;
                }
                var10Lifetime2 = 0;
                var11Lifetime1 = 0;
                while (true) {
                  if (var11Lifetime1 < var6) {
                    var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                    stackIn_63_0 = 0;
                    stackIn_63_1 = var12Lifetime1 & var8;
                    if (stackIn_63_0 != stackIn_63_1) {
                      if (0 == this.field_c[var10Lifetime2]) {
                        this.field_c[var10Lifetime2] = var4;
                      }
                      var10Lifetime2 = this.field_c[var10Lifetime2];
                    } else {
                      var10Lifetime2++;
                    }
                    var12Lifetime1 = var12Lifetime1 >>> 1;
                    if (var10Lifetime2 >= this.field_c.length) {
                      var13 = new int[2 * this.field_c.length];
                      var14 = 0;
                      while (this.field_c.length > var14) {
                        var13[var14] = this.field_c[var14];
                        var14++;
                      }
                      this.field_c = var13;
                    }
                    var11Lifetime1++;
                    continue;
                  }
                  this.field_c[var10Lifetime2] = ~var5;
                  stackIn_63_0Lifetime1 = var10Lifetime2;
                  stackIn_63_1Lifetime1 = var4;
                  if (stackIn_63_0Lifetime1 < stackIn_63_1Lifetime1) {
                    break;
                  }
                  var4 = var10Lifetime2 + 1;
                  break;
                }
              }
              var5++;
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_70_0 = var2;
          stackIn_70_1 = new StringBuilder().append("fh.<init>(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    static {
        field_b = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_d = "Similar rating";
    }
}
