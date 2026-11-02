/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialWidget extends InteractiveWidget {
    static int field_O;
    static ClientUiComponent field_P;
    int stepCount;
    int radius;
    int markedStep;
    int centerOffsetX;
    int currentStep;
    int centerOffsetY;
    static String field_T;

    final boolean pointerPressed(int pointerX, int originX, int originY, int obfuscationGuard, Widget rootWidget, int pointerY, int button) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!super.pointerPressed(pointerX, originX, originY, 120, rootWidget, pointerY, button)) {
            if (obfuscationGuard >= 103) {
              return false;
            }
            field_O = 36;
            return false;
          }
          var8_int = pointerX + (-this.x + (-originX - this.centerOffsetX));
          var9 = pointerY - this.centerOffsetY + (-this.y - originY);
          if (var8_int * var8_int + var9 * var9 < this.radius * this.radius) {
            var10 = Math.atan2((double)var9, (double)var8_int) - BattleCharacter.field_b;
            if (!(0.0 > var10)) {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.stepCount;
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)this.stepCount;
            }
            this.currentStep = (int)((double)this.stepCount * var10 / 6.283185307179586);
            while (this.currentStep >= this.stepCount) {
              this.currentStep = this.currentStep - this.stepCount;
            }
            while (this.currentStep < 0) {
              this.currentStep = this.currentStep + this.stepCount;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("ws.NA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(pointerY).append(',').append(button).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          SummonRequest.a((byte) 52, NetworkGameShell.field_y, 6);
          SummonRequest.a((byte) 33, UnitAnimationPreview.field_r, 26);
          MoveEvent.tutorialLayout.setTopY(MoveEvent.tutorialLayout.getTopY(26, (byte) -107) + 30, 26, (byte) 126);
          SummonRequest.a((byte) 111, pu.field_B, 8);
          SummonRequest.a((byte) 67, UnitAnimationPreview.field_r, 27);
          MoveEvent.tutorialLayout.setTopY(30 + MoveEvent.tutorialLayout.getTopY(27, (byte) -126), 27, (byte) 125);
          SummonRequest.a((byte) 78, UnitAnimationPreview.field_r, 28);
          MoveEvent.tutorialLayout.setTopY(MoveEvent.tutorialLayout.getTopY(28, (byte) -122) + 30, 28, (byte) 120);
          SummonRequest.a((byte) 45, pu.field_B, 9);
          if (!QuickChatPhraseRepository.a(27875)) {
            SummonRequest.a((byte) 54, ScreenWipeTransition.field_b, 1);
            SummonRequest.a((byte) 91, GameEvent.field_t, 24);
            SummonRequest.a((byte) 101, FriendRequestSupport.field_f, 17);
            SummonRequest.a((byte) 39, ClientConnectionState.field_i, 3);
            SummonRequest.a((byte) 78, AnimationFrameSet.field_D, 4);
            DisplacedUnitMarker.field_t[40] = ByteArrayPoolSupport.field_f;
          }
          return;
        }
        field_P = (ClientUiComponent) null;
        SummonRequest.a((byte) 52, NetworkGameShell.field_y, 6);
        SummonRequest.a((byte) 33, UnitAnimationPreview.field_r, 26);
        MoveEvent.tutorialLayout.setTopY(MoveEvent.tutorialLayout.getTopY(26, (byte) -107) + 30, 26, (byte) 126);
        SummonRequest.a((byte) 111, pu.field_B, 8);
        SummonRequest.a((byte) 67, UnitAnimationPreview.field_r, 27);
        MoveEvent.tutorialLayout.setTopY(30 + MoveEvent.tutorialLayout.getTopY(27, (byte) -126), 27, (byte) 125);
        SummonRequest.a((byte) 78, UnitAnimationPreview.field_r, 28);
        MoveEvent.tutorialLayout.setTopY(MoveEvent.tutorialLayout.getTopY(28, (byte) -122) + 30, 28, (byte) 120);
        SummonRequest.a((byte) 45, pu.field_B, 9);
        if (!QuickChatPhraseRepository.a(27875)) {
          SummonRequest.a((byte) 54, ScreenWipeTransition.field_b, 1);
          SummonRequest.a((byte) 91, GameEvent.field_t, 24);
          SummonRequest.a((byte) 101, FriendRequestSupport.field_f, 17);
          SummonRequest.a((byte) 39, ClientConnectionState.field_i, 3);
          SummonRequest.a((byte) 78, AnimationFrameSet.field_D, 4);
          DisplacedUnitMarker.field_t[40] = ByteArrayPoolSupport.field_f;
        }
    }

    final static void openServerListPage(java.applet.Applet applet, int obfuscationGuard) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          java.applet.Applet var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (obfuscationGuard > -122) {
                var3 = (java.applet.Applet) null;
                DialWidget.openServerListPage((java.applet.Applet) null, -54);
              }
              var2 = new java.net.URL(applet.getCodeBase(), "toserverlist.ws");
              applet.getAppletContext().showDocument(StructureTerrainSupport.a(-3780, var2, applet), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("ws.A(");
            if (applet == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int obfuscationGuard) {
        field_P = null;
        if (obfuscationGuard < 124) {
          field_P = (ClientUiComponent) null;
          field_T = null;
          return;
        }
        field_T = null;
    }

    private DialWidget() throws Throwable {
        throw new Error();
    }

    static {
        field_O = 0;
        field_T = "Players: <%0>/<%1>";
    }
}
