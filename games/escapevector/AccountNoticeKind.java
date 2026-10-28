/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNoticeKind {
    static int frameworkLoadingStage;

    final static void advanceIntroClock(boolean guard) {
        if (SocketConnector.field_d == 0 - NodeHashTableIterator.field_h) {
          SocketConnector.field_d = SocketConnector.field_d + 1;
          if (guard) {
            return;
          }
          AccountNoticeKind.sinQ16(74, -19);
          return;
        }
        if (SocketConnector.field_d != 250 - NodeHashTableIterator.field_h) {
          SocketConnector.field_d = SocketConnector.field_d + 1;
          if (guard) {
            return;
          }
          AccountNoticeKind.sinQ16(74, -19);
          return;
        }
        SocketConnector.field_d = SocketConnector.field_d + 1;
        if (guard) {
          return;
        }
        AccountNoticeKind.sinQ16(74, -19);
    }

    final static void resetAccountFlow(int guard) {
        SavedDataQuery.field_i = false;
        if (guard == 3161) {
          DialWidget.field_H = false;
          WhirlpoolHasher.a(-1, guard - 3109);
          dn.field_q = RasterBuffer.field_g;
          MeshMaterial.field_b = RasterBuffer.field_g;
          return;
        }
        frameworkLoadingStage = -26;
        DialWidget.field_H = false;
        WhirlpoolHasher.a(-1, guard - 3109);
        dn.field_q = RasterBuffer.field_g;
        MeshMaterial.field_b = RasterBuffer.field_g;
    }

    final static void drawAnimatedPanelFrame(int phase, int left, int right, int bottom, boolean gradient, int guard, boolean snapToGrid, int lightColor, int darkColor, int style, int top, boolean doubleBorder) {
        if (snapToGrid) {
          left = 2 - SocketJs5Transport.floorDivideByPositive(6, false, -left + 2) * 6;
          right = 3 + 6 * SocketJs5Transport.floorDivideByPositive(6, false, -2 + (right - 1));
          top = -(6 * SocketJs5Transport.floorDivideByPositive(6, false, 0 - top)) + 0;
          bottom = 1 + SocketJs5Transport.floorDivideByPositive(6, false, bottom - 1) * 6;
        }
        if (guard != 29788) {
          frameworkLoadingStage = -100;
          if (!gradient ||
            phase >= 16) {
            SoftwareRasterizer.fillRectangle(1 + left, 1 + top, -2 + (right - left), bottom - top - 2, 0);
            AccountMessagePanel.drawUnevenFrame(darkColor, right, lightColor, style, top, -29, left, bottom, phase);
            if (doubleBorder) {
              AccountMessagePanel.drawUnevenFrame(darkColor, -3 + right, lightColor, -1, 3 + top, -88, left + 3, bottom - 3, phase);
            }
            return;
          }
          int var12 = 66049 * (16 - phase);
          int var13 = 986895 & 330245 * (-phase + 16) >> 4;
          int var14 = left;
          int var15 = top;
          int var16 = right;
          int var17 = bottom;
          if (doubleBorder) {
            SoftwareRasterizer.fillRectangle(left + 1, top + 1, -2 + right - left, 3, 0);
            SoftwareRasterizer.fillRectangle(1 + left, 4 + top, 3, bottom + (-top - 8), 0);
            SoftwareRasterizer.fillRectangle(right - 4, top + 4, 3, bottom - top - 8, 0);
            var14 += 3;
            var15 += 3;
            var17 -= 3;
            var16 -= 3;
            SoftwareRasterizer.fillRectangle(1 + left, -4 + bottom, right - left - 2, 3, 0);
          } else {
            SoftwareRasterizer.fillVerticalGradient(var14 + 1, var15 + 1, var16 + (-var14 - 2), -2 + (-var15 + var17), var12, var13);
            AccountMessagePanel.drawUnevenFrame(darkColor, right, lightColor, style, top, -29, left, bottom, phase);
            if (doubleBorder) {
              AccountMessagePanel.drawUnevenFrame(darkColor, -3 + right, lightColor, -1, 3 + top, -88, left + 3, bottom - 3, phase);
            }
            return;
          }
          SoftwareRasterizer.fillVerticalGradient(var14 + 1, var15 + 1, var16 + (-var14 - 2), -2 + (-var15 + var17), var12, var13);
          AccountMessagePanel.drawUnevenFrame(darkColor, right, lightColor, style, top, -29, left, bottom, phase);
          if (doubleBorder) {
            AccountMessagePanel.drawUnevenFrame(darkColor, -3 + right, lightColor, -1, 3 + top, -88, left + 3, bottom - 3, phase);
          }
          return;
        }
        if (!gradient) {
          SoftwareRasterizer.fillRectangle(1 + left, 1 + top, -2 + (right - left), bottom - top - 2, 0);
          AccountMessagePanel.drawUnevenFrame(darkColor, right, lightColor, style, top, -29, left, bottom, phase);
          if (doubleBorder) {
            AccountMessagePanel.drawUnevenFrame(darkColor, -3 + right, lightColor, -1, 3 + top, -88, left + 3, bottom - 3, phase);
          }
          return;
        }
        if (phase >= 16) {
          SoftwareRasterizer.fillRectangle(1 + left, 1 + top, -2 + (right - left), bottom - top - 2, 0);
          AccountMessagePanel.drawUnevenFrame(darkColor, right, lightColor, style, top, -29, left, bottom, phase);
          if (doubleBorder) {
            AccountMessagePanel.drawUnevenFrame(darkColor, -3 + right, lightColor, -1, 3 + top, -88, left + 3, bottom - 3, phase);
          }
          return;
        }
        int var12Lifetime1 = 66049 * (16 - phase);
        int var13Lifetime1 = 986895 & 330245 * (-phase + 16) >> 4;
        int var14Lifetime1 = left;
        int var15Lifetime1 = top;
        int var16Lifetime1 = right;
        int var17Lifetime1 = bottom;
        if (doubleBorder) {
          SoftwareRasterizer.fillRectangle(left + 1, top + 1, -2 + right - left, 3, 0);
          SoftwareRasterizer.fillRectangle(1 + left, 4 + top, 3, bottom + (-top - 8), 0);
          SoftwareRasterizer.fillRectangle(right - 4, top + 4, 3, bottom - top - 8, 0);
          var14Lifetime1 += 3;
          var15Lifetime1 += 3;
          var17Lifetime1 -= 3;
          var16Lifetime1 -= 3;
          SoftwareRasterizer.fillRectangle(1 + left, -4 + bottom, right - left - 2, 3, 0);
        } else {
          SoftwareRasterizer.fillVerticalGradient(var14Lifetime1 + 1, var15Lifetime1 + 1, var16Lifetime1 + (-var14Lifetime1 - 2), -2 + (-var15Lifetime1 + var17Lifetime1), var12Lifetime1, var13Lifetime1);
          AccountMessagePanel.drawUnevenFrame(darkColor, right, lightColor, style, top, -29, left, bottom, phase);
          if (doubleBorder) {
            AccountMessagePanel.drawUnevenFrame(darkColor, -3 + right, lightColor, -1, 3 + top, -88, left + 3, bottom - 3, phase);
          }
          return;
        }
        SoftwareRasterizer.fillVerticalGradient(var14Lifetime1 + 1, var15Lifetime1 + 1, var16Lifetime1 + (-var14Lifetime1 - 2), -2 + (-var15Lifetime1 + var17Lifetime1), var12Lifetime1, var13Lifetime1);
        AccountMessagePanel.drawUnevenFrame(darkColor, right, lightColor, style, top, -29, left, bottom, phase);
        if (doubleBorder) {
          AccountMessagePanel.drawUnevenFrame(darkColor, -3 + right, lightColor, -1, 3 + top, -88, left + 3, bottom - 3, phase);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static NameAvailabilityResult createBooleanResponse(boolean value, byte guard) {
        NameAvailabilityResult var2 = new NameAvailabilityResult(true);
        if (guard <= -39) {
          var2.field_e = value ? true : false;
          return var2;
        }
        return (NameAvailabilityResult) null;
    }

    final static int sinQ16(int guard, int angle) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (guard == 10758) {
          angle = angle & 8191;
          if (angle < 4096) {
            if (angle >= 2048) {
              stackIn_19_0 = PasswordFieldPainter.field_t[-angle + 4096];
            } else {
              stackIn_19_0 = PasswordFieldPainter.field_t[angle];
            }
            return stackIn_19_0;
          }
          if (angle >= 6144) {
            stackIn_15_0 = -PasswordFieldPainter.field_t[-angle + 8192];
          } else {
            stackIn_15_0 = -PasswordFieldPainter.field_t[angle - 4096];
          }
          return stackIn_15_0;
        }
        AccountNoticeKind.sinQ16(-66, 52);
        angle = angle & 8191;
        if (angle < 4096) {
          if (angle >= 2048) {
            stackIn_9_0 = PasswordFieldPainter.field_t[-angle + 4096];
          } else {
            stackIn_9_0 = PasswordFieldPainter.field_t[angle];
          }
          return stackIn_9_0;
        }
        if (angle >= 6144) {
          stackIn_5_0 = -PasswordFieldPainter.field_t[-angle + 8192];
        } else {
          stackIn_5_0 = -PasswordFieldPainter.field_t[angle - 4096];
        }
        return stackIn_5_0;
    }

    static {
    }
}
