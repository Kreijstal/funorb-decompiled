/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CushionSegment {
    static int field_k;
    int endKind;
    int startKind;
    static int[] field_i;
    int startY;
    static String timer;
    int endX;
    static boolean field_g;
    static Sprite field_h;
    int startX;
    int endY;
    static vh field_c;

    final static long d(byte param0) {
        if (param0 < 117) {
          CushionSegment.c((byte) 7);
          return rl.a((byte) -104) - ob.field_v;
        }
        return rl.a((byte) -104) - ob.field_v;
    }

    final static void b(byte param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var1 = 256;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        PasswordValidator.field_t[0] = (var1 >> 1) - ml.field_l[0];
        PasswordValidator.field_t[1] = -ml.field_l[1];
        PasswordValidator.field_t[2] = -ml.field_l[2] + var1;
        int var2 = PasswordValidator.field_t[1] * ml.field_l[4] + ml.field_l[3] * PasswordValidator.field_t[0] + ml.field_l[5] * PasswordValidator.field_t[2] >> 7;
        int var3 = PasswordValidator.field_t[2] * ml.field_l[8] + (ml.field_l[7] * PasswordValidator.field_t[1] + PasswordValidator.field_t[0] * ml.field_l[6]) >> 7;
        PasswordValidator.field_t[2] = ml.field_l[10] * PasswordValidator.field_t[1] + PasswordValidator.field_t[0] * ml.field_l[9] + ml.field_l[11] * PasswordValidator.field_t[2] >> 16;
        if (PasswordValidator.field_t[2] == 0) {
          PasswordValidator.field_t[2] = -1;
          PasswordValidator.field_t[1] = var3 / PasswordValidator.field_t[2] + 240;
          if (param0 < 75) {
            field_c = (vh) null;
          }
          PasswordValidator.field_t[0] = var2 / PasswordValidator.field_t[2] + 320;
          if (!(0 < PasswordValidator.field_t[2])) {
            return;
          }
          var4 = PasswordValidator.field_t[0];
          PasswordValidator.field_t[0] = -ml.field_l[0];
          var5 = PasswordValidator.field_t[1];
          PasswordValidator.field_t[2] = var1 - ml.field_l[2];
          PasswordValidator.field_t[1] = -ml.field_l[1];
          var6 = ml.field_l[4] * PasswordValidator.field_t[1] + (ml.field_l[3] * PasswordValidator.field_t[0] + PasswordValidator.field_t[2] * ml.field_l[5]) >> 7;
          var7 = ml.field_l[7] * PasswordValidator.field_t[1] + PasswordValidator.field_t[0] * ml.field_l[6] + ml.field_l[8] * PasswordValidator.field_t[2] >> 7;
          PasswordValidator.field_t[2] = PasswordValidator.field_t[2] * ml.field_l[11] + (PasswordValidator.field_t[0] * ml.field_l[9] + PasswordValidator.field_t[1] * ml.field_l[10]) >> 16;
          if (PasswordValidator.field_t[2] != 0) {
            PasswordValidator.field_t[0] = 320 + var6 / PasswordValidator.field_t[2];
            PasswordValidator.field_t[1] = var7 / PasswordValidator.field_t[2] + 240;
            if (PasswordValidator.field_t[2] > 0) {
              PoolUiText.field_d = ResizableDialog.c(PasswordValidator.field_t[0] - var4, var5 - PasswordValidator.field_t[1], 4096) << 3;
              return;
            }
            return;
          }
          PasswordValidator.field_t[2] = -1;
          PasswordValidator.field_t[0] = 320 + var6 / PasswordValidator.field_t[2];
          PasswordValidator.field_t[1] = var7 / PasswordValidator.field_t[2] + 240;
          if (PasswordValidator.field_t[2] > 0) {
            PoolUiText.field_d = ResizableDialog.c(PasswordValidator.field_t[0] - var4, var5 - PasswordValidator.field_t[1], 4096) << 3;
            return;
          }
          return;
        }
        PasswordValidator.field_t[1] = var3 / PasswordValidator.field_t[2] + 240;
        if (param0 < 75) {
          field_c = (vh) null;
          PasswordValidator.field_t[0] = var2 / PasswordValidator.field_t[2] + 320;
          if (!(0 < PasswordValidator.field_t[2])) {
            return;
          }
          var4Lifetime1 = PasswordValidator.field_t[0];
          PasswordValidator.field_t[0] = -ml.field_l[0];
          var5Lifetime1 = PasswordValidator.field_t[1];
          PasswordValidator.field_t[2] = var1 - ml.field_l[2];
          PasswordValidator.field_t[1] = -ml.field_l[1];
          var6Lifetime1 = ml.field_l[4] * PasswordValidator.field_t[1] + (ml.field_l[3] * PasswordValidator.field_t[0] + PasswordValidator.field_t[2] * ml.field_l[5]) >> 7;
          var7Lifetime1 = ml.field_l[7] * PasswordValidator.field_t[1] + PasswordValidator.field_t[0] * ml.field_l[6] + ml.field_l[8] * PasswordValidator.field_t[2] >> 7;
          PasswordValidator.field_t[2] = PasswordValidator.field_t[2] * ml.field_l[11] + (PasswordValidator.field_t[0] * ml.field_l[9] + PasswordValidator.field_t[1] * ml.field_l[10]) >> 16;
          if (PasswordValidator.field_t[2] != 0) {
            PasswordValidator.field_t[0] = 320 + var6Lifetime1 / PasswordValidator.field_t[2];
            PasswordValidator.field_t[1] = var7Lifetime1 / PasswordValidator.field_t[2] + 240;
            if (PasswordValidator.field_t[2] > 0) {
              PoolUiText.field_d = ResizableDialog.c(PasswordValidator.field_t[0] - var4Lifetime1, var5Lifetime1 - PasswordValidator.field_t[1], 4096) << 3;
              return;
            }
            return;
          }
          PasswordValidator.field_t[2] = -1;
          PasswordValidator.field_t[0] = 320 + var6Lifetime1 / PasswordValidator.field_t[2];
          PasswordValidator.field_t[1] = var7Lifetime1 / PasswordValidator.field_t[2] + 240;
          if (PasswordValidator.field_t[2] > 0) {
            PoolUiText.field_d = ResizableDialog.c(PasswordValidator.field_t[0] - var4Lifetime1, var5Lifetime1 - PasswordValidator.field_t[1], 4096) << 3;
            return;
          }
          return;
        }
        PasswordValidator.field_t[0] = var2 / PasswordValidator.field_t[2] + 320;
        if (!(0 < PasswordValidator.field_t[2])) {
          return;
        }
        var4Lifetime2 = PasswordValidator.field_t[0];
        PasswordValidator.field_t[0] = -ml.field_l[0];
        var5Lifetime2 = PasswordValidator.field_t[1];
        PasswordValidator.field_t[2] = var1 - ml.field_l[2];
        PasswordValidator.field_t[1] = -ml.field_l[1];
        var6Lifetime2 = ml.field_l[4] * PasswordValidator.field_t[1] + (ml.field_l[3] * PasswordValidator.field_t[0] + PasswordValidator.field_t[2] * ml.field_l[5]) >> 7;
        var7Lifetime2 = ml.field_l[7] * PasswordValidator.field_t[1] + PasswordValidator.field_t[0] * ml.field_l[6] + ml.field_l[8] * PasswordValidator.field_t[2] >> 7;
        PasswordValidator.field_t[2] = PasswordValidator.field_t[2] * ml.field_l[11] + (PasswordValidator.field_t[0] * ml.field_l[9] + PasswordValidator.field_t[1] * ml.field_l[10]) >> 16;
        if (PasswordValidator.field_t[2] == 0) {
          PasswordValidator.field_t[2] = -1;
          PasswordValidator.field_t[0] = 320 + var6Lifetime2 / PasswordValidator.field_t[2];
          PasswordValidator.field_t[1] = var7Lifetime2 / PasswordValidator.field_t[2] + 240;
          if (PasswordValidator.field_t[2] > 0) {
            PoolUiText.field_d = ResizableDialog.c(PasswordValidator.field_t[0] - var4Lifetime2, var5Lifetime2 - PasswordValidator.field_t[1], 4096) << 3;
            return;
          }
          return;
        }
        PasswordValidator.field_t[0] = 320 + var6Lifetime2 / PasswordValidator.field_t[2];
        PasswordValidator.field_t[1] = var7Lifetime2 / PasswordValidator.field_t[2] + 240;
        if (PasswordValidator.field_t[2] > 0) {
          PoolUiText.field_d = ResizableDialog.c(PasswordValidator.field_t[0] - var4Lifetime2, var5Lifetime2 - PasswordValidator.field_t[1], 4096) << 3;
          return;
        }
    }

    final int centerX(int param0) {
        if (param0 > 82) {
          return (this.endX + this.startX) / 2;
        }
        this.centerY((byte) -110);
        return (this.endX + this.startX) / 2;
    }

    public static void c(byte param0) {
        if (param0 >= 28) {
          timer = null;
          field_c = null;
          field_i = null;
          field_h = null;
          return;
        }
        field_k = -55;
        timer = null;
        field_c = null;
        field_i = null;
        field_h = null;
    }

    CushionSegment(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.endY = param3;
        this.endX = param2;
        this.startX = param0;
        this.startKind = param4;
        this.startY = param1;
        this.endKind = param5;
    }

    final int centerY(byte param0) {
        if (param0 == -127) {
          return (this.endY + this.startY) / 2;
        }
        this.startY = 107;
        return (this.endY + this.startY) / 2;
    }

    static {
        timer = "Timer";
        field_i = new int[12];
    }
}
