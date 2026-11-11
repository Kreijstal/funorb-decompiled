/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static SpriteData field_a;
    static String field_b;

    final static void writeQueuedRequest(cga param0, int param1, int param2) {
        BitPacketBuffer var5 = null;
        int var4 = 0;
        try {
          if (param2 > -116) {
            wj.releaseStatics((byte) 1);
          }
          var5 = ql.field_k;
          var5.writeCipheredOpcode(param1, -2988);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(1, 0);
          var5.writeByte(param0.field_j, 0);
          var5.writeByte(param0.field_o, 0);
          var5.writeInt(param0.field_k, (byte) -42);
          var5.writeInt(param0.field_h, (byte) -20);
          var5.writeInt(param0.field_m, (byte) -123);
          var5.writeInt(param0.field_n, (byte) 92);
          var5.appendCrc32(var4, 64);
          var5.backpatchByteLength(var5.position - var4, (byte) 16);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "wj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        String var7 = null;
        if (OpenGlUnderwaterEffect.field_q != param3) {
          var7 = lw.field_i;
        } else {
          var7 = jaa.field_a;
        }
        RidgedNoise3D.a(param6, param5, param1, (byte) 53, param0, param2, var7, param4);
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 35) {
          field_a = (SpriteData) null;
        }
    }

    static {
        field_b = "Treasure Values";
    }
}
