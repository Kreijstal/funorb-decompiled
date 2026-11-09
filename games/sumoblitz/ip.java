/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip extends ml {
    private byte[] field_x;
    static tf field_y;

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int incrementValue$0 = 0;
        if (param2 == 4096) {
          var4 = param1 * 2;
          var5 = param0 & 255;
          incrementValue$0 = var4;
          var4++;
          this.field_x[incrementValue$0] = (byte)(var5 * 3 >> 5);
          this.field_x[var4] = (byte)(var5 * 3 >> 5);
          return;
        }
    }

    ip() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final byte[] a(byte param0, int param1, int param2, int param3) {
        int var5 = 79 % ((param0 + 43) / 46);
        this.field_x = new byte[2 * (param3 * (param2 * param1))];
        this.a(param3, 206, param2, param1);
        return this.field_x;
    }

    final static void d(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!oj.a(false)) {
            if (null != CompactMeshGeometry.field_o &&
              CompactMeshGeometry.field_o.field_a) {
              ib.d(1);
              pu.field_e.pushDialog((byte) 113, new DisplayModeErrorDialog(pu.field_e, CachedArchiveProvider.field_e));
            }
            return;
          }
          pu.field_e.dispatchPointerInput(JaggrabDownloader.field_j, c.field_r, true, param0 - 1886067878);
          if (param0 != 1886067877) {
            ip.releaseStatics((byte) -127);
          }
          pu.field_e.advanceDialogAnimations(-104);
          while (wd.c(-81)) {
            pu.field_e.dispatchKey(WhirlpoolDigest.field_c, TextureCombineOperation.field_a, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "ip.D(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_y = null;
        if (param0 <= 53) {
          ip.releaseStatics((byte) -74);
        }
    }

    static {
        field_y = new tf();
    }
}
