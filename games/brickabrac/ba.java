/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ba extends DualLinkNode {
    static QuickChatParameterType field_B;
    static String field_x;
    static UiComponent field_v;
    static RgbSprite halloweenCharacterSprite;
    static String repeatRecipientName;
    static int field_w;
    static String field_y;
    static String field_u;

    ba() {
    }

    final static IndexedSprite[] a(int param0, int param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        IndexedSprite[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        IndexedSprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -58) {
            stackIn_2_0 = (IndexedSprite[]) null;
            return stackIn_2_0;
          }
          if (ln.decodeSpritesFromArchive(-125, param1, param3, param0)) {
            stackIn_7_0 = kk.buildIndexedSprites((byte) -2);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (IndexedSprite[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ba.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int b(boolean param0) {
        if (!param0) {
          ba.f(-108);
          return bg.field_r;
        }
        return bg.field_r;
    }

    final static void f(int param0) {
        fa var1 = (fa) (SoundCache.field_f.first(-39));
        if (var1 == null) {
          hn.a((byte) 106);
          return;
        }
        BitPacketBuffer var2 = jl.incomingPackets;
        var2.readInt(255);
        var2.readInt(255);
        var2.readInt(255);
        var2.readInt(255);
        if (param0 == -1) {
          var1.unlink((byte) 111);
          return;
        }
        halloweenCharacterSprite = (RgbSprite) null;
        var1.unlink((byte) 111);
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = -1;
          if (param1 != 9) {
            ba.b(false);
          }
          for (var5 = param2; param3 > var5; var5++) {
            var4_int = LevelCompleteScreen.field_D[(var4_int ^ param0[var5]) & 255] ^ var4_int >>> 8;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ba.IA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        halloweenCharacterSprite = null;
        field_B = null;
        field_x = null;
        repeatRecipientName = null;
        field_v = null;
        field_u = null;
        field_y = null;
        if (param0 > -98) {
          byte[] var2 = (byte[]) null;
          ba.a((byte[]) null, 51, 121, 59);
        }
    }

    static {
        field_x = "Your game";
        field_B = new QuickChatParameterType(9, 0, 4, 1);
        field_u = "To Level";
        field_y = "<%0> might change the options - wait and see.";
    }
}
