/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityValidator extends TextFieldValidator {
    static Sprite[] viewIcons;
    private boolean field_s;
    static String field_r;
    private PasswordConfirmationValidator field_o;
    static float field_t;
    static String field_n;
    private String field_q;

    public static void releaseStatics(byte param0) {
        field_r = null;
        if (param0 >= -84) {
          EmailAvailabilityValidator.createDecodedSprites(false);
        }
        viewIcons = null;
        field_n = null;
    }

    final String describeText(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o.validationStateForText(param1, true) == GuestPlayHelpers.field_c) {
            stackIn_3_0 = this.field_o.describeText(param0 + 0, param1);
            return stackIn_3_0;
          }
          if (this.validationStateForText(param1, true) == GuestPlayHelpers.field_c) {
            stackIn_6_0 = PatchNoteUsage.field_g;
            return stackIn_6_0;
          }
          if (param0 != -26358) {
            EmailAvailabilityValidator.releaseStatics((byte) -2);
          }
          stackIn_10_0 = LoginCredentials.field_c;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kd.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void discardServerMessage(byte param0, String param1) {
        try {
          int var2_int = 32 / ((-65 - param0) / 43);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "kd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void drawThreeSliceBar(Sprite[] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Sprite[] var12 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != null &&
            0 < param3) {
            var6_int = param0[0].field_u;
            var7 = param0[2].field_u;
            var8 = param0[1].field_u;
            param0[0].drawRecoloredNeutral(param4, param1, param5);
            param0[2].drawRecoloredNeutral(param3 + param4 - var7, param1, param5);
            Rasterizer.saveClip(NetworkGameClient.field_m);
            Rasterizer.intersectClip(param4 + var6_int, param1, -var7 + (param4 + param3), param1 + param0[1].field_z);
            var9 = param4 + var6_int;
            var10 = param4 + (param3 - var7);
            for (param4 = var9; var10 > param4; param4 = param4 + var8) {
              param0[1].drawRecoloredNeutral(param4, param1, param5);
            }
            Rasterizer.restoreClip(NetworkGameClient.field_m);
            if (param2) {
              var12 = (Sprite[]) null;
              EmailAvailabilityValidator.drawThreeSliceBar((Sprite[]) null, 31, true, 51, -96, 109);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("kd.Q(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static Sprite[] createDecodedSprites(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Virogrid.field_F ? 1 : 0;
        Sprite[] var1 = new Sprite[MarkerSliderPainter.field_h];
        if (!param0) {
          return (Sprite[]) null;
        }
        for (var2 = 0; MarkerSliderPainter.field_h > var2; var2++) {
          var3 = Bzip2State.field_k[var2] * MarkerSlider.field_F[var2];
          var4 = CheckboxPainter.field_j[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = GameEntryHelpers.field_c[WidgetFactoryHelpers.bitAnd((int) var4[var6], 255)];
          }
          var1[var2] = new Sprite(QuickChatMenu.field_Kb, LobbyJoinTextGlobals.field_d, BufferedSocket.field_w[var2], ContentTransitionDialog.field_bb[var2], Bzip2State.field_k[var2], MarkerSlider.field_F[var2], var5);
        }
        PlayingSound.releaseDecodeArrays((byte) -28);
        return var1;
    }

    EmailAvailabilityValidator(EditableTextWidget param0, EditableTextWidget param1) {
        super(param0);
        this.field_s = false;
        this.field_q = "";
        try {
          this.field_o = new PasswordConfirmationValidator(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "kd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean pollIncomingPacket(int param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        DelayedPacket var4_ref_bj = null;
        int var4 = 0;
        DelayedPacket var5 = null;
        int var7 = 0;
        Sprite[] var8 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 > -117) {
            var8 = (Sprite[]) null;
            EmailAvailabilityValidator.drawThreeSliceBar((Sprite[]) null, -48, false, 30, 95, 36);
          }
          if (DigestHelpers.field_a != ClientServiceHelpers.field_c) {
            return false;
          }
          var2_long = ClockAndTextHelpers.monotonicMillis(-9986);
          if (AsyncCheckResult.field_e != 0 &&
            0 > InputSetupHelpers.field_g) {
            var4_ref_bj = (DelayedPacket) (ChatPanelUpdateHelpers.field_d.first((byte) -120));
            if (var4_ref_bj != null &&
              var2_long > var4_ref_bj.field_p) {
              var4_ref_bj.unlink(false);
              ArchiveProvider.field_a = var4_ref_bj.field_l.length;
              ProgressMessageDialog.field_qb.position = 0;
              for (var5_int = 0; ArchiveProvider.field_a > var5_int; var5_int++) {
                ProgressMessageDialog.field_qb.payload[var5_int] = var4_ref_bj.field_l[var5_int];
              }
              IndexedSpriteState.field_e = CredentialHelpers.field_c;
              CredentialHelpers.field_c = IntKeyLookup.field_b;
              IntKeyLookup.field_b = PasswordConfirmationValidator.field_q;
              PasswordConfirmationValidator.field_q = var4_ref_bj.field_i;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("kd.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
        stackIn_20_0 = InputSetupHelpers.field_g;
        try {
          while (true) {
            if (stackIn_20_0 < 0) {
              ProgressMessageDialog.field_qb.position = 0;
              if (!FrameSkin.fillIncomingBuffer(1, 0)) {
                return false;
              }
              InputSetupHelpers.field_g = ProgressMessageDialog.field_qb.readCipheredOpcode(false);
              ProgressMessageDialog.field_qb.position = 0;
              ArchiveProvider.field_a = param1[InputSetupHelpers.field_g];
            }
            if (!GameSession.isPacketPayloadReady((byte) 48)) {
              return false;
            }
            if (AsyncCheckResult.field_e == 0) {
              IndexedSpriteState.field_e = CredentialHelpers.field_c;
              CredentialHelpers.field_c = IntKeyLookup.field_b;
              IntKeyLookup.field_b = PasswordConfirmationValidator.field_q;
              PasswordConfirmationValidator.field_q = InputSetupHelpers.field_g;
              InputSetupHelpers.field_g = -1;
              return true;
            }
            var4 = AsyncCheckResult.field_e;
            if (0.0 != PacketRequestHelpers.field_b) {
              var4 = (int)((double)var4 + PopupInputHelpers.field_c.nextGaussian() * PacketRequestHelpers.field_b);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new DelayedPacket((long)var4 + var2_long, InputSetupHelpers.field_g, new byte[ArchiveProvider.field_a]);
            for (var6 = 0; ArchiveProvider.field_a > var6; var6++) {
              var5.field_l[var6] = ProgressMessageDialog.field_qb.payload[var6];
            }
            ChatPanelUpdateHelpers.field_d.addFirst(var5, (byte) -68);
            InputSetupHelpers.field_g = -1;
            stackIn_20_0 = InputSetupHelpers.field_g;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("kd.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final AudioSetupHelpers validationStateForText(String param0, boolean param1) {
        AsyncCheckResult var3 = null;
        RuntimeException var3_ref = null;
        AudioSetupHelpers stackIn_2_0 = null;
        AudioSetupHelpers stackIn_7_0 = null;
        AudioSetupHelpers stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o.validationStateForText(param0, param1) == GuestPlayHelpers.field_c) {
            stackIn_2_0 = GuestPlayHelpers.field_c;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_q)) {
            var3 = NetworkArchiveRequest.pollEmailAvailability(99, param0);
            if (!var3.isComplete(-114)) {
              stackIn_7_0 = ProxyAuthenticationRequiredException.field_d;
              return stackIn_7_0;
            }
            this.field_q = param0;
            this.field_s = var3.isAccepted((byte) -47);
          }
          if (this.field_s) {
            stackIn_12_0 = CachedTextLayout.field_i;
          } else {
            stackIn_12_0 = GuestPlayHelpers.field_c;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("kd.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_r = "Reject";
        field_n = "Macroing or use of bots";
    }
}
