/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RadialSelectorWidget extends FocusableWidget {
    int centerY;
    int sectorCount;
    int radius;
    static String field_V;
    static PacketBuffer field_N;
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
        field_N = null;
        field_P = null;
        field_S = null;
        if (param0 >= 89) {
          emailLoginKind = null;
          field_T = null;
          field_Y = null;
          return;
        }
        RadialSelectorWidget.h(64);
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

    final static int h(int param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var1_int = 0;
          while (jl.pollKeyEvent((byte) 5)) {
            ArcticBackground.field_r.navigateVertical(param0 - 1);
            if (!ArcticBackground.field_r.isActivated((byte) 113)) {
              continue;
            }
            var1_int = 1;
          }
          ArcticBackground.field_r.updatePointer(aj.a(param0 + param0, ResourcePreparationEntry.pointerY, MusicPatch.pointerX), param0 ^ 27479, aj.a(0, PlayerNameChooserPanel.pressY, LoadingProgressDialog.pressX));
          if (ArcticBackground.field_r.isActivated((byte) 113)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            ArcticBackground.field_r.selectedIndex >= 0) {
            var2 = ButtonWidgetRenderer.field_A[ArcticBackground.field_r.selectedIndex];
            if (var2 == 2) {
              DualLinkIterator.b((byte) 99);
            }
          }
          stackIn_14_0 = var2;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "vh.B(" + param0 + ')');
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
