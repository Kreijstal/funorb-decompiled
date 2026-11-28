/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static AccountRequestState field_b;
    static int[] field_a;
    static boolean field_c;

    public static void clearStaticReferences(byte param0) {
        if (param0 < 120) {
          field_b = (AccountRequestState) null;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        if (k.field_g == 10 ||
          !ej.a(12931)) {
          ModalDialog.d((byte) -117);
          k.field_g = 11;
        }
        lh.field_e = true;
        if (param0 < 1) {
          field_b = (AccountRequestState) null;
        }
    }

    final static Sprite[] c(byte param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var12;
        int[] var13;
        byte[] var16;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 16) {
          cf.a((byte) 37);
        }
        var1 = new Sprite[eg.field_c];
        for (var2 = 0; var2 < eg.field_c; var2++) {
          var3 = da.field_c[var2] * ra.field_ab[var2];
          var21 = cb.field_b[var2];
          if (!j.field_d[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var3 > var6; var6++) {
              var10[var6] = fk.field_d[BufferedRandomAccessFile.a(255, (int) var21[var6])];
            }
            var1[var2] = new Sprite(nj.field_d, qk.field_a, ValidatedTextField.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var22);
          } else {
            var16 = RichTextWidget.field_E[var2];
            var12 = var16;
            var9 = var12;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var7 < var3; var7++) {
              var6_ref_int__[var7] = bd.a(fk.field_d[BufferedRandomAccessFile.a(255, (int) var21[var7])], BufferedRandomAccessFile.a(var16[var7] << 24, -16777216));
            }
            var1[var2] = (Sprite) ((Object) new ArgbSprite(nj.field_d, qk.field_a, ValidatedTextField.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var17));
          }
        }
        gb.a(-54);
        return var1;
    }

    final static MouseWheelInput createMouseWheelInput(int param0) {
        try {
          Throwable var1 = null;
          MouseWheelInput stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != 255) {
              cf.c((byte) 16);
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

    static {
        int var0 = 0;
        int var1 = 0;
        field_b = new AccountRequestState();
        field_a = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
          var1 = var0 * 3 / 2 + var0;
          if (255 < var1) {
            var1 = 255;
          }
          field_a[var0] = BufferedRandomAccessFile.a(16746712, var1 << 16);
          field_a[var0] = bd.a(field_a[var0], BufferedRandomAccessFile.a(var0 * var0 >> 5, 1962934527) << 8);
        }
    }
}
