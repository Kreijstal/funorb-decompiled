/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityValidator extends TextInputValidator {
    static String ballsetUsa8Group0;
    private boolean cachedEmailAvailable;
    static String muChatInvisibleAndSilentMode;
    private String cachedEmailCandidate;
    static ResourceArchive field_r;
    static int field_o;
    static int field_s;
    static Sprite field_p;
    static so field_y;
    static String gameoptInviteplayersOrTrychanging1;
    static int field_x;
    private MatchingTextValidator emailMatchValidator;
    static int field_n;

    final static IndexedSprite[] h(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        IndexedSprite[] var1 = new IndexedSprite[wf.field_d];
        for (var2 = param0; wf.field_d > var2; var2++) {
          var1[var2] = new IndexedSprite(DialRenderer.field_c, tq.field_r, AchievementsScreen.field_I[var2], ih.field_d[var2], LinkButtonPainter.field_a[var2], rc.field_f[var2], LimitedRandomAccessFile.field_b[var2], IntrusiveNode.field_h);
        }
        OpacityWidget.h(-1);
        return var1;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1) {
            stackIn_2_0 = -80;
            return stackIn_2_0;
          }
          var3_int = 1;
          while (param0 > 1) {
            if ((param0 & 1) != 0) {
              var3_int = var3_int * param1;
            }
            param1 = param1 * param1;
            param0 = param0 >> 1;
          }
          if (param0 != 1) {
            stackIn_13_0 = var3_int;
            return stackIn_13_0;
          }
          stackIn_11_0 = var3_int * param1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "me.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ij a(int param0, int param1) {
        IntrusiveDequeCursor var2;
        ij var3;
        int var4;
        var4 = Pool.field_O;
        if (param0 != -2) {
          return (ij) null;
        }
        var2 = new IntrusiveDequeCursor(MarkerSliderPainter.field_i);
        var3 = (ij) (var2.last((byte) -92));
        while (var3 != null) {
          if (param1 == var3.field_m) {
            return var3;
          }
          var3 = (ij) (var2.previous(-86));
        }
        return null;
    }

    final static void b(int param0, int param1) {
        CipherPacketBuffer var2 = JaggrabDownloader.field_j;
        var2.writeCipheredOpcode(false, param1);
        var2.a(1, false);
        var2.a(3, false);
        int var3 = 22 / ((-52 - param0) / 62);
    }

    public static void b(boolean param0) {
        field_r = null;
        field_p = null;
        field_y = null;
        ballsetUsa8Group0 = null;
        muChatInvisibleAndSilentMode = null;
        if (param0) {
          gameoptInviteplayersOrTrychanging1 = null;
          return;
        }
        field_r = (ResourceArchive) null;
        gameoptInviteplayersOrTrychanging1 = null;
    }

    EmailAvailabilityValidator(TextInputWidget param0, TextInputWidget param1) {
        super(param0);
        this.cachedEmailCandidate = "";
        this.cachedEmailAvailable = false;
        try {
          this.emailMatchValidator = new MatchingTextValidator(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final na validationStateForText(String param0, boolean param1) {
        qr var3 = null;
        RuntimeException var3_ref = null;
        na stackIn_3_0 = null;
        na stackIn_8_0 = null;
        na stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.emailMatchValidator.validationStateForText(param0, param1) == gp.field_d) {
            stackIn_3_0 = gp.field_d;
            return stackIn_3_0;
          }
          if (!param0.equals(this.cachedEmailCandidate)) {
            var3 = AccountCreationForm.b((byte) -25, param0);
            if (!var3.a(80)) {
              stackIn_8_0 = Js5Transport.field_k;
              return stackIn_8_0;
            }
            this.cachedEmailCandidate = param0;
            this.cachedEmailAvailable = var3.b((byte) -74);
          }
          if (!this.cachedEmailAvailable) {
            stackIn_13_0 = gp.field_d;
          } else {
            stackIn_13_0 = ProxySocketConnector.field_e;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("me.K(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final String validationMessageForText(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.emailMatchValidator.validationStateForText(param0, true) == gp.field_d) {
            stackIn_2_0 = this.emailMatchValidator.validationMessageForText(param0, 0);
            return stackIn_2_0;
          }
          if (this.validationStateForText(param0, true) == gp.field_d) {
            stackIn_5_0 = Quaternion.createAlertEmailUnavailable;
            return stackIn_5_0;
          }
          if (param1 != 0) {
            EmailAvailabilityValidator.a(-101, -109);
          }
          stackIn_9_0 = NodeHashTableIterator.createEmailvalid;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("me.L(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        ballsetUsa8Group0 = "Spots";
        muChatInvisibleAndSilentMode = "Hide private chat and appear offline to friends";
        gameoptInviteplayersOrTrychanging1 = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_o = 0;
        field_s = field_o;
    }
}
