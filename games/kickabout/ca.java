/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static int[] field_f;
    static String[][] field_g;
    static String field_a;
    static String field_b;
    static String field_d;
    static String field_e;
    static ArgbSprite[] field_c;

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_g = (String[][]) null;
        field_e = null;
        field_a = null;
        field_f = null;
        if (param0 != -72) {
          ca.releaseStatics((byte) -95);
          return;
        }
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = null;
        CipherPacketBuffer var2Lifetime1;
        if (param0 == 3) {
          var2 = or.field_d;
          var2.b(param1, (byte) 119);
          var2.writeByte(124, 2);
          var2.writeByte(param0 ^ 106, 4);
          var2.writeByte(124, AuctionLogEntry.a(1315216324));
          return;
        }
        ca.isNameSeparator(false, 'F');
        var2Lifetime1 = or.field_d;
        var2Lifetime1.b(param1, (byte) 119);
        var2Lifetime1.writeByte(124, 2);
        var2Lifetime1.writeByte(param0 ^ 106, 4);
        var2Lifetime1.writeByte(124, AuctionLogEntry.a(1315216324));
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = Kickabout.field_G;
        try {
          if (param5 != 545806977) {
            return;
          }
          while (true) {
            param6--;
            if (0 > param6) {
              return;
            }
            var17 = param9;
            var10 = var17;
            var11 = param2;
            var12 = param4;
            var13 = param8;
            var14 = param3;
            var15 = 8355711 & var17[var11] >> 1;
            var10[var11] = TextLayoutLine.b(var13 >> 9, 65280) + TextLayoutLine.b(var12 >> 1, 16711680) + TextLayoutLine.b(255, var14 >> 17) + var15;
            param8 = param8 + param1;
            param3 = param3 + param7;
            param2++;
            param4 = param4 + param0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("ca.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void enqueueAuctionBidDialog(ReceivedAuctionItem param0, int param1) {
        try {
          ScrollPane.field_Jb.addLast(new AuctionBidDialog(param0, 37), param1 ^ 252);
          if (param1 != 255) {
            ReceivedAuctionItem var3 = (ReceivedAuctionItem) null;
            ca.enqueueAuctionBidDialog((ReceivedAuctionItem) null, 5);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ca.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean isNameSeparator(boolean param0, char param1) {
        if (param0) {
          return false;
        }
        if (param1 == 160) {
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (param1 == 95) {
          return true;
        }
        if (param1 != 45) {
          return false;
        }
        return true;
    }

    static {
        field_f = new int[]{3, 4, 3, 4, 5, 3, 4, 3, 3, 4, 3, 3, 4, 3, 3, 4, 5, 4, 4, 3, 1};
        field_b = "Macroing or use of bots";
        field_e = "You have not yet unlocked this option for use.";
        field_d = "Auction Info";
        field_a = "park";
    }
}
