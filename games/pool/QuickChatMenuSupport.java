/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatMenuSupport {
    static int field_b;
    static String tutorialLoseEightBallGame;
    static Sprite[] field_c;
    static UiComponent field_e;
    static long field_d;

    final static void createQuickChatMenu(BitmapFont param0, boolean param1, ResourceArchive param2) {
        int var8 = 0;
        ResourceArchive stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        QuickChatCategoryDefinition var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        BitmapFont var12 = null;
        int[] var16 = null;
        var9 = Pool.field_O;
        try {
          var3_int = ProgressBarWidget.field_S;
          e.field_a = new UiComponent(0L, (UiComponent) null);
          if (param2 == null) {
            var10 = (Throwable) null;
            GrowableIntList.reportClientError((Throwable) null, "QC1", -8555);
            return;
          }
          stackIn_7_0 = (ResourceArchive) (param2);
          stackIn_8_1 = (param1);
          stackIn_7_0.field_i = stackIn_8_1;
          param2.field_k = 0;
          DisplayNamePanel.field_N = new QuickChatCategoryCache(var3_int, param2, param2);
          UiComponentNode.field_x = new QuickChatPhraseRegistry(var3_int, param2, param2, new wp());
          var4 = TranslatedUiText.c(2);
          if (var4 == null) {
            var11 = (Throwable) null;
            GrowableIntList.reportClientError((Throwable) null, "QC2", -8555);
            return;
          }
          gp.a((byte) 58, var4);
          var12 = (BitmapFont) null;
          tp.field_i = MouseWheelInput.createFramedLabel(1127256, 0, 0, 4020342, 1513239, 65793, 5138823, 1513239, 65793, (BitmapFont) null, 8947848, 2245737, 65793);
          CushionSegment.field_c = MouseWheelInput.createFramedLabel(0, 0, 16764006, 0, 0, 0, 0, 0, 0, param0, 0, 0, 0);
          LoginRequiredScreen.field_J = MouseWheelInput.createFramedLabel(0, 0, 16777215, 0, 0, 0, 0, 0, 0, param0, 0, 0, 0);
          var5 = SoftwareRasterizer.width;
          var6 = SoftwareRasterizer.height;
          var16 = SoftwareRasterizer.pixels;
          ue.field_c = new Sprite(10, 14);
          ue.field_c.bindAsRenderTarget();
          for (var8 = 2; var8 < 7; var8++) {
            SoftwareRasterizer.drawVerticalLine(var8, var8 + 1, 14 - (var8 << 1), 16777215);
          }
          SoftwareRasterizer.setTarget(var16, var5, var6);
          w.field_b = NanoTickClock.a(LoginRequiredScreen.field_J, CushionSegment.field_c, var4, tp.field_i, (byte) 112);
          e.field_a.children = new IntrusiveDeque();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("c.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static int reverseBits(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 0;
          var4 = -31 % ((param2 + 32) / 54);
          while (0 < param1) {
            var3_int = var3_int << 1 | 1 & param0;
            param0 = param0 >>> 1;
            param1--;
          }
          stackIn_4_0 = var3_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "c.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8, int param9, int param10) {
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        if (0 == param10 &&
          param4 == 0) {
          return -1;
        }
        if (param9 == param1) {
          return QuickChatPhraseRegistry.a(param7, param9, param0, param5, param6, param3, param10, param2, param4, 98);
        }
        if (param7 == param3) {
          return TutorialFactory.a(param3, param6, (byte) -112, param2, param10, param5, param0, param9, param4, param1);
        }
        if (param8 != 98) {
          return -7;
        }
        var11 = -param9 + param1;
        var12 = -param3 + param7;
        var13 = var12;
        var14 = -var11;
        var15 = rf.inverseSquareRoot(NameEntryPopup.a(var13, false, var13) + NameEntryPopup.a(var14, false, var14), -128);
        if (0L < FullscreenFocusCanvas.multiplyFixedChecked((long)var13, (long)param10, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var14, (long)param4, false)) {
          param9 = param9 - ArchiveProvider.divideFixed16(var15, (byte) -73, (long)(var13 * param6));
          param3 = param3 - ArchiveProvider.divideFixed16(var15, (byte) -90, (long)(var14 * param6));
        } else {
          param9 = param9 + ArchiveProvider.divideFixed16(var15, (byte) -95, (long)(var13 * param6));
          param3 = param3 + ArchiveProvider.divideFixed16(var15, (byte) -111, (long)(param6 * var14));
        }
        var16 = NameEntryPopup.a(var11, false, param4) - NameEntryPopup.a(var12, false, param10);
        if (var16 == 0) {
          return -1;
        }
        var17 = ArchiveProvider.divideFixed16(var16, (byte) -82, (long)(NameEntryPopup.a(var12, false, param5 - param9) - NameEntryPopup.a(var11, false, -param3 + param2)));
        if (var17 > 0 &&
          var17 <= -param0 + 65536) {
          var18 = ArchiveProvider.divideFixed16(var11, (byte) -110, (long)(-param9 + param5 + NameEntryPopup.a(var17, false, param10)));
          if (var18 >= 0 &&
            var18 <= 65536) {
            return var17 + param0;
          }
        }
        return -1;
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        tutorialLoseEightBallGame = null;
        if (param0 != -13679) {
          return;
        }
        field_c = null;
    }

    static {
        tutorialLoseEightBallGame = "You potted the 8 ball illegally. I will re-spot it for you so you can continue.";
    }
}
