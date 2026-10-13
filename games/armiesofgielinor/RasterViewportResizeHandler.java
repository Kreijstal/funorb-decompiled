/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RasterViewportResizeHandler implements ViewportResizeListener {
    static String field_e;
    static int field_d;
    static boolean field_b;
    static int field_a;
    static int field_c;

    public static void a(int param0) {
        if (param0 != 960112080) {
          PacketBuffer var2 = (PacketBuffer) null;
          RasterViewportResizeHandler.readNullableUnsignedByteArray((PacketBuffer) null, (byte) 105);
        }
        field_e = null;
    }

    final static int[] readNullableUnsignedByteArray(PacketBuffer packet, byte obfuscationGuard) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var5 = 0;
        int[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = packet.readUnsignedByte(obfuscationGuard ^ -98);
          if (var2_int == 0) {
            return null;
          }
          var3 = new int[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            var3[var4] = packet.readUnsignedByte(0);
          }
          if (obfuscationGuard != -98) {
            RasterViewportResizeHandler.a(4);
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ev.D(");
          if (packet == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public void viewportResized(int height, int obfuscationGuard, int width) {
        if (obfuscationGuard != -32263) {
          return;
        }
        ActionSpell.resizeRasterViewport(width, obfuscationGuard ^ -9688, height);
    }

    final static int multiplyFixed16(int obfuscationGuard, int left, int right) {
        int rightInteger = right >> 16;
        if (obfuscationGuard >= -33) {
          field_e = (String) null;
        }
        int rightFraction = 65535 & right;
        int leftInteger = left >> 16;
        int leftFraction = left & 65535;
        return leftInteger * rightFraction + left * rightInteger + (leftFraction * rightFraction >> 16);
    }

    static {
        field_d = -1;
        field_e = "Join <%0>'s game";
        field_a = 0;
        field_c = 0;
    }
}
