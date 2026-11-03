/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterSnapshot extends IntrusiveNode {
    static int field_u;
    static String cannotPositionCueThere;
    static AccountContentDialog field_n;
    int clipTop;
    int width;
    static int field_o;
    int height;
    static UiComponent field_w;
    int clipLeft;
    int clipRight;
    int clipBottom;
    int[] pixels;

    final static void a(PoolMatchController param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ShotRecord var6 = null;
        ShotRecord var7 = null;
        try {
          var6 = param0.gameModel.currentShot(param1 + 16848);
          var7 = var6;
          if (param1 != -16813) {
            field_w = (UiComponent) null;
          }
          var3 = param0.isLocalPlayersTurn(-1) ? 1 : 0;
          if ((TutorialController.field_c & param0.modeFlags) != 0) {
            stackIn_8_0 = (var3 != 0) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var4 = stackIn_8_0;
          if ((TutorialController.field_c & param0.modeFlags) != 0) {
            stackIn_14_0 = (var3 == 0) ? 1 : 0;
          } else {
            stackIn_14_0 = 1;
          }
          var5 = stackIn_14_0;
          if (var4 != 0 &&
            var7.c(true)) {
            ArchiveLoadSequence.a(AccountWelcomePanel.substituteTemplateArguments(new String[]{param0.gameModel.field_h[var6.playerIndex]}, -1, AgeValidator.whichGroupDoYouWant), dq.field_a.groupName((byte) 99, 1), dq.field_a.groupName((byte) 120, 0), 40, 2, 1);
            return;
          }
          if (var4 != 0 &&
            var7.a(-110)) {
            ArchiveLoadSequence.a(AccountWelcomePanel.substituteTemplateArguments(new String[]{param0.gameModel.field_h[var6.playerIndex]}, -1, ml.wouldYouLikeToPlayOrPass), rl.decisionButtonPass, ImageProducerRasterBuffer.decisionButtonPlay, param1 + 16877, 16, 8);
            return;
          }
          if (var5 != 0) {
            if (!var7.c((byte) 91)) {
              return;
            }
            ArchiveLoadSequence.a(AccountWelcomePanel.substituteTemplateArguments(new String[]{param0.gameModel.field_h[(1 + var7.playerIndex) % param0.gameModel.playerCount]}, -1, ml.wouldYouLikeToPlayOrPass), rl.decisionButtonPass, ImageProducerRasterBuffer.decisionButtonPlay, -122, 64, 32);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("tn.C(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setRasterState(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7) {
        try {
          this.clipLeft = param2;
          this.height = param1;
          this.clipRight = param5;
          this.width = param0;
          this.clipTop = param7;
          this.clipBottom = param3;
          this.pixels = param6;
          if (param4 > -42) {
            int[] var10 = (int[]) null;
            this.setRasterState(-126, -20, -108, -2, -31, -56, (int[]) null, -107);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "tn.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        cannotPositionCueThere = null;
        field_w = null;
        if (param0 <= 4) {
          return;
        }
        field_n = null;
    }

    RasterSnapshot() {
    }

    static {
        cannotPositionCueThere = "Cannot put the cue there! Try raising it.";
        field_u = 0;
    }
}
