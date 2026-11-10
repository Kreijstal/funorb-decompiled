/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class CacheEntry extends DualLinkNode {
    static BinaryBitmapFont field_q;
    static String field_p;
    int field_r;

    abstract Object getValue(byte param0);

    public static void releaseStatics(int param0) {
        field_q = null;
        field_p = null;
        if (param0 <= 37) {
          CacheEntry.isAsciiDigit('ￔ', 125);
        }
    }

    final static TriangleMesh decodeMesh(BitPacketBuffer param0, byte param1) {
        int var7 = 0;
        TriangleMesh stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        TriangleMesh var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          var2_int = param0.readBits(99, 8);
          if (0 < var2_int) {
            throw new IllegalStateException("" + var2_int);
          }
          if (param1 >= -127) {
            CacheEntry.releaseStatics(95);
          }
          var3 = ProxyAuthException.readBitBoolean(param0, false) ? 1 : 0;
          var4 = ProxyAuthException.readBitBoolean(param0, false) ? 1 : 0;
          var5 = new TriangleMesh();
          var5.field_k = (short)param0.readBits(61, 16);
          var5.field_G = BitmapTextLayout.readPackedShorts(var5.field_G, true, 16, param0);
          var5.field_B = BitmapTextLayout.readPackedShorts(var5.field_B, true, 16, param0);
          var5.field_m = BitmapTextLayout.readPackedShorts(var5.field_m, true, 16, param0);
          var5.field_c = (short)param0.readBits(82, 16);
          var5.field_g = BitmapTextLayout.readPackedShorts(var5.field_g, true, 16, param0);
          var5.field_H = BitmapTextLayout.readPackedShorts(var5.field_H, true, 16, param0);
          var5.field_r = BitmapTextLayout.readPackedShorts(var5.field_r, true, 16, param0);
          if (var3 != 0) {
            var5.field_f = (short)param0.readBits(56, 16);
            var5.field_M = BitmapTextLayout.readPackedShorts(var5.field_M, true, 16, param0);
            var5.field_q = BitmapTextLayout.readPackedShorts(var5.field_q, true, 16, param0);
            var5.field_y = BitmapTextLayout.readPackedShorts(var5.field_y, true, 16, param0);
            var5.field_O = BitmapTextLayout.readPackedShorts(var5.field_O, true, 16, param0);
            var5.field_n = BitmapTextLayout.readPackedShorts(var5.field_n, true, 16, param0);
            var5.field_v = BitmapTextLayout.readPackedShorts(var5.field_v, true, 16, param0);
          }
          if (var4 != 0) {
            param0.readBits(13, 16);
            var5.field_K = BitmapTextLayout.readPackedShorts(var5.field_K, true, 16, param0);
            var5.field_d = BitmapTextLayout.readPackedShorts(var5.field_d, true, 16, param0);
            var5.field_h = BitmapTextLayout.readPackedShorts(var5.field_h, true, 16, param0);
            var5.field_l = BitmapTextLayout.readPackedShorts(var5.field_l, true, 16, param0);
            var5.field_w = BitmapTextLayout.readPackedShorts(var5.field_w, true, 16, param0);
          }
          if (ProxyAuthException.readBitBoolean(param0, false)) {
            var5.field_x = BitmapTextLayout.readPackedShorts(var5.field_x, true, 16, param0);
          }
          if (ProxyAuthException.readBitBoolean(param0, false)) {
            var5.field_F = AppletHostHelpers.readPackedByteArray(16, param0, (byte) -44, var5.field_F);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_F.length; var7++) {
              if ((255 & var5.field_F[var7]) > var6) {
                var6 = var5.field_F[var7] & 255;
              }
            }
            if (var6 != 0) {
              var5.field_p = (byte)(var6 + 1);
            } else {
              var5.field_F = null;
            }
          }
          stackIn_27_0 = var5;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("bj.G(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int getLegacyMenuHeight(boolean param0) {
        if (!param0) {
          field_p = (String) null;
        }
        return ArmedHuman.field_Mb;
    }

    final static boolean isClientReady(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 18840) {
          return false;
        }
        stackIn_6_0 = (10 <= AccountResultHelpers.field_a) && (AlternateLongAndNameCredentials.field_j >= 13);
        return stackIn_6_0;
    }

    final static boolean isAsciiDigit(char param0, int param1) {
        boolean stackIn_6_0 = false;
        if (param1 <= 44) {
          field_q = (BinaryBitmapFont) null;
        }
        stackIn_6_0 = (param0 >= 48) && (param0 <= 57);
        return stackIn_6_0;
    }

    CacheEntry(int param0) {
        this.field_r = param0;
    }

    final static Sprite[] loadFrameSprites(String param0, int param1, Js5Archive param2, String param3) {
        Sprite[] var4 = null;
        RuntimeException var4_ref = null;
        Sprite[] var5 = null;
        Sprite[] stackIn_2_0 = null;
        Sprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = ThreeSliceButtonPainter.loadSpritesByName((byte) 111, param3, param0, param2);
          var4 = var5;
          var5[3].field_q = var5[3].field_t;
          var5[1].field_r = var5[1].field_w;
          if (param1 > -117) {
            stackIn_2_0 = (Sprite[]) null;
            return stackIn_2_0;
          }
          var5[5].field_q = var5[5].field_t;
          var5[7].field_r = var5[7].field_w;
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("bj.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    abstract boolean isSoftReference(boolean param0);

    static {
        field_p = "Click";
    }
}
