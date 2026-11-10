/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DualLinkDeque {
    private DualLinkNode field_a;
    private DualLinkNode field_b;

    final DualLinkNode next(byte param0) {
        DualLinkNode var2 = this.field_b;
        if (var2 == this.field_a) {
          this.field_b = null;
          return null;
        }
        if (param0 >= 99) {
          this.field_b = var2.secondaryNext;
          return var2;
        }
        this.next((byte) 86);
        this.field_b = var2.secondaryNext;
        return var2;
    }

    final DualLinkNode removeFirst(int param0) {
        DualLinkNode var2 = this.field_a.secondaryNext;
        if (var2 != this.field_a) {
          var2.unlinkSecondary((byte) -50);
          int var3 = 111 / ((38 - param0) / 57);
          return var2;
        }
        return null;
    }

    final void addLast(DualLinkNode param0, byte param1) {
        try {
          if (null != param0.secondaryPrevious) {
            param0.unlinkSecondary((byte) -58);
          }
          param0.secondaryPrevious = this.field_a.secondaryPrevious;
          param0.secondaryNext = this.field_a;
          param0.secondaryPrevious.secondaryNext = param0;
          if (param1 > -89) {
            this.field_a = (DualLinkNode) null;
          }
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ra.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int parseDecimalInt(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 43 % ((param1 - 48) / 58);
          stackIn_1_0 = SpatialBucket.parseIntRadix(true, 5, param0, 10);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ra.J(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void handleSubmissionAcknowledgement(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        PendingFlagRequest var4_ref_df = null;
        PendingBytePayloadRequest var5 = null;
        int var5_int = 0;
        Object var6 = null;
        int var7 = 0;
        BitPacketBuffer var9 = null;
        byte[] var13 = null;
        var7 = ZombieDawn.field_J;
        try {
          var2 = 42 / ((-82 - param0) / 32);
          var9 = MatchingTextValidator.field_g;
          var3 = var9.readUnsignedByte((byte) -118);
          if (0 == var3) {
            var4_ref_df = (PendingFlagRequest) (SweepingSpotlight.field_D.last((byte) 26));
            if (var4_ref_df == null) {
              SessionSocketHelpers.closeSessionSocket(1);
              return;
            }
            var5_int = var9.readUnsignedByte((byte) -122);
            if (var5_int != 0) {
              var13 = new byte[var5_int];
              var9.readBytes(var5_int, 0, var13, 11240);
            } else {
              var6 = null;
            }
            var9.position = var9.position + 4;
            if (!var9.verifyCrc32((byte) -98)) {
              SessionSocketHelpers.closeSessionSocket(1);
              return;
            }
            var4_ref_df.field_k = true;
            var4_ref_df.unlink(-27598);
            return;
          }
          if (1 != var3) {
            ErrorReportHelpers.reportClientError((Throwable) null, 10331, "A1: " + VisualPropertyOverrides.describePacketHistory(3));
            SessionSocketHelpers.closeSessionSocket(1);
            return;
          }
          var4 = var9.readInt(-105);
          var5 = (PendingBytePayloadRequest) (BootstrapLoadingHelpers.field_a.last((byte) 26));
          while (var5 != null) {
            if (var4 != var5.field_k) {
              var5 = (PendingBytePayloadRequest) (BootstrapLoadingHelpers.field_a.previous(false));
              continue;
            }
            break;
          }
          if (var5 != null) {
            var5.unlink(-27598);
            return;
          }
          SessionSocketHelpers.closeSessionSocket(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "ra.F(" + param0 + ')');
        }
    }

    final int size(boolean param0) {
        int var4 = ZombieDawn.field_J;
        int var2 = 0;
        DualLinkNode var3 = this.field_a.secondaryNext;
        if (param0) {
          DualLinkDeque.getCurrentAccountName((byte) 21);
          while (this.field_a != var3) {
            var2++;
            var3 = var3.secondaryNext;
          }
          return var2;
        }
        while (this.field_a != var3) {
          var2++;
          var3 = var3.secondaryNext;
        }
        return var2;
    }

    final static void showScreenSizeDialog(byte param0) {
        int var1 = 118 / ((-2 - param0) / 33);
        QueuedByteRecord.initializeDialogLayer(false);
    }

    final static CoverageBitmapFont loadCoverageFont(Js5Archive param0, String param1, String param2, int param3, Js5Archive param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        CoverageBitmapFont stackIn_2_0 = null;
        CoverageBitmapFont stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param4.getGroupIdByName(param1, (byte) 8);
          if (param3 != 0) {
            stackIn_2_0 = (CoverageBitmapFont) null;
            return stackIn_2_0;
          }
          var6 = param4.getFileIdByName(var5_int, param2, true);
          stackIn_4_0 = BlastParticle.loadCoverageFont(var6, param0, var5_int, param4, param3 + 0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ra.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public DualLinkDeque() {
        this.field_a = new DualLinkNode();
        this.field_a.secondaryNext = this.field_a;
        this.field_a.secondaryPrevious = this.field_a;
    }

    final void clear(int param0) {
        DualLinkNode var5 = null;
        DualLinkNode var4 = null;
        int var3 = ZombieDawn.field_J;
        if (param0 < 37) {
          this.field_b = (DualLinkNode) null;
          while (true) {
            var5 = this.field_a.secondaryNext;
            if (this.field_a == var5) {
              break;
            }
            var5.unlinkSecondary((byte) -122);
          }
          this.field_b = null;
          return;
        }
        while (true) {
          var4 = this.field_a.secondaryNext;
          if (this.field_a == var4) {
            break;
          }
          var4.unlinkSecondary((byte) -122);
        }
        this.field_b = null;
    }

    final DualLinkNode first(byte param0) {
        DualLinkNode var2 = this.field_a.secondaryNext;
        if (param0 != 34) {
          this.field_a = (DualLinkNode) null;
          if (this.field_a == var2) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.secondaryNext;
          return var2;
        }
        if (this.field_a == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.secondaryNext;
        return var2;
    }

    final static String getCurrentAccountName(byte param0) {
        if (AccountCreationForm.field_F == SpriteFadeHelpers.field_c) {
          return IntroSpeedHelpers.field_d;
        }
        if (!FocusDelegatingButton.field_E.isComplete(112)) {
          return FocusDelegatingButton.field_E.getName(0);
        }
        if (NameCheckRequest.field_a == SpriteFadeHelpers.field_c) {
          return FocusDelegatingButton.field_E.getName(0);
        }
        if (param0 < -12) {
          return GameLoopApplet.field_B;
        }
        DualLinkDeque.getCurrentAccountName((byte) 66);
        return GameLoopApplet.field_B;
    }

    static {
    }
}
