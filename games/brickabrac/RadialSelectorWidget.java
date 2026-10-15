/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RadialSelectorWidget extends FocusableWidget {
    int centerY;
    int sectorCount;
    int radius;
    static String field_V;
    static PacketBuffer encryptedPayloadScratch;
    static boolean field_L;
    int markedSector;
    static LoginCredentialKind emailLoginKind;
    static String field_T;
    static ResourceArchive field_S;
    int centerX;
    static String field_P;
    static String field_Y;
    static int decodedRankingWins;
    int selectedSector;
    static String field_M;

    public static void a(int param0) {
        field_V = null;
        field_M = null;
        encryptedPayloadScratch = null;
        field_P = null;
        field_S = null;
        if (param0 >= 89) {
          emailLoginKind = null;
          field_T = null;
          field_Y = null;
          return;
        }
        RadialSelectorWidget.pollTextChoiceDialog(64);
        emailLoginKind = null;
        field_T = null;
        field_Y = null;
    }

    final boolean handlePointerPress(Widget focusRoot, int pointerX, int parentX, int parentY, int button, int pointerY, int obfuscationGuard) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!super.handlePointerPress(focusRoot, pointerX, parentX, parentY, button, pointerY, obfuscationGuard)) {
            return false;
          }
          var8_int = pointerX + (-this.x - parentX) - this.centerX;
          var9 = -parentY - this.y - this.centerY + pointerY;
          if (var8_int * var8_int + var9 * var9 >= this.radius * this.radius) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - hh.field_d;
          if (!(0.0 > var10)) {
            if (0.0 < var10) {
              var10 = var10 + 3.141592653589793 / (double)this.sectorCount;
            }
          } else {
            var10 = var10 - 3.141592653589793 / (double)this.sectorCount;
          }
          this.selectedSector = (int)(var10 * (double)this.sectorCount / 6.283185307179586);
          while (this.sectorCount <= this.selectedSector) {
            this.selectedSector = this.selectedSector - this.sectorCount;
          }
          while (this.selectedSector < 0) {
            this.selectedSector = this.selectedSector + this.sectorCount;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("vh.MA(");
          if (focusRoot == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(pointerX).append(',').append(parentX).append(',').append(parentY).append(',').append(button).append(',').append(pointerY).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int pollTextChoiceDialog(int obfuscationGuard) {
        int activated = 0;
        int unusedClientFlag = 0;
        int returnedResult = 0;
        RuntimeException caughtFailure = null;
        RuntimeException inputFailure = null;
        int resultCode = 0;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        try {
          activated = 0;
          while (jl.pollKeyEvent((byte) 5)) {
            ArcticBackground.textChoiceSelection.navigateVertical(obfuscationGuard - 1);
            if (!ArcticBackground.textChoiceSelection.isActivated((byte) 113)) {
              continue;
            }
            activated = 1;
          }
          ArcticBackground.textChoiceSelection.updatePointer(TextChoiceDialogHitTest.hitTestTextChoiceDialog(obfuscationGuard + obfuscationGuard, ResourcePreparationEntry.pointerY, MusicPatch.pointerX), obfuscationGuard ^ 27479, TextChoiceDialogHitTest.hitTestTextChoiceDialog(0, PlayerNameChooserPanel.pressY, LoadingProgressDialog.pressX));
          if (ArcticBackground.textChoiceSelection.isActivated((byte) 113)) {
            activated = 1;
          }
          resultCode = 0;
          if (activated != 0 &&
            ArcticBackground.textChoiceSelection.selectedIndex >= 0) {
            resultCode = ButtonWidgetRenderer.textChoiceResultCodes[ArcticBackground.textChoiceSelection.selectedIndex];
            if (resultCode == 2) {
              DualLinkIterator.closeTextChoiceDialog((byte) 99);
            }
          }
          returnedResult = resultCode;
          return returnedResult;
        } catch (java.lang.RuntimeException caughtInputFailure) {
          caughtFailure = caughtInputFailure;
          inputFailure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) inputFailure), "vh.B(" + obfuscationGuard + ')');
        }
    }

    final static void a(int param0, byte param1, String param2, String[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = 25 % ((param1 + 25) / 49);
          IntrusiveHashIterator.field_g = StatefulWidgetRenderer.field_v;
          if (param0 != 255) {
            if (param0 < 100) {
              StateIconLabel.field_Rb = AchievementIcon.a(param0, -126, param2);
              return;
            }
            if (param0 > 105) {
              StateIconLabel.field_Rb = AchievementIcon.a(param0, -126, param2);
              return;
            }
            StateIconLabel.field_Rb = IntKeyIndex.a(-2079, param3);
            return;
          }
          stackIn_4_0 = true;
          stackIn_5_1 = !(Paddle.field_x >= 13);
          StateIconLabel.field_Rb = LoginCredentialKind.a(stackIn_4_0, stackIn_5_1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("vh.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private RadialSelectorWidget() throws Throwable {
        throw new Error();
    }

    static {
        field_V = "Sticky: any balls that hit the paddle stick to it";
        field_T = "Basic Bricks";
        emailLoginKind = new LoginCredentialKind(3);
        field_Y = "Report abuse";
        field_P = "Waiting for fonts";
        field_M = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
