/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingStatQuery extends IntrusiveNode {
    boolean field_s;
    int[] field_u;
    static boolean field_r;
    int field_t;
    static byte[] field_q;
    static int field_n;
    static AsyncRequest field_p;
    static BitmapFont field_o;

    public static void releaseStatics(byte param0) {
        if (param0 != 6) {
          return;
        }
        field_p = null;
        field_o = null;
        field_q = null;
    }

    final static ConditionalTextValue createLoginCredentials(int param0) {
        if (param0 <= 22) {
          return (ConditionalTextValue) null;
        }
        return new ConditionalTextValue(ViewportController.getCurrentAccountName(-11), FadingModalPanel.isEmailCheckIdle(-97));
    }

    final static boolean hasFeatureBit(int param0, byte param1) {
        if (param0 == -1) {
          return true;
        }
        if (param1 <= 104) {
          PendingStatQuery.createLoginCredentials(-75);
        }
        return (1 << param0 & RasterStackHelpers.field_a) != 0 ? true : false;
    }

    PendingStatQuery() {
        this.field_s = false;
    }

    final static GameRoomPanelHelpers validateEmailLocalPart(String param0, byte param1) {
        GameRoomPanelHelpers stackIn_6_0 = null;
        GameRoomPanelHelpers stackIn_10_0 = null;
        GameRoomPanelHelpers stackIn_15_0 = null;
        int stackIn_24_0 = 0;
        GameRoomPanelHelpers stackIn_28_0 = null;
        GameRoomPanelHelpers stackIn_42_0 = null;
        GameRoomPanelHelpers stackIn_46_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = TetraLink.field_J;
        try {
          if (param1 > -112) {
            PendingStatQuery.hasFeatureBit(-113, (byte) -111);
          }
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_6_0 = GraphicsSettings.field_o;
            return stackIn_6_0;
          }
          if (var2_int > 64) {
            stackIn_10_0 = ResizableDialog.field_V;
            return stackIn_10_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(var2_int - 1) != 34) {
              stackIn_15_0 = RsaKeyAndTextGlobals.field_h;
              return stackIn_15_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_24_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_24_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_28_0 = RsaKeyAndTextGlobals.field_h;
                  return stackIn_28_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (0 != var4Lifetime1 &&
                var4Lifetime1 != -1 + var2_int &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_42_0 = RsaKeyAndTextGlobals.field_h;
                return stackIn_42_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (ChatPanelSlideHelpers.field_c.indexOf(var5Lifetime1) == -1) {
                stackIn_46_0 = RsaKeyAndTextGlobals.field_h;
                return stackIn_46_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("cf.B(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = new byte[520];
        field_r = false;
    }
}
