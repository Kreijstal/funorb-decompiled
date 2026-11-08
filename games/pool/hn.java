/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hn {
    static int field_b;
    static LoginPayload field_c;
    static double field_a;

    public static void releaseStatics(int param0) {
        if (param0 != 11) {
          hn.fillScreenWhite(-88);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static String formatCookieDate(long param0, boolean param1) {
        DebugOverlayLayoutSupport.field_b.setTime(new Date(param0));
        int var3 = DebugOverlayLayoutSupport.field_b.get(7);
        int var4 = DebugOverlayLayoutSupport.field_b.get(5);
        int var5 = DebugOverlayLayoutSupport.field_b.get(2);
        int var6 = DebugOverlayLayoutSupport.field_b.get(1);
        int var7 = DebugOverlayLayoutSupport.field_b.get(11);
        int var8 = DebugOverlayLayoutSupport.field_b.get(12);
        int var9 = DebugOverlayLayoutSupport.field_b.get(13);
        if (!param1) {
          return kc.field_a[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + AimTarget.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        field_c = (LoginPayload) null;
        return kc.field_a[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + AimTarget.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final static AlphaFont loadAlphaFont(ResourceArchive param0, String param1, String param2, int param3, ResourceArchive param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        AlphaFont stackIn_2_0 = null;
        AlphaFont stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -25154) {
            stackIn_2_0 = (AlphaFont) null;
            return stackIn_2_0;
          }
          var5_int = param4.getGroupId(param1, -1);
          var6 = param4.getFileId(var5_int, 0, param2);
          stackIn_4_0 = DelegatingCanvas.a(param4, var6, var5_int, param0, param3 ^ -890);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("hn.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void fillScreenWhite(int param0) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$10 = 0;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        ResourceArchive var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Pool.field_O;
        try {
          if (param0 != -3143) {
            var4 = (ResourceArchive) null;
            hn.loadAlphaFont((ResourceArchive) null, (String) null, (String) null, 35, (ResourceArchive) null);
          }
          var1_int = 0;
          var2 = -7 + SoftwareRasterizer.width * SoftwareRasterizer.height;
          while (var1_int < var2) {
            incrementValue$11 = var1_int;
            var1_int++;
            SoftwareRasterizer.pixels[incrementValue$11] = -1;
            incrementValue$12 = var1_int;
            var1_int++;
            SoftwareRasterizer.pixels[incrementValue$12] = -1;
            incrementValue$13 = var1_int;
            var1_int++;
            SoftwareRasterizer.pixels[incrementValue$13] = -1;
            incrementValue$14 = var1_int;
            var1_int++;
            SoftwareRasterizer.pixels[incrementValue$14] = -1;
            incrementValue$15 = var1_int;
            var1_int++;
            SoftwareRasterizer.pixels[incrementValue$15] = -1;
            incrementValue$16 = var1_int;
            var1_int++;
            SoftwareRasterizer.pixels[incrementValue$16] = -1;
            incrementValue$17 = var1_int;
            var1_int++;
            SoftwareRasterizer.pixels[incrementValue$17] = -1;
            incrementValue$18 = var1_int;
            var1_int++;
            SoftwareRasterizer.pixels[incrementValue$18] = -1;
          }
          var2 += 7;
          while (var2 > var1_int) {
            incrementValue$10 = var1_int;
            var1_int++;
            SoftwareRasterizer.pixels[incrementValue$10] = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "hn.C(" + param0 + ')');
        }
    }

    static {
        field_c = null;
        field_b = 0;
        field_a = 0.0;
    }
}
