/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends IntrusiveNode {
    static String[] quickchatShortcutHelp;
    int field_l;
    static int field_m;
    int field_n;

    final static void drawDottedRectangle(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Pool.field_O;
        try {
          if (param4 != 2187) {
            return;
          }
          var5_int = param3 + param2;
          var6 = param0 + param1;
          if (param3 > SoftwareRasterizer.clipLeft) {
            stackIn_6_0 = param3;
          } else {
            stackIn_6_0 = SoftwareRasterizer.clipLeft;
          }
          var7 = stackIn_6_0;
          if (param0 > SoftwareRasterizer.clipTop) {
            stackIn_9_0 = param0;
          } else {
            stackIn_9_0 = SoftwareRasterizer.clipTop;
          }
          var8 = stackIn_9_0;
          if (SoftwareRasterizer.clipRight > var5_int) {
            stackIn_12_0 = var5_int;
          } else {
            stackIn_12_0 = SoftwareRasterizer.clipRight;
          }
          var9 = stackIn_12_0;
          if (var6 >= SoftwareRasterizer.clipBottom) {
            stackIn_15_0 = SoftwareRasterizer.clipBottom;
          } else {
            stackIn_15_0 = var6;
          }
          var10 = stackIn_15_0;
          if (SoftwareRasterizer.clipLeft <= param3 &&
            param3 < SoftwareRasterizer.clipRight) {
            var11 = var8 * SoftwareRasterizer.width + param3;
            var12 = var10 + (1 - var8) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11] = 16777215;
              var11 = var11 + 2 * SoftwareRasterizer.width;
            }
          }
          if (param0 >= SoftwareRasterizer.clipTop &&
            var6 < SoftwareRasterizer.clipBottom) {
            var11Lifetime1 = SoftwareRasterizer.width * param0 + var7;
            var12Lifetime1 = 1 + (var9 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= SoftwareRasterizer.clipLeft &&
            SoftwareRasterizer.clipRight > var5_int) {
            var11Lifetime2 = var5_int + SoftwareRasterizer.width * (var8 + (1 & -param3 + var5_int));
            var12Lifetime2 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * SoftwareRasterizer.width;
            }
          }
          if (param0 >= SoftwareRasterizer.clipTop &&
            var6 < SoftwareRasterizer.clipBottom) {
            var11Lifetime3 = SoftwareRasterizer.width * var6 + var7 + (1 & -param0 + var6);
            var12Lifetime3 = -var7 + 1 + var9 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              SoftwareRasterizer.pixels[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var5), "bj.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 != 1) {
          return false;
        }
        return ChatMessageLine.field_o;
    }

    public static void a(int param0) {
        quickchatShortcutHelp = null;
        if (param0 != -4303) {
          bj.c(-44);
        }
    }

    private bj() throws Throwable {
        throw new Error();
    }

    static {
        quickchatShortcutHelp = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
