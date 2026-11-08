/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BoardAnimator {
    byte[] field_k;
    static String field_i;
    byte[] field_f;
    private GameBoard field_b;
    int field_h;
    private int field_a;
    static Sprite[] field_c;
    IntrusiveDeque field_g;
    int field_l;
    PendingMove field_d;
    byte[] field_e;
    int field_m;
    static int field_j;

    final static int nextBoundedRandom(Random param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 0) {
            throw new IllegalArgumentException();
          }
          if (CheckboxWidget.isPowerOfTwoOrZero((byte) -127, param2)) {
            stackIn_4_0 = (int)(((long)param0.nextInt() & 4294967295L) * (long)param2 >> 32);
            return stackIn_4_0;
          }
          var3_int = -2147483648 - (int)(4294967296L % (long)param2);
          if (param1 <= 71) {
            BoardAnimator.sendGameOptionSelection(-15, -7);
          }
          do {
            var4 = param0.nextInt();
          } while (var3_int <= var4);
          stackIn_10_0 = HighscoreQuery.floorMod(var4, 13309, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("l.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void findWinningLines(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        var9 = TetraLink.field_J;
        this.field_f = new byte[6];
        for (var3 = 0; var3 < 4; var3++) {
          var4 = (byte)(15 << var3);
          for (var2 = 0; 6 > var2; var2++) {
            if (~(var4 & this.field_e[var2]) == ~var4) {
              this.field_f[var2] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2], var4);
              this.field_h = 0;
            }
            if (var4 == (var4 & this.field_k[var2])) {
              this.field_f[var2] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2], var4);
              this.field_h = 1;
            }
          }
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < 7; var3Lifetime1++) {
          var4Lifetime1 = (byte)(1 << var3Lifetime1);
          for (var2Lifetime1 = 0; var2Lifetime1 < 3; var2Lifetime1++) {
            if (~var4Lifetime1 == ~(var4Lifetime1 & this.field_e[var2Lifetime1]) &&
              var4Lifetime1 == (this.field_e[1 + var2Lifetime1] & var4Lifetime1) &&
              var4Lifetime1 == (this.field_e[var2Lifetime1 + 2] & var4Lifetime1) &&
              (this.field_e[var2Lifetime1 + 3] & var4Lifetime1) == var4Lifetime1) {
              this.field_f[var2Lifetime1] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime1], var4Lifetime1);
              this.field_f[var2Lifetime1 + 1] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime1 + 1], var4Lifetime1);
              this.field_f[var2Lifetime1 + 2] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime1 + 2], var4Lifetime1);
              this.field_f[3 + var2Lifetime1] = (byte)IntrusiveNode.bitOr((int) this.field_f[3 + var2Lifetime1], var4Lifetime1);
              this.field_h = 0;
            }
            if (var4Lifetime1 == (var4Lifetime1 & this.field_k[var2Lifetime1]) &&
              var4Lifetime1 == (this.field_k[var2Lifetime1 + 1] & var4Lifetime1) &&
              var4Lifetime1 == (this.field_k[var2Lifetime1 + 2] & var4Lifetime1) &&
              var4Lifetime1 == (this.field_k[3 + var2Lifetime1] & var4Lifetime1)) {
              this.field_f[var2Lifetime1] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime1], var4Lifetime1);
              this.field_f[1 + var2Lifetime1] = (byte)IntrusiveNode.bitOr((int) this.field_f[1 + var2Lifetime1], var4Lifetime1);
              this.field_f[2 + var2Lifetime1] = (byte)IntrusiveNode.bitOr((int) this.field_f[2 + var2Lifetime1], var4Lifetime1);
              this.field_f[3 + var2Lifetime1] = (byte)IntrusiveNode.bitOr((int) this.field_f[3 + var2Lifetime1], var4Lifetime1);
              this.field_h = 1;
            }
          }
        }
        for (var3Lifetime2 = 0; var3Lifetime2 < 4; var3Lifetime2++) {
          var4Lifetime2 = (byte)(1 << var3Lifetime2);
          var5 = (byte)(2 << var3Lifetime2);
          var6 = (byte)(4 << var3Lifetime2);
          var7 = (byte)(8 << var3Lifetime2);
          for (var2Lifetime2 = 0; var2Lifetime2 < 3; var2Lifetime2++) {
            if (~var4Lifetime2 == ~(this.field_e[var2Lifetime2] & var4Lifetime2) &&
              var5 == (var5 & this.field_e[var2Lifetime2 + 1]) &&
              var6 == (this.field_e[2 + var2Lifetime2] & var6) &&
              var7 == (this.field_e[var2Lifetime2 + 3] & var7)) {
              this.field_f[var2Lifetime2] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime2], var4Lifetime2);
              this.field_f[1 + var2Lifetime2] = (byte)IntrusiveNode.bitOr((int) this.field_f[1 + var2Lifetime2], var5);
              this.field_f[var2Lifetime2 + 2] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime2 + 2], var6);
              this.field_f[3 + var2Lifetime2] = (byte)IntrusiveNode.bitOr((int) this.field_f[3 + var2Lifetime2], var7);
              this.field_h = 0;
            }
            if (var7 == (this.field_e[var2Lifetime2] & var7) &&
              var6 == (this.field_e[1 + var2Lifetime2] & var6) &&
              (var5 & this.field_e[var2Lifetime2 + 2]) == var5 &&
              var4Lifetime2 == (this.field_e[var2Lifetime2 + 3] & var4Lifetime2)) {
              this.field_f[var2Lifetime2] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime2], var7);
              this.field_f[var2Lifetime2 + 1] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime2 + 1], var6);
              this.field_f[var2Lifetime2 + 2] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime2 + 2], var5);
              this.field_f[var2Lifetime2 + 3] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime2 + 3], var4Lifetime2);
              this.field_h = 0;
            }
            if (var4Lifetime2 == (var4Lifetime2 & this.field_k[var2Lifetime2]) &&
              (var5 & this.field_k[var2Lifetime2 + 1]) == var5 &&
              (var6 & this.field_k[var2Lifetime2 + 2]) == var6 &&
              (this.field_k[3 + var2Lifetime2] & var7) == var7) {
              this.field_f[var2Lifetime2] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime2], var4Lifetime2);
              this.field_f[1 + var2Lifetime2] = (byte)IntrusiveNode.bitOr((int) this.field_f[1 + var2Lifetime2], var5);
              this.field_f[2 + var2Lifetime2] = (byte)IntrusiveNode.bitOr((int) this.field_f[2 + var2Lifetime2], var6);
              this.field_f[var2Lifetime2 + 3] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime2 + 3], var7);
              this.field_h = 1;
            }
            if (var7 == (var7 & this.field_k[var2Lifetime2]) &&
              var6 == (this.field_k[1 + var2Lifetime2] & var6) &&
              var5 == (var5 & this.field_k[var2Lifetime2 + 2]) &&
              (this.field_k[3 + var2Lifetime2] & var4Lifetime2) == var4Lifetime2) {
              this.field_f[var2Lifetime2] = (byte)IntrusiveNode.bitOr((int) this.field_f[var2Lifetime2], var7);
              this.field_f[1 + var2Lifetime2] = (byte)IntrusiveNode.bitOr((int) this.field_f[1 + var2Lifetime2], var6);
              this.field_f[2 + var2Lifetime2] = (byte)IntrusiveNode.bitOr((int) this.field_f[2 + var2Lifetime2], var5);
              this.field_f[3 + var2Lifetime2] = (byte)IntrusiveNode.bitOr((int) this.field_f[3 + var2Lifetime2], var4Lifetime2);
              this.field_h = 1;
            }
          }
        }
        var8 = -98 % ((32 - param0) / 39);
        if (this.field_h == -1) {
          this.field_f = null;
        }
    }

    final static boolean handleChatShortcutKey(int param0, int param1, int param2) {
        if (param2 > -63) {
          field_j = -41;
        }
        int var3 = null != GameKeyHandler.field_a ? 1 : 0;
        if (9 == WidgetStyleLayer.field_e &&
          AccountCreationDialog.canSendQuickChat(ContentTransitionDialog.field_jb, SocialListPacketHandler.field_b, GrowableIntList.field_h, (byte) -86, MessageDialogContent.field_N)) {
          if (SocialListPacketHandler.field_b != 2 &&
            var3 != 0) {
            return false;
          }
          return AccountServerResult.openPrivateQuickChat(ContentTransitionDialog.field_jb, GrowableIntList.field_h, MessageDialogContent.field_N, 108, SocialListPacketHandler.field_b);
        }
        if (WidgetStyleLayer.field_e == 10) {
          if (var3 != 0) {
            return false;
          }
          GameBoard.switchToPublicChat(-20715);
          return true;
        }
        if (WidgetStyleLayer.field_e == 11) {
          if (!TextHighlightSpan.field_u) {
            return false;
          }
          if (DualLinkNodeHashTable.field_h == 2 &&
            !DisplayMode.isFriendOnline((byte) 127, ReflectionCheckHelpers.field_j, CaptionedContainer.field_N)) {
            return false;
          }
          if (DualLinkNodeHashTable.field_h != 2 &&
            var3 != 0) {
            return false;
          }
          if (ModelMergeHelpers.tryAcquireChatSendPermit((byte) -46)) {
            String var4 = (String) null;
            CameraAndChatHelpers.writeChatMessagePacket(-3, RasterStackHelpers.field_g, param0, ReflectionCheckHelpers.field_j, DualLinkNodeHashTable.field_h, (String) null);
          }
          return true;
        }
        return false;
    }

    final static void startAudioOutputs(java.awt.Component param0, int param1, MidiPcmStream param2, int param3, boolean param4, PlatformTaskDispatcher param5) {
        try {
          ArchiveRequest.initializeAudioOutputs(param4, param0, param1, param5, param2, param3, (byte) 127, param1);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "l.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void resetToBoard(int param0) {
        int var2 = 0;
        int var3 = TetraLink.field_J;
        for (var2 = 0; var2 < 6; var2++) {
          this.field_e[var2] = this.field_b.field_p[var2];
          this.field_k[var2] = this.field_b.field_e[var2];
        }
        this.field_d = null;
        this.field_g.clear(1);
        this.findWinningLines(115);
        this.setHoverColumn(this.field_l, (byte) -96);
        if (param0 <= 12) {
          this.field_f = (byte[]) null;
        }
    }

    final void advanceDropAnimations(int param0) {
        PieceDropAnimation var2;
        int var3;
        int var4;
        var4 = TetraLink.field_J;
        var2 = (PieceDropAnimation) (this.field_g.first(false));
        while (var2 != null) {
          var3 = var2.field_q;
          if (var3 != 0) {
            if (var3 == 1) {
              var2.field_s = var2.field_s + 4;
              if (28 < var2.field_s) {
                var2.field_q = 2;
                var2.field_s = 28;
              }
            } else {
              if (var3 == 2) {
                var2.field_s = var2.field_s - 3;
                var2.field_y = var2.field_y - 40;
                if (var2.field_s < 0 &&
                  var2.field_y < 0) {
                  DateOfBirthPanel.playSample(LobbyResourceHelpers.field_a[ModelMergeHelpers.nextRandomInt(5, 1692)], 573509761);
                  var3 = 1 << var2.field_u;
                  if (var2.field_x) {
                    this.field_e[var2.field_n] = (byte)IntrusiveNode.bitOr((int) this.field_e[var2.field_n], var3);
                  } else {
                    this.field_k[var2.field_n] = (byte)IntrusiveNode.bitOr((int) this.field_k[var2.field_n], var3);
                  }
                  var2.unlink(false);
                  this.findWinningLines(-85);
                }
                if (var2.field_y < 0) {
                  var2.field_y = 0;
                }
                if (var2.field_s < 0) {
                  var2.field_s = 0;
                }
              }
            }
          } else {
            var2.field_y = var2.field_y + 40;
            if (var2.field_y <= 300 - 60 * var2.field_n) {
              var2 = (PieceDropAnimation) (this.field_g.next((byte) -70));
              continue;
            }
            var2.field_y = 300 - 60 * var2.field_n;
            var2.field_q = 1;
          }
          var2 = (PieceDropAnimation) (this.field_g.next((byte) -70));
        }
        if (param0 <= 72) {
          this.queueNewPieceAnimations((byte) 43);
        }
    }

    private final boolean hasDropAnimationAt(boolean param0, int param1, int param2, int param3) {
        int var6 = TetraLink.field_J;
        if (param3 != -14933) {
          this.field_m = 52;
        }
        PieceDropAnimation var5 = (PieceDropAnimation) (this.field_g.first(false));
        while (var5 != null) {
          if ((!var5.field_x ? 1 : 0) != (param0 ? 1 : 0) &&
            param2 == var5.field_n &&
            param1 == var5.field_u) {
            return true;
          }
          var5 = (PieceDropAnimation) (this.field_g.next((byte) -70));
        }
        return false;
    }

    final void queueNewPieceAnimations(byte param0) {
        int var2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var4Lifetime1;
        int var5Lifetime1;
        var7 = TetraLink.field_J;
        for (var2 = 0; var2 < 6; var2++) {
          boolean decompiledFrameRemainder0 = true;
          var3 = this.field_b.field_p[var2] ^ this.field_e[var2];
          if (var3 != 0) {
            if (0 != (var3 & this.field_e[var2])) {
              this.field_e[var2] = this.field_b.field_p[var2];
              decompiledFrameRemainder0 = false;
            }
            else {
              for (var4 = 0; 7 > var4; var4++) {
                var5 = 1 << var4;
                if ((var3 & var5) != 0 &&
                  !this.hasDropAnimationAt(true, var4, var2, -14933)) {
                  if (this.field_a == 0 &&
                    this.isPendingMoveAt((byte) -75, var4, var2)) {
                    this.field_g.addLast(new PieceDropAnimation(this.field_d, true), false);
                    this.field_d = null;
                  } else {
                    this.field_g.addLast(new PieceDropAnimation(var2, var4, true), false);
                    DateOfBirthPanel.playSample(MenuThemeHelpers.field_a[ModelMergeHelpers.nextRandomInt(5, 1692)], 573509761);
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            var4Lifetime1 = this.field_k[var2] ^ this.field_b.field_e[var2];
            if (var4Lifetime1 != 0) {
              if (0 == (this.field_k[var2] & var4Lifetime1)) {
                for (var5Lifetime1 = 0; var5Lifetime1 < 7; var5Lifetime1++) {
                  var6 = 1 << var5Lifetime1;
                  if ((var6 & var4Lifetime1) != 0 &&
                    !this.hasDropAnimationAt(false, var5Lifetime1, var2, param0 ^ -14957)) {
                    if (this.field_a == 1 &&
                      this.isPendingMoveAt((byte) -75, var5Lifetime1, var2)) {
                      this.field_g.addLast(new PieceDropAnimation(this.field_d, false), false);
                      this.field_d = null;
                    } else {
                      this.field_g.addLast(new PieceDropAnimation(var2, var5Lifetime1, false), false);
                      DateOfBirthPanel.playSample(MenuThemeHelpers.field_a[ModelMergeHelpers.nextRandomInt(5, 1692)], param0 ^ 573509817);
                    }
                  }
                }
              } else {
                this.field_k[var2] = this.field_b.field_e[var2];
              }
            }
          }
        }
        if (param0 != 56) {
          return;
        }
        this.setHoverColumn(this.field_l, (byte) -96);
    }

    final static void setFeatureFlagMask(int param0) {
        RasterStackHelpers.field_a = param0;
    }

    final static void sendGameOptionSelection(int param0, int param1) {
        BitPacketBuffer var2 = QuickChatHelpDialog.field_Lb;
        var2.writeCipheredByte(param1, (byte) -92);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(2, false);
        var2.writeBytes(0, 128, PendingSubmission.field_o, PendingSubmission.field_o.length);
        var2.writeByte(Js5ArchiveManager.field_c, false);
        var2.writeByte(QuickChatCategory.field_A, false);
        var2.writeBytes(param0, param0 + 128, StringPadHelpers.field_a, StringPadHelpers.field_a.length);
        var2.backpatchByteLength(var2.position - var3, -2);
    }

    public static void releaseStatics(int param0) {
        field_i = null;
        int var1 = 118 % ((param0 + 38) / 43);
        field_c = null;
    }

    private final boolean isPendingMoveAt(byte param0, int param1, int param2) {
        PlatformTaskDispatcher var5;
        boolean stackIn_7_0 = false;
        if (param0 != -75) {
          var5 = (PlatformTaskDispatcher) null;
          BoardAnimator.startAudioOutputs((java.awt.Component) null, 34, (MidiPcmStream) null, 1, false, (PlatformTaskDispatcher) null);
        }
        stackIn_7_0 = (this.field_d != null) && (this.field_d.field_b == param2) && (this.field_d.field_f == param1);
        return stackIn_7_0;
    }

    final void setHoverColumn(int param0, byte param1) {
        if (param1 != -96) {
          this.field_h = -98;
        }
        this.field_l = param0;
        int dupTemp$0 = this.field_b.findDropRow(param0, (byte) 101);
        this.field_m = dupTemp$0;
        if (dupTemp$0 == -1) {
          this.field_l = -1;
        }
    }

    BoardAnimator(GameBoard param0, int param1) {
        try {
          this.field_a = param1;
          this.field_l = -1;
          this.field_b = param0;
          this.field_g = new IntrusiveDeque();
          this.field_k = new byte[6];
          this.field_h = -1;
          this.field_f = null;
          this.field_e = new byte[6];
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_i = "Add <%0> to friend list";
    }
}
