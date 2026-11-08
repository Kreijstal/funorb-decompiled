/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FriendRemovalSupport {
    static int field_e;
    static UiLayoutNode[] field_d;
    static MeshData field_f;
    static String field_b;
    static String field_c;
    static int field_a;

    public static void releaseStatics(boolean param0) {
        field_f = null;
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0) {
          field_f = (MeshData) null;
        }
    }

    final static String requestFriendRemoval(int param0, byte param1, String param2) {
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        SocialPlayerRow var7 = null;
        SocialPlayerRow var8 = null;
        CipherPacketBuffer var9 = null;
        CharSequence var10 = null;
        var6 = Kickabout.field_G;
        try {
          var10 = (CharSequence) ((Object) param2);
          if (!AnimationFrameset.isAllowedDisplayName(var10, -9907)) {
            stackIn_4_0 = SquadSlotWidget.field_Ib;
            return stackIn_4_0;
          }
          if (PitchCoordinateSupport.field_d != 2) {
            stackIn_7_0 = CanvasResizePolicy.field_t;
            return stackIn_7_0;
          }
          var8 = ClientUiOverlay.a(param2, (byte) 40);
          if (var8 == null) {
            stackIn_11_0 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, AuctionPriceLimits.field_c, new String[]{param2});
            return stackIn_11_0;
          }
          GameplayHelpScreen.field_I.b(-7584, var8);
          while (true) {
            var7 = (SocialPlayerRow) (GameplayHelpScreen.field_I.c(33));
            if (var7 != null) {
              var7.listIndex = var7.listIndex - 1;
              continue;
            }
            break;
          }
          var8.c((byte) -109);
          var8.unlinkSecondary(25);
          ListingRow.field_d = ListingRow.field_d - 1;
          var9 = or.field_d;
          var9.b(param0, (byte) -85);
          var9.field_n = var9.field_n + 1;
          var5 = var9.field_n;
          var9.writeByte(123, 1);
          var9.writeString(14190, param2);
          if (param1 < 4) {
            FriendRemovalSupport.releaseStatics(false);
          }
          var9.backpatchByteLength(62, var9.field_n - var5);
          stackIn_18_0 = null;
          return (String) (stackIn_18_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("of.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_c = "lost";
        field_b = "<%0> is already on your ignore list.";
    }
}
