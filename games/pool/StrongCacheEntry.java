/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StrongCacheEntry extends CacheEntry {
    static String tutorialOptionEightBall;
    static String muXDeclinedInvite;
    static String mouseoveranicon;
    static long field_K;
    static int field_J;
    static int field_O;
    static String playerListAreOfferingDraw;
    private Object value;
    static int field_I;

    public static void releaseStatics(int param0) {
        if (param0 == 0) {
          tutorialOptionEightBall = null;
          muXDeclinedInvite = null;
          playerListAreOfferingDraw = null;
          mouseoveranicon = null;
          return;
        }
        playerListAreOfferingDraw = (String) null;
        tutorialOptionEightBall = null;
        muXDeclinedInvite = null;
        playerListAreOfferingDraw = null;
        mouseoveranicon = null;
    }

    final static int advanceMembershipSlideshow(boolean inputEnabled, byte obfuscationGuard) {
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pool.field_O;
        try {
          IsaacCipher.field_d = IsaacCipher.field_d + 65536;
          while (ThreeSliceButtonPainter.fixedMultiply(QuickChatDynamicCommand.field_f, obfuscationGuard - 65, IsaacCipher.field_d) >= 65536) {
            IsaacCipher.field_d = IsaacCipher.field_d - QuickChatDynamicCommand.field_f;
            PoolMatchController.field_X = PoolMatchController.field_X + 1;
          }
          var2_int = -1;
          if (AccountCreationForm.field_V == null) {
            if (TikiBallSkin.field_m != null) {
              var2_int = TikiBallSkin.field_m.length;
            }
          } else {
            var2_int = AccountCreationForm.field_V.length;
          }
          if (obfuscationGuard != 65) {
            StrongCacheEntry.releaseStatics(38);
          }
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (QuickChatDynamicCommand.field_g > SocketArchiveNetworkClient.field_u) {
              SocketArchiveNetworkClient.field_u = SocketArchiveNetworkClient.field_u + 1;
              if (SocketArchiveNetworkClient.field_u > QuickChatDynamicCommand.field_l && (AccountCreationForm.field_V == null ||
                AccountCreationForm.field_V[KillerRules.field_f] == null)) {
                SocketArchiveNetworkClient.field_u = SocketArchiveNetworkClient.field_u - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (SocketArchiveNetworkClient.field_u >= QuickChatDynamicCommand.field_g &&
                  null == AccountCreationForm.field_V[(1 + KillerRules.field_f) % var2_int]) {
                  SocketArchiveNetworkClient.field_u = SocketArchiveNetworkClient.field_u - 1;
                }
              }
            }
            if (SocketArchiveNetworkClient.field_u >= QuickChatDynamicCommand.field_g) {
              SoundCache.field_b = KillerRules.field_f;
              SocketArchiveNetworkClient.field_u = SocketArchiveNetworkClient.field_u - QuickChatDynamicCommand.field_g;
              if (!InstructionsScreen.field_K) {
                KillerRules.field_f = KillerRules.field_f - 1;
                if (KillerRules.field_f < 0) {
                  KillerRules.field_f = KillerRules.field_f + var2_int;
                }
              } else {
                KillerRules.field_f = KillerRules.field_f + 1;
                if (KillerRules.field_f >= var2_int) {
                  KillerRules.field_f = KillerRules.field_f - var2_int;
                }
              }
            }
            if (SocketArchiveNetworkClient.field_u > QuickChatDynamicCommand.field_l) {
              InstructionsScreen.field_K = true;
            }
          }
          if (null != ContextMenu.field_Yb) {
            var3 = -(ContextMenu.field_Yb.field_y / 2) + 357;
            var4 = 0;
            if (0 != MatchingTextValidator.field_s &&
              UsernameAvailabilityValidator.field_o > var3 &&
              var3 + ContextMenu.field_Yb.field_A > UsernameAvailabilityValidator.field_o) {
              if (-ContextMenu.field_Yb.field_z + 269 < DialogLayer.field_W &&
                269 > DialogLayer.field_W) {
                InstructionsScreen.field_K = false;
                SocketArchiveNetworkClient.field_u = QuickChatDynamicCommand.field_g;
                var4 = 1;
              }
              if (586 < DialogLayer.field_W &&
                DialogLayer.field_W < 586 + ContextMenu.field_Yb.field_z) {
                var4 = 1;
                InstructionsScreen.field_K = true;
                SocketArchiveNetworkClient.field_u = QuickChatDynamicCommand.field_g;
              }
            }
            if (var4 == 0 &&
              QuickChatDynamicCommand.field_l < SocketArchiveNetworkClient.field_u &&
              DebouncedValidationProvider.field_f > var3 &&
              DebouncedValidationProvider.field_f < var3 + ContextMenu.field_Yb.field_A) {
              if (-ContextMenu.field_Yb.field_z + 269 < ReflectionReplySupport.field_i &&
                ReflectionReplySupport.field_i < 269) {
                SocketArchiveNetworkClient.field_u = QuickChatDynamicCommand.field_l;
              }
              if (586 < ReflectionReplySupport.field_i &&
                ReflectionReplySupport.field_i < 586 + ContextMenu.field_Yb.field_z) {
                SocketArchiveNetworkClient.field_u = QuickChatDynamicCommand.field_l;
              }
            }
          }
          if (!inputEnabled) {
            return 0;
          }
          AppletUrlSupport.field_j.updatePointerSelection(ReflectionCheck.hitTestMembershipButtons((byte) -82, DialogLayer.field_W, UsernameAvailabilityValidator.field_o), ReflectionCheck.hitTestMembershipButtons((byte) -21, ReflectionReplySupport.field_i, DebouncedValidationProvider.field_f), obfuscationGuard - 192);
          if (AppletUrlSupport.field_j.isPressActivated((byte) 62)) {
            if (AppletUrlSupport.field_j.selectedIndex == 0) {
              stackIn_60_0 = 3;
              return stackIn_60_0;
            }
            if (AppletUrlSupport.field_j.selectedIndex == 1) {
              stackIn_64_0 = 2;
              return stackIn_64_0;
            }
          }
          while (true) {
            if (!LabeledChildWidget.pollKeyEvent(127)) {
              stackIn_81_0 = 0;
              return stackIn_81_0;
            }
            AppletUrlSupport.field_j.navigateHorizontal(true, 0);
            if (AppletUrlSupport.field_j.isPressActivated((byte) 101)) {
              if (AppletUrlSupport.field_j.selectedIndex == 0) {
                stackIn_71_0 = 3;
                return stackIn_71_0;
              }
              if (AppletUrlSupport.field_j.selectedIndex == 1) {
                stackIn_75_0 = 1;
                return stackIn_75_0;
              }
            }
            if (IterableDualLinkDeque.field_a != 13) {
              continue;
            }
            break;
          }
          stackIn_79_0 = 1;
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "fd.Q(" + inputEnabled + ',' + obfuscationGuard + ')');
        }
    }

    final static void flushReflectionReplies(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        try {
          var1 = JaggrabDownloader.field_j;
          if (obfuscationGuard <= 117) {
            return;
          }
          while (MultiHandleSliderWidget.g((byte) -120)) {
            var1.writeCipheredOpcode(false, 8);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            ReflectionReplySupport.writeReflectionCheckReplies(var1, 1);
            JaggrabDownloader.field_j.writeByteLengthPrefix(var1.position - var2, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "fd.G(" + obfuscationGuard + ')');
        }
    }

    StrongCacheEntry(Object param0, int param1) {
        super(param1);
        try {
          this.value = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void sortPairedArrays(int[] keys, int[] values, byte obfuscationGuard) {
        try {
          ChatInputSupport.quickSortRange(0, obfuscationGuard ^ 30966, keys, values, keys.length - 1);
          if (obfuscationGuard != -54) {
            int[] var4 = (int[]) null;
            StrongCacheEntry.sortPairedArrays((int[]) null, (int[]) null, (byte) -96);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fd.R(" + (keys != null ? "{...}" : "null") + ',' + (values != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final boolean isReferenceBacked(int param0) {
        if (param0 >= -16) {
          StrongCacheEntry.releaseStatics(-107);
          return false;
        }
        return false;
    }

    final static void blendHalfColorSpan(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        try {
          if (param4 != 2) {
            var8 = (int[]) null;
            StrongCacheEntry.sortPairedArrays((int[]) null, (int[]) null, (byte) -8);
          }
          param3--;
          while (param3 >= 0) {
            var9 = param0;
            var5 = var9;
            var6 = param2;
            var7 = param1;
            var9[var6] = var7 + ArchiveLoadSequence.bitwiseAnd(8355711, var9[var6] >> 1);
            param2++;
            param3--;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_9_0 = var5_ref;
          stackIn_9_1 = new StringBuilder().append("fd.S(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final Object getValue(byte param0) {
        if (param0 <= 119) {
          return (Object) null;
        }
        return this.value;
    }

    static {
        muXDeclinedInvite = "<%0> has declined the invitation.";
        field_O = 0;
        tutorialOptionEightBall = "Eight-ball";
        field_J = 360;
        playerListAreOfferingDraw = "<%0> all want to draw.";
        mouseoveranicon = "Mouse over an icon for details";
        field_I = 0;
    }
}
