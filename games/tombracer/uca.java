/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uca {
    int field_e;
    static double field_b;
    static IsaacCipher cosmeticRandom;
    static int field_a;
    static int field_d;
    static Sprite[] field_f;

    final static String a(String param0, byte param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        mu var7 = null;
        mu var8 = null;
        BitPacketBuffer var9 = null;
        CharSequence var10 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param0);
          if (!CurveOperator.isValidAccountName(true, var10)) {
            stackIn_3_0 = HiscoresScreen.field_v;
            return stackIn_3_0;
          }
          if (UiWidget.field_g != 2) {
            stackIn_6_0 = dga.field_b;
            return stackIn_6_0;
          }
          var8 = wp.findFriendByName(94, param0);
          if (var8 == null) {
            stackIn_10_0 = LegacyOpenGlFlowingWaterEffect.formatText(88, LegacyOpenGlCubeTexture.field_m, new String[]{param0});
            return stackIn_10_0;
          }
          if (param1 != 102) {
            field_d = 38;
          }
          PlayingSound.field_f.startForwardFrom(-13854, var8);
          while (true) {
            var7 = (mu) (PlayingSound.field_f.next(115));
            if (var7 != null) {
              var7.field_Db = var7.field_Db - 1;
              continue;
            }
            break;
          }
          var8.unlink(19);
          var8.unlinkSecondary(-7975);
          ii.field_a = ii.field_a - 1;
          var9 = ql.field_k;
          var9.writeCipheredOpcode(param2, param1 - 3090);
          var9.position = var9.position + 1;
          var5 = var9.position;
          var9.writeByte(1, 0);
          var9.writeString(param0, false);
          var9.backpatchByteLength(var9.position - var5, (byte) -113);
          stackIn_18_0 = null;
          return (String) (stackIn_18_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("uca.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = 79 / ((-50 - param0) / 48);
        field_f = null;
        cosmeticRandom = null;
    }

    final static void writeQueuedListRequest(int param0, toa param1, byte param2) {
        BitPacketBuffer var5 = null;
        int var4 = 0;
        try {
          var5 = ql.field_k;
          var5.writeCipheredOpcode(param0, -2988);
          var5.position = var5.position + 1;
          if (param2 != 93) {
            field_a = 32;
          }
          var4 = var5.position;
          var5.writeByte(1, 0);
          var5.writeByte(param1.field_i, 0);
          var5.writeSignedSmart(param2 ^ -5253, param1.field_k);
          var5.writeInt(param1.field_h, (byte) -22);
          var5.writeInt(param1.field_m, (byte) 102);
          var5.writeInt(param1.field_l, (byte) -1);
          var5.writeInt(param1.field_g, (byte) -90);
          var5.appendCrc32(var4, 64);
          var5.backpatchByteLength(-var4 + var5.position, (byte) -122);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "uca.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = Math.atan2(1.0, 0.0);
        cosmeticRandom = new IsaacCipher(new int[]{21312});
        field_a = -1;
    }
}
