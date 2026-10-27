/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends IntrusiveNode {
    static int field_n;
    la[] field_r;
    int field_g;
    int field_i;
    byte[][][] field_l;
    int[] field_o;
    la[] field_p;
    static ab field_h;
    int[] field_m;
    static ph field_q;
    static int field_k;
    int[] field_j;

    final static String a(int param0, char param1, int param2) {
        int var6 = EscapeVector.obfuscationControl;
        char[] var7 = new char[param2];
        char[] var3 = var7;
        for (int var4 = 0; var7.length > var4; var4++) {
          var7[var4] = param1;
        }
        int var5 = 53 / ((49 - param0) / 63);
        return new String(var7);
    }

    final static void d(byte param0) {
        if (param0 >= -112) {
          mn.a(81, (byte) 59);
          boolean var1 = (lh.b((byte) 71));
          if (rc.field_a == null) {
            kh.a((var1), -1230, false);
            return;
          }
          int var2 = vh.f(98);
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
        int var2Lifetime1 = vh.f(98);
        if (rc.field_a.field_f != var2Lifetime1) {
          boolean var3Lifetime1 = (rc.field_a.field_h);
          kh.a((var1Lifetime1), -1230, (var3Lifetime1));
          return;
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 == 44) {
          if (bk.field_r != null) {
            bk.field_r.b(-1, param0);
          }
          return;
        }
        field_n = -42;
        if (bk.field_r != null) {
          bk.field_r.b(-1, param0);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var10 = EscapeVector.obfuscationControl;
        try {
          SoftwareRasterizer.e(param1, param2, 1 + param3, 10000536);
          SoftwareRasterizer.e(param1, param4 + param2, param3 + 1, 12105912);
          int var5_int = 1;
          int var6 = param4;
          if (SoftwareRasterizer.clipTop > var5_int + param2) {
            var5_int = SoftwareRasterizer.clipTop - param2;
          }
          if (param0 != -27951) {
            return;
          }
          if (param2 + var6 > SoftwareRasterizer.clipBottom) {
            var6 = -param2 + SoftwareRasterizer.clipBottom;
          }
          for (int var7 = var5_int; var6 > var7; var7++) {
            int var8 = var7 * 48 / param4 + 152;
            int var9 = var8 << 16 | var8 << 8 | var8;
            SoftwareRasterizer.pixels[param1 + SoftwareRasterizer.width * (var7 + param2)] = var9;
            SoftwareRasterizer.pixels[param3 + (param1 + (param2 + var7) * SoftwareRasterizer.width)] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5), "mn.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 < 70) {
          mn.a(86, -71, -62, 90, 61);
          field_q = null;
          return;
        }
        field_q = null;
    }

    mn() {
    }

    static {
    }
}
