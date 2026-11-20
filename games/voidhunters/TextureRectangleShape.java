/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class TextureRectangleShape extends TextureRasterShape {
    private int right;
    private int left;
    private int top;
    static String field_j;
    private int bottom;

    final static void readFileInto(File param0, int param1, byte[] param2, byte param3) throws IOException {
        DataInputStream var4 = null;
        try {
          var4 = new DataInputStream((InputStream) ((Object) new BufferedInputStream((InputStream) ((Object) new FileInputStream(param0)))));
          try {
            var4.readFully(param2, 0, param1);
          } catch (EOFException eOFException) {
          }
          if (param3 != 119) {
            field_j = (String) null;
          }
          var4.close();
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "dib.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var4Lifetime1;
        if (param0 <= 49) {
          String var5 = (String) null;
          TextureRectangleShape.getCachedConsoleTokens((String) null, 68);
          if (param2 >= 256) {
            return param1;
          }
          if (param2 <= 0) {
            return param3;
          }
          var4 = 256 - param2;
          return (16711935 & var4 * (param3 & 16711935) + param2 * (16711935 & param1) >>> 8) + (-16711936 & ((-16711855 & param1) >>> 8) * param2 + ((param3 & -16711919) >>> 8) * var4);
        }
        if (param2 >= 256) {
          return param1;
        }
        if (param2 <= 0) {
          return param3;
        }
        var4Lifetime1 = 256 - param2;
        return (16711935 & var4Lifetime1 * (param3 & 16711935) + param2 * (16711935 & param1) >>> 8) + (-16711936 & ((-16711855 & param1) >>> 8) * param2 + ((param3 & -16711919) >>> 8) * var4Lifetime1);
    }

    TextureRectangleShape(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.left = param0;
        this.right = param2;
        this.top = param1;
        this.bottom = param3;
    }

    final static ConsoleExpressionToken[] getCachedConsoleTokens(String param0, int param1) {
        int incrementValue$1 = 0;
        IntrusiveDeque var2 = null;
        RuntimeException var2_ref = null;
        ConsoleExpressionToken[] var3 = null;
        int var4 = 0;
        ConsoleExpressionToken var5 = null;
        int var6 = 0;
        ConsoleExpressionToken[] stackIn_4_0 = null;
        ConsoleExpressionToken[] stackIn_7_0 = null;
        ConsoleExpressionToken[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0.equals(GetMissilesExplosionPower.field_o)) {
            stackIn_4_0 = SetUseModels.field_q;
            return stackIn_4_0;
          }
          var2 = SetDebrisGroupColour.tokenizeConsole(-1, param0);
          var3 = new ConsoleExpressionToken[var2.size(3)];
          var4 = 0;
          var5 = (ConsoleExpressionToken) (var2.first(0));
          if (param1 < 32) {
            stackIn_7_0 = (ConsoleExpressionToken[]) null;
            return stackIn_7_0;
          }
          while (var5 != null) {
            incrementValue$1 = var4;
            var4++;
            var3[incrementValue$1] = var5;
            var5 = (ConsoleExpressionToken) (var2.next((byte) 82));
          }
          SetUseModels.field_q = var3;
          GetMissilesExplosionPower.field_o = param0;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_14_0 = var2_ref;
          stackIn_14_1 = new StringBuilder().append("dib.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void drawOutline(byte param0, int param1, int param2) {
        int var4 = param2 * this.left >> 12;
        int var5 = this.right * param2 >> 12;
        int var6 = this.top * param1 >> 12;
        int var8 = 62 % ((-48 - param0) / 40);
        int var7 = this.bottom * param1 >> 12;
        GetTorpedoEnergyUsed.a(var7, var4, this.outlineColor, var6, -2, var5, this.outlineWidth);
    }

    final void drawFilled(byte param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var4 = param1 * this.left >> 12;
        int var5 = this.right * param1 >> 12;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param0 == -112) {
          var6 = param2 * this.top >> 12;
          var7 = this.bottom * param2 >> 12;
          fcb.a(this.fillColor, var7, var6, var4, var5, (byte) -117);
          return;
        }
        TextureRectangleShape.a((byte) 92, -127, 80, 107);
        var6Lifetime1 = param2 * this.top >> 12;
        var7Lifetime1 = this.bottom * param2 >> 12;
        fcb.a(this.fillColor, var7Lifetime1, var6Lifetime1, var4, var5, (byte) -117);
    }

    final void drawFilledAndOutline(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4 = this.left * param2 >> 12;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param1 == 110) {
          var5 = this.right * param2 >> 12;
          var6 = param0 * this.top >> 12;
          var7 = this.bottom * param0 >> 12;
          SetMachineGunProjectileDamage.a(this.outlineWidth, var5, this.fillColor, var6, this.outlineColor, var4, var7, 0);
          return;
        }
        field_j = (String) null;
        var5Lifetime1 = this.right * param2 >> 12;
        var6Lifetime1 = param0 * this.top >> 12;
        var7Lifetime1 = this.bottom * param0 >> 12;
        SetMachineGunProjectileDamage.a(this.outlineWidth, var5Lifetime1, this.fillColor, var6Lifetime1, this.outlineColor, var4, var7Lifetime1, 0);
    }

    final static boolean a(int param0, int param1) {
        if (param0 >= 93) {
          return 2 <= param1 ? true : false;
        }
        field_j = (String) null;
        return 2 <= param1 ? true : false;
    }

    public static void clearSharedReferences(byte param0) {
        field_j = null;
        if (param0 == 89) {
          return;
        }
        TextureRectangleShape.clearSharedReferences((byte) 40);
    }

    static {
        field_j = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
