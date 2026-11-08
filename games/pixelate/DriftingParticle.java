/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DriftingParticle {
    private int field_f;
    private int field_b;
    private int field_h;
    static int field_d;
    private int field_a;
    private int field_g;
    private int field_e;
    static int field_i;
    static String[][] field_c;

    public static void clearStatics(byte param0) {
        field_c = (String[][]) null;
        if (param0 >= -110) {
          field_d = 127;
        }
    }

    final static int pollLegacyMenuSelection(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          var1_int = 0;
          while (DirectByteStorage.pollKeyEvent(107)) {
            VerticalScrollbar.field_Gb.handleVerticalNavigation((byte) -48);
            if (!VerticalScrollbar.field_Gb.isActivated(121)) {
              continue;
            }
            var1_int = 1;
          }
          VerticalScrollbar.field_Gb.updatePointer(NameAvailabilityValidator.messageMenuOptionAt(false, BufferedRandomAccessFile.field_a, ji.field_c), NameAvailabilityValidator.messageMenuOptionAt(false, ProxyAuthenticationException.field_d, StatusBar.field_k), -1);
          if (param0 != 2) {
            field_d = 101;
          }
          if (VerticalScrollbar.field_Gb.isActivated(117)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            VerticalScrollbar.field_Gb.selectedIndex >= 0) {
            var2 = di.field_b[VerticalScrollbar.field_Gb.selectedIndex];
            if (2 == var2) {
              un.clearPendingMessageFlag(true);
            }
          }
          stackIn_15_0 = var2;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1), "lp.A(" + param0 + ')');
        }
    }

    final void draw() {
        int var6 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int var1 = this.field_g >> 16;
        int var2 = this.field_b >> 16;
        int var3 = this.field_e;
        if (var1 < 0) {
          var3 = var3 - (0 - var1);
          var1 = 0;
        }
        if (var2 < 0) {
          var3 = var3 - (0 - var2);
          var2 = 0;
        }
        if (var1 + var3 > 640) {
          var3 = 640 - var1;
        }
        if (var2 + var3 > 480) {
          var3 = 480 - var2;
        }
        int var4 = 640 - var3;
        int var5 = var1 + var2 * 640;
        for (var6 = -var3; var6 < 0; var6++) {
          for (var7 = -var3; var7 < 0; var7++) {
            incrementValue$0 = var5;
            var5++;
            SoftwareRasterizer.field_k[incrementValue$0] = SoftwareRasterizer.field_k[incrementValue$0] + LobbyPlayer.field_Ob;
          }
          var5 = var5 + var4;
        }
    }

    final void tick(int param0) {
        this.field_g = this.field_g + this.field_h;
        this.field_b = this.field_b + this.field_a;
        if (41943040 < this.field_g) {
          this.field_g = -this.field_f;
        }
        if (31457280 < this.field_b) {
          this.field_b = -this.field_f;
        }
        if (-this.field_f > this.field_g) {
          this.field_g = 41943040;
        }
        if (param0 >= -72) {
          return;
        }
        if (this.field_b < -this.field_f) {
          this.field_b = 31457280;
        }
    }

    DriftingParticle() {
        this.field_g = JavaRandomHelpers.randomBelow(ea.field_b, -118, 640) << 16;
        this.field_b = JavaRandomHelpers.randomBelow(ea.field_b, -100, 480) << 16;
        this.field_e = JavaRandomHelpers.randomBelow(ea.field_b, -99, 90) + 10;
        this.field_h = -65536 + JavaRandomHelpers.randomBelow(ea.field_b, -111, 131072);
        this.field_a = -65536 + JavaRandomHelpers.randomBelow(ea.field_b, -123, 131072);
        this.field_f = this.field_e << 16;
    }

    static {
        field_d = of.toFixedPoint(0.9, 65536);
        field_c = new String[][]{new String[]{"Easy", "Medium", "Hard"}, new String[]{"", "", ""}};
    }
}
