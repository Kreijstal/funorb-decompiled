/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    int field_e;
    static String pleaseEnterYourAgeText;
    static boolean field_b;
    String field_f;
    ResourceArchive field_a;
    static boolean field_d;
    String field_h;
    String field_c;

    final static void a(int param0, boolean param1) {
        if (!param1) {
          byte[] var3 = (byte[]) null;
          gn.whirlpoolDigest((byte[]) null, (byte) -29, -53, 2);
        }
        PlayerDrone.playSample(-125, OpenGlCubeTexture.field_l[param0]);
    }

    final static byte[] whirlpoolDigest(byte[] bytes, byte guard, int offset, int length) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        WhirlpoolDigest var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard >= -98) {
            gn.a(-28, false);
          }
          if (offset > 0) {
            var8 = new byte[length];
            var4 = var8;
            for (var5_int = 0; var5_int < length; var5_int++) {
              var8[var5_int] = bytes[var5_int + offset];
            }
          } else {
            var4 = bytes;
          }
          var5 = new WhirlpoolDigest();
          var5.reset(-9);
          var5.updateBits(var4, 7, (long)(length * 8));
          var6 = new byte[64];
          var5.finish(0, var6, -25);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("gn.B(");
          if (bytes == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(',').append(offset).append(',').append(length).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        pleaseEnterYourAgeText = null;
        if (!param0) {
          byte[] var2 = (byte[]) null;
          gn.whirlpoolDigest((byte[]) null, (byte) -96, -56, 90);
        }
    }

    private gn() throws Throwable {
        throw new Error();
    }

    static {
        pleaseEnterYourAgeText = "Please enter your age in years";
    }
}
