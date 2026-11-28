/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationStatusIcon extends InteractiveWidget {
    static String field_Q;
    private int field_R;
    private FieldValidator field_S;
    static int[] field_P;
    static String field_T;

    public static void clearDeclaredStaticReferences(byte param0) {
        field_P = null;
        field_Q = null;
        if (param0 >= -67) {
          ValidationStatusIcon.clearDeclaredStaticReferences((byte) 0);
          field_T = null;
          return;
        }
        field_T = null;
    }

    final String getTooltipText(byte param0) {
        if (this.field_w) {
          return this.field_S.getValidationMessage((byte) 95);
        }
        if (param0 > -82) {
          field_Q = (String) null;
          return null;
        }
        return null;
    }

    final boolean takeFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 418) {
            return false;
          }
          this.field_R = 95;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ba.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static MouseWheelInput createMouseWheelInput(byte param0) {
        try {
          Throwable var1 = null;
          MouseWheelInput stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 < 102) {
              field_T = (String) null;
            }
            stackIn_3_0 = (MouseWheelInput) (Class.forName("MouseWheelHandler").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        try {
          this.field_R = this.field_R + 1;
          super.updatePointer(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ba.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void drawWidget(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        fi var8;
        int var9;
        int var10;
        int var11;
        RgbSprite var14;
        RgbSprite var15;
        RgbSprite var16;
        RgbSprite var17;
        RgbSprite var18;
        RgbSprite var20;
        RgbSprite var21;
        RgbSprite var22;
        int var5Lifetime1;
        int var6Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var9Lifetime2;
        int var10Lifetime2;
        fi var8Lifetime1;
        var11 = Confined.field_J ? 1 : 0;
        super.drawWidget(param0, param1, (byte) 54, param3);
        if (param1 != 0) {
          return;
        }
        if (param2 <= 36) {
          field_Q = (String) null;
          var5 = (this.field_F >> 1) + (this.field_q + param3);
          var6 = (this.field_z >> 1) + param0 + this.field_m;
          var8 = this.field_S.getValidationStatus(-3621);
          if (var8 == ab.field_b) {
            var15 = gg.field_q[0];
            var9 = var15.field_t << 1;
            var10 = var15.field_x << 1;
            if (FrameTimer.field_g != null &&
              FrameTimer.field_g.field_u >= var9 &&
              var10 <= FrameTimer.field_g.field_w) {
              vm.a(FrameTimer.field_g, -8409);
              SoftwareRasterizer.clearRaster();
            } else {
              FrameTimer.field_g = new RgbSprite(var9, var10);
              vm.a(FrameTimer.field_g, -8409);
            }
            var15.drawRotatedAbout(112, 144, var15.field_t << 4, var15.field_x << 4, -this.field_R << 10, 4096);
            StripedProgressWidget.b(false);
            FrameTimer.field_g.drawAdditive(var5 - var15.field_t, -var15.field_x + var6, 256);
            return;
          }
          if (qh.field_x != var8) {
            if (var8 == fb.field_e) {
              var17 = gg.field_q[2];
              var17.drawAdditive(-(var17.field_u >> 1) + var5, -(var17.field_w >> 1) + var6, 256);
              return;
            }
            if (var8 != TextHotspotBounds.field_q) {
              return;
            }
            var18 = gg.field_q[1];
            var18.drawAdditive(var5 - (var18.field_u >> 1), var6 - (var18.field_w >> 1), 256);
            return;
          }
          var16 = gg.field_q[0];
          var14 = var16;
          var9Lifetime2 = var16.field_t << 1;
          var10Lifetime2 = var16.field_x << 1;
          if (FrameTimer.field_g == null) {
            FrameTimer.field_g = new RgbSprite(var9Lifetime2, var10Lifetime2);
            vm.a(FrameTimer.field_g, -8409);
          } else {
            if (FrameTimer.field_g.field_u < var9Lifetime2) {
              FrameTimer.field_g = new RgbSprite(var9Lifetime2, var10Lifetime2);
              vm.a(FrameTimer.field_g, -8409);
            } else {
              if (var10Lifetime2 <= FrameTimer.field_g.field_w) {
                vm.a(FrameTimer.field_g, -8409);
                SoftwareRasterizer.clearRaster();
              } else {
                FrameTimer.field_g = new RgbSprite(var9Lifetime2, var10Lifetime2);
                vm.a(FrameTimer.field_g, -8409);
              }
            }
          }
          var16.drawRotatedAbout(112, 144, var16.field_t << 4, var16.field_x << 4, -this.field_R << 10, 4096);
          StripedProgressWidget.b(false);
          FrameTimer.field_g.drawAdditive(var5 - var16.field_t, -var16.field_x + var6, 256);
          return;
        }
        var5Lifetime1 = (this.field_F >> 1) + (this.field_q + param3);
        var6Lifetime1 = (this.field_z >> 1) + param0 + this.field_m;
        var8Lifetime1 = this.field_S.getValidationStatus(-3621);
        if (var8Lifetime1 != ab.field_b &&
          qh.field_x != var8Lifetime1) {
          if (var8Lifetime1 == fb.field_e) {
            var20 = gg.field_q[2];
            var20.drawAdditive(-(var20.field_u >> 1) + var5Lifetime1, -(var20.field_w >> 1) + var6Lifetime1, 256);
            return;
          }
          if (var8Lifetime1 != TextHotspotBounds.field_q) {
            return;
          }
          var21 = gg.field_q[1];
          var21.drawAdditive(var5Lifetime1 - (var21.field_u >> 1), var6Lifetime1 - (var21.field_w >> 1), 256);
          return;
        }
        var22 = gg.field_q[0];
        var9Lifetime1 = var22.field_t << 1;
        var10Lifetime1 = var22.field_x << 1;
        if (FrameTimer.field_g == null) {
          FrameTimer.field_g = new RgbSprite(var9Lifetime1, var10Lifetime1);
          vm.a(FrameTimer.field_g, -8409);
        } else {
          if (FrameTimer.field_g.field_u < var9Lifetime1) {
            FrameTimer.field_g = new RgbSprite(var9Lifetime1, var10Lifetime1);
            vm.a(FrameTimer.field_g, -8409);
          } else {
            if (var10Lifetime1 <= FrameTimer.field_g.field_w) {
              vm.a(FrameTimer.field_g, -8409);
              SoftwareRasterizer.clearRaster();
            } else {
              FrameTimer.field_g = new RgbSprite(var9Lifetime1, var10Lifetime1);
              vm.a(FrameTimer.field_g, -8409);
            }
          }
        }
        var22.drawRotatedAbout(112, 144, var22.field_t << 4, var22.field_x << 4, -this.field_R << 10, 4096);
        StripedProgressWidget.b(false);
        FrameTimer.field_g.drawAdditive(var5Lifetime1 - var22.field_t, -var22.field_x + var6Lifetime1, 256);
    }

    ValidationStatusIcon(FieldValidator param0) {
        try {
          this.field_S = param0;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Q = "Log in / Create account";
        field_T = "Your ship thrusts forwards automatically.";
        field_P = new int[8192];
    }
}
