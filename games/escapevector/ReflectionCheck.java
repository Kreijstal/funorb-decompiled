/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheck extends IntrusiveNode {
    static int field_n;
    SystemTask[] fieldTasks;
    int id;
    int operationCount;
    byte[][][] serializedArguments;
    int[] errors;
    SystemTask[] methodTasks;
    static CoverageBitmapFont field_h;
    int[] operations;
    static ph field_q;
    static int field_k;
    int[] replacementValues;

    final static String repeatChar(int guard, char character, int count) {
        int var6 = EscapeVector.obfuscationControl;
        char[] var7 = new char[count];
        char[] var3 = var7;
        for (int var4 = 0; var7.length > var4; var4++) {
          var7[var4] = character;
        }
        int var5 = 53 / ((49 - guard) / 63);
        return new String(var7);
    }

    final static void d(byte param0) {
        if (param0 >= -112) {
          ReflectionCheck.a(81, (byte) 59);
          boolean var1 = (lh.b((byte) 71));
          if (rc.field_a == null) {
            kh.a((var1), -1230, false);
            return;
          }
          int var2 = Bullet.accountStateIndex(98);
          if (rc.field_a.field_f != var2) {
            boolean var3 = (rc.field_a.field_h);
            kh.a((var1), -1230, (var3));
            return;
          }
          return;
        }
        boolean var1Lifetime1 = (lh.b((byte) 71));
        if (rc.field_a == null) {
          kh.a((var1Lifetime1), -1230, false);
          return;
        }
        int var2Lifetime1 = Bullet.accountStateIndex(98);
        if (rc.field_a.field_f != var2Lifetime1) {
          boolean var3Lifetime1 = (rc.field_a.field_h);
          kh.a((var1Lifetime1), -1230, (var3Lifetime1));
          return;
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 == 44) {
          if (SocketJs5Transport.field_r != null) {
            SocketJs5Transport.field_r.b(-1, param0);
          }
          return;
        }
        field_n = -42;
        if (SocketJs5Transport.field_r != null) {
          SocketJs5Transport.field_r.b(-1, param0);
        }
    }

    final static void drawGradientOutline(int guard, int x, int y, int width, int height) {
        int var10 = EscapeVector.obfuscationControl;
        try {
          SoftwareRasterizer.drawHorizontalLine(x, y, 1 + width, 10000536);
          SoftwareRasterizer.drawHorizontalLine(x, height + y, width + 1, 12105912);
          int var5_int = 1;
          int var6 = height;
          if (SoftwareRasterizer.clipTop > var5_int + y) {
            var5_int = SoftwareRasterizer.clipTop - y;
          }
          if (guard != -27951) {
            return;
          }
          if (y + var6 > SoftwareRasterizer.clipBottom) {
            var6 = -y + SoftwareRasterizer.clipBottom;
          }
          for (int var7 = var5_int; var6 > var7; var7++) {
            int var8 = var7 * 48 / height + 152;
            int var9 = var8 << 16 | var8 << 8 | var8;
            SoftwareRasterizer.pixels[x + SoftwareRasterizer.width * (var7 + y)] = var9;
            SoftwareRasterizer.pixels[width + (x + (y + var7) * SoftwareRasterizer.width)] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5), "mn.D(" + guard + ',' + x + ',' + y + ',' + width + ',' + height + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_h = null;
        if (guard < 70) {
          ReflectionCheck.drawGradientOutline(86, -71, -62, 90, 61);
          field_q = null;
          return;
        }
        field_q = null;
    }

    ReflectionCheck() {
    }

    static {
    }
}
