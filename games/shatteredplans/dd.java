/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static String field_a;

    final static ChatMessage a(boolean param0, String param1, String param2, int param3, long param4) {
        RuntimeException var6 = null;
        jm stackIn_6_0 = null;
        PrivateChatMessage stackIn_8_0 = null;
        ChatMessage stackIn_11_0 = null;
        TargetedChatMessage stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == 0L &&
            param2 != null) {
            stackIn_8_0 = new PrivateChatMessage(param2, param1);
            return (ChatMessage) ((Object) stackIn_8_0);
          }
          if (param0) {
            stackIn_6_0 = new jm(param4, param1);
            return (ChatMessage) ((Object) stackIn_6_0);
          }
          if (param3 == 4684) {
            stackIn_13_0 = new TargetedChatMessage(param4, param1);
            return (ChatMessage) ((Object) stackIn_13_0);
          }
          stackIn_11_0 = (ChatMessage) null;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("dd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearStatics(int param0) {
        if (param0 != -14279) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = param3 + param2;
          var6 = param0 + param4;
          if (param3 <= SoftwareRasterizer.field_i) {
            stackIn_4_0 = SoftwareRasterizer.field_i;
          } else {
            stackIn_4_0 = param3;
          }
          var7 = stackIn_4_0;
          if (SoftwareRasterizer.field_a >= param4) {
            stackIn_7_0 = SoftwareRasterizer.field_a;
          } else {
            stackIn_7_0 = param4;
          }
          var8 = stackIn_7_0;
          if (SoftwareRasterizer.field_l <= var5_int) {
            stackIn_10_0 = SoftwareRasterizer.field_l;
          } else {
            stackIn_10_0 = var5_int;
          }
          var9 = stackIn_10_0;
          if (param1 != 1) {
            dd.clearStatics(-10);
          }
          if (SoftwareRasterizer.field_f > var6) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = SoftwareRasterizer.field_f;
          }
          var10 = stackIn_15_0;
          if (SoftwareRasterizer.field_i <= param3 &&
            SoftwareRasterizer.field_l > param3) {
            var11 = SoftwareRasterizer.field_b * var8 + param3;
            var12 = var10 + 1 - var8 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              SoftwareRasterizer.field_h[var11] = 16777215;
              var11 = var11 + SoftwareRasterizer.field_b * 2;
            }
          }
          if (param4 >= SoftwareRasterizer.field_a &&
            SoftwareRasterizer.field_f > var6) {
            var11Lifetime1 = var7 + param4 * SoftwareRasterizer.field_b;
            var12Lifetime1 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              SoftwareRasterizer.field_h[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (SoftwareRasterizer.field_i <= var5_int &&
            var5_int < SoftwareRasterizer.field_l) {
            var11Lifetime2 = SoftwareRasterizer.field_b * ((1 & var5_int - param3) + var8) + var5_int;
            var12Lifetime2 = 1 - (-var10 + var8) >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              SoftwareRasterizer.field_h[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + SoftwareRasterizer.field_b * 2;
            }
          }
          if (param4 >= SoftwareRasterizer.field_a &&
            SoftwareRasterizer.field_f > var6) {
            var11Lifetime3 = (1 & var6 - param4) + (var6 * SoftwareRasterizer.field_b + var7);
            var12Lifetime3 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime3--;
              if (0 > var12Lifetime3) {
                return;
              }
              SoftwareRasterizer.field_h[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var5), "dd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        fb var4 = null;
        CipherPacketBuffer var5 = null;
        int var3 = -27 % ((12 - param2) / 47);
        if (param0 != GameApplet.field_g) {
          var4 = (fb) (IsaacBackedRandom.field_b.get(65280, (long)GameApplet.field_g));
          GameApplet.field_g = param0;
          if (var4 != null) {
            var4.field_jc = null;
          }
          var5 = js.field_f;
          var5.h(param1, 255);
          var5.writeByte(3, (byte) -92);
          var5.writeByte(11, (byte) -69);
          var5.writeShort(param0, 255);
        }
    }

    static {
        field_a = "Cancel";
    }
}
